package utils;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import sun.misc.IOUtils;
import utils.templateUI.PopUp;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

// Note this class need to be run from intellijIdea only
public class TemplateGenerator {

    String str = "C:\\Users\\abhmishr16\\Downloads\\SpringBootMicroservices\\DSA-Problems\\src\\main\\java\\Array\\Easy\\Find_all_pairs_with_a_given_sum";
    String str1 = "C:\\Users\\abhmishr16\\Downloads\\SpringBootMicroservices\\DSA-Problems\\src\\test\\java\\Array\\Easy\\Find_all_pairs_with_a_given_sum";
    //C:\Users\abhmishr16\Downloads\SpringBootMicroservices\DSA-Problems
    private String projectPath = new File("").getAbsolutePath();
    private String src = "src";
    private String mainPath = "main";
    private String resourcePath = "resources";
    private String testPath = "test";
    private String initialPackage = "Array\\Easy";
    private String ArraysEasyPath = "java\\" + initialPackage;
    private String templateUtilsPath = "template";

    private String problemName = "tempPackage";
    private String packageName = problemName.replace(" ", "_");
    private String mainFileName = "TempMain";
    private String testFileName = mainFileName + "Test";

    private String javaExt = "java";
    private String testTemplateName = "Test.template";
    private String mainTemplateName = "Solve.template";
    private String methodName = "test";
    private String methodReturnType = "void";
    private String methodReturnStatement = "";
    private String methodAllArgs = "";
    //C:\Users\abhmishr16\Downloads\SpringBootMicroservices\DSA-Problems\src\main\java\Array\Easy\Find_all_pairs_with_a_given_sum

    private boolean isProblemStatementRequired = true;

    private String problemStatementQuestion = "";

    /*
    BLACK	\u001B[30m	BLACK_BACKGROUND	\u001B[40m
RED	\u001B[31m	RED_BACKGROUND	\u001B[41m
GREEN	\u001B[32m	GREEN_BACKGROUND	\u001B[42m
YELLOW	\u001B[33m	YELLOW_BACKGROUND	\u001B[43m
BLUE	\u001B[34m	BLUE_BACKGROUND	\u001B[44m
PURPLE	\u001B[35m	PURPLE_BACKGROUND	\u001B[45m
CYAN	\u001B[36m	CYAN_BACKGROUND	\u001B[46m
WHITE	\u001B[37m	WHITE_BACKGROUND	\u001B[47m
     */


    public TemplateGenerator(TemplateData templateData) {
        initialPackage = templateData.getInitialPackage();
        packageName = templateData.getProblemName();
        problemName = packageName.replace("_", " ");
        mainFileName = templateData.getMainFileName();
        methodName = templateData.getMethodName();
        methodReturnType = templateData.getMethodReturnType();
        methodReturnStatement = templateData.getMethodReturnStatement();
        methodAllArgs = templateData.getMethodAllArgs();
        problemStatementQuestion = templateData.getProblemStatementQuestion();

        startCreatingTemplate();
    }

    public TemplateGenerator() {
        startCreatingTemplate();
    }

    public static void main(String[] args) {

        TemplateData templateData = new TemplateData();
        templateData.setInitialPackage("Array\\Easy");
        templateData.setProblemName("This is Dummy Problem");
        templateData.setMainFileName("Approach1");
        templateData.setMethodName("test");
        templateData.setMethodAllArgs("");
        templateData.setMethodReturnType("void");
        templateData.setMethodReturnStatement("");

        new TemplateGenerator(templateData);
    }

    private void startCreatingTemplate() {
        String mainFileContents = getMainFileContents();
        String testFileContents = getTestFileContents();

        testFileContents = getUpdateTestFileContents(testFileContents);
        mainFileContents = getUpdateMainFileContents(mainFileContents);


        File f = new File("temp.text");

        createNecessaryFiles(isProblemStatementRequired);
        writeDataToNecessaryFiles(mainFileContents, testFileContents, problemStatementQuestion, isProblemStatementRequired);
//
        String dataForReadmeFile = "[" + problemName + "](src/main/java/" + initialPackage.replace("\\", "/") + "/" + packageName + "/" + mainFileName + ".java)\n" +
                "||  [Problem Statement](src/main/resources/" + initialPackage.replace("\\", "/") + "/" + packageName + ".md)";

        System.out.println(ANSIColorCode.RED
                + "Please paste below contents to readme file. Note - content are already in clipboard (simply go to readme file and paste it.)\n "
                + ANSIColorCode.ANSI_RESET);

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(dataForReadmeFile), new StringSelection(dataForReadmeFile));

        System.out.println(
                ANSIColorCode.BLACK
                        + dataForReadmeFile
                        + ANSIColorCode.ANSI_RESET);

        PopUp dialog = new PopUp();
        dialog.textArea1.setText(dataForReadmeFile);
        dialog.pack();
        dialog.setVisible(true);
    }

    public String getProblemStatmentFilePath() {
        return String.join("\\", projectPath, src, mainPath, resourcePath, initialPackage, packageName + ".md");
    }

    private String getUpdateTestFileContents(String test) {


        String endPackageRenamed = StringUtils.replace(test, "#LAST_PACKAGE#", packageName);
        endPackageRenamed = StringUtils.replace(endPackageRenamed, "#LAST_PACKAGE_#", "\"" + packageName + "\"");
        String initPackageRenamed = StringUtils.replace(endPackageRenamed, "#INITIAL_PACKAGE#", initialPackage.replace("\\", "."));
        String classRenamed = StringUtils.replace(initPackageRenamed, "#CLASS_NAME#", mainFileName);
        String methodRenamed = StringUtils.replace(classRenamed, "#METHOD_NAME#", methodName);
        String AllArgsRenamed = StringUtils.replace(methodRenamed, "#TEST_ALL_ARGS#", methodAllArgs);
        String classNameLowerCse = StringUtils.replace(AllArgsRenamed, "#CLASS_NAME_LOWER_CASE#", mainFileName.toLowerCase());
        return classNameLowerCse;
    }

    private String getUpdateMainFileContents(String main) {

        String endPackageRenamed = StringUtils.replace(main, "#LAST_PACKAGE#", packageName);
        String initPackageRenamed = StringUtils.replace(endPackageRenamed, "#INITIAL_PACKAGE#", initialPackage.replace("\\", "."));
        String classRenamed = StringUtils.replace(initPackageRenamed, "#CLASS_NAME#", mainFileName);
        String methodRenamed = StringUtils.replace(classRenamed, "#METHOD_NAME#", methodName);
        String returnTypeRenamed = StringUtils.replace(methodRenamed, "#RETURN_TYPE#", methodReturnType);
        String returnStatementRenamed = StringUtils.replace(returnTypeRenamed, "#RETURN_STATEMENT#", methodReturnStatement);
        String AllArgsRenamed = StringUtils.replace(returnStatementRenamed, "#ALL_ARGS#", methodAllArgs);
        return AllArgsRenamed;
    }

    public void writeToFile(String path, String data) {
        try {
            FileUtils.writeLines(new File(path), Arrays.asList(data));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeDataToNecessaryFiles(String mainData, String TestData, String problemStatementData, boolean isProblemStatementRequired) {
        String mainTemplatePath = getPackagePathForMain() + "." + javaExt;
        String testTemplatePath = getPackagePathForTest() + "." + javaExt;
        String problemStatementFile = getProblemStatmentFilePath();

        writeToFile(mainTemplatePath, mainData);
        writeToFile(testTemplatePath, TestData);

        if (isProblemStatementRequired)
            writeToFile(problemStatementFile, problemStatementData);
    }

    public void createNecessaryFiles(boolean isProblemStatementRequired) {
        String mainTemplatePath = getPackagePathForMain() + "." + javaExt;
        String testTemplatePath = getPackagePathForTest() + "." + javaExt;

        String problemStatementFile = getProblemStatmentFilePath();

        try {
            createFile(mainTemplatePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            createFile(testTemplatePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (isProblemStatementRequired) {
            try {
                createFile(problemStatementFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void createFile(String filePath) throws IOException {
        File file = new File(filePath);
        Files.createFile(Files.createDirectories(file.getParentFile().toPath()).resolve(file.toPath()));
    }

    public String readFileAsString(String path) {
        try {
            return new String(IOUtils.readAllBytes(new FileInputStream(new File(path))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getMainFileContents() {
        return readFileAsString(getMainTemplatePath());
    }

    public String getTestFileContents() {
        return readFileAsString(getTestTemplatePath());
    }

    public String getMainTemplatePath() {
        return String.join("\\", projectPath, src, mainPath, resourcePath, templateUtilsPath, mainPath, mainTemplateName);
    }

    public String getTestTemplatePath() {
        return String.join("\\", projectPath, src, mainPath, resourcePath, templateUtilsPath, testPath, testTemplateName);
    }

    public String getPackagePathForMain() {
        return String.join("\\", projectPath, src, mainPath, ArraysEasyPath, packageName, mainFileName);
    }

    public String getPackagePathForTest() {
        return String.join("\\", projectPath, src, testPath, ArraysEasyPath, packageName, mainFileName + "Test");
    }
}
