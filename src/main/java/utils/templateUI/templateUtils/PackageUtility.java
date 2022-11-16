package utils.templateUI.templateUtils;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PackageUtility {

    private static File currentLevelFile = new File("");

    private static String level1Path = String.join("\\", currentLevelFile.getAbsolutePath(), "src", "main", "java");

    public static void main(String[] args) throws Exception {

    }

    public static List<String> getLevel1Package() {
        List<String> level1Packages = Arrays.stream(new File(level1Path).listFiles(pathname -> pathname.isDirectory())).map(File::getName).collect(Collectors.toList());
        return level1Packages;
    }

    public static List<String> getLevel2Package(String levelPackageName) throws Exception {
        if (StringUtils.isEmpty(levelPackageName))
            throw new Exception("Invalid level 1 package");

        return Arrays.stream(new File(level1Path + "\\" + levelPackageName).listFiles(pathname -> pathname.isDirectory())).map(File::getName).collect(Collectors.toList());
    }
}
