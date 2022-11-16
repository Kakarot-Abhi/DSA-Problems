package utils.templateUI.temp;

import com.alee.laf.WebLookAndFeel;
import org.apache.commons.lang3.StringUtils;
import utils.TemplateData;
import utils.TemplateGenerator;
import utils.templateUI.templateUtils.PackageUtility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class TemplateFrame extends JFrame implements ActionListener {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 30;
    private static String PACKAGE1 = "PACKAGE1";
    private static String PACKAGE2 = "PACKAGE2";
    private static String RETURN_TYPE = "RETURN_TYPE";
    private static String PREVIEW = "PREVIEW";
    private static String GENERATE = "GENERATE";
    private Container container;
    private JLabel titleJlabel;
    private JLabel outerPackageJlabel;
    private JComboBox<String> level1ComboBox = new JComboBox<>();
    private JComboBox<String> level2ComboBox = new JComboBox<>();
    private JLabel problemNameJlabel;
    private JTextField problemNameJtextField = new JTextField();
    private JLabel javaFileNameJlabel;
    private JTextField javaFileNameJtextField = new JTextField();
    private JLabel methodNameJlabel;
    private JTextField methodNameJtextField = new JTextField();
    private JLabel methodReturnTypeJlabel;
    private JComboBox<String> methodReturnTypeComboBox = new JComboBox<>();
    private JLabel methodReturnStatementJlabel;
    private JTextField methodReturnStatementJtextField = new JTextField();
    private JLabel methodArgsJlabel;
    private JTextField methodArgsJtextField = new JTextField();
    private JLabel problemStatementJlabel;
    private JTextArea problemStatementJtextarea = new JTextArea();
    private JButton previewJButton = new JButton();
    private JButton generateJButton = new JButton();
    private JLabel mainFileJLabel;
    private JTextArea mainFileTextArea = new JTextArea();
    private JLabel testFileJLabel;
    private JTextArea testFileTextArea = new JTextArea();
    private DefaultComboBoxModel<String> level1Model = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> level2Model = new DefaultComboBoxModel<>();
    private TemplateGenerator templateGenerator;

    public TemplateFrame() throws Exception {
        initUI();
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> WebLookAndFeel.install());
        new TemplateFrame();
    }

    public void initUI() throws Exception {

        setTitle("Problem Template Creator");
        setBounds(300, 90, 1100, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        container = getContentPane();
        container.setLayout(null);

        int relativeX = 10;
        int relativeY = 60;

        createJlabel(titleJlabel, "Problem Template Creator", WIDTH, HEIGHT, 300, 30, container);


        createJlabel(outerPackageJlabel, "Package", WIDTH, HEIGHT, relativeX, relativeY, container);

        int locationX = relativeX + (WIDTH / 2) + 10;

        createJComboBox(level1ComboBox, WIDTH / 2, HEIGHT, locationX, relativeY, container, this, PACKAGE1, null);
        level1ComboBox.setEditable(true);
        PackageUtility.getLevel1Package().stream().forEach(d -> level1Model.addElement(d));

        level1ComboBox.setModel(level1Model);

        createJComboBox(level2ComboBox, WIDTH / 2, HEIGHT, locationX + (WIDTH / 2), relativeY, container, this, PACKAGE2, null);
        level2ComboBox.setEditable(true);
        PackageUtility.getLevel2Package(PackageUtility.getLevel1Package().get(0)).stream().forEach(d -> level2Model.addElement(d));
        level2ComboBox.setModel(level2Model);
        relativeY += 30;

        createJlabel(problemNameJlabel, "Problem Name", WIDTH, HEIGHT, relativeX, relativeY, container);
        createJtextField(problemNameJtextField, WIDTH, HEIGHT, locationX, relativeY, container);

        relativeY += 30;

        createJlabel(javaFileNameJlabel, "Java File Name", WIDTH, HEIGHT, relativeX, relativeY, container);
        createJtextField(javaFileNameJtextField, WIDTH, HEIGHT, locationX, relativeY, container);

        javaFileNameJtextField.setText("Approach1");

        relativeY += 30;

        createJlabel(methodNameJlabel, "Method Name", WIDTH, HEIGHT, relativeX, relativeY, container);
        createJtextField(methodNameJtextField, WIDTH, HEIGHT, locationX, relativeY, container);

        relativeY += 30;

        createJlabel(methodReturnTypeJlabel, "Method Return Type", WIDTH, HEIGHT, relativeX, relativeY, container);

        String[] data = {"int", "int[]", "void ", "boolean"};

        createJComboBox(methodReturnTypeComboBox, WIDTH, HEIGHT, locationX, relativeY, container, this, RETURN_TYPE, data);

        methodReturnTypeComboBox.setEditable(true);

        relativeY += 30;

        createJlabel(methodReturnStatementJlabel, "Method return statement", WIDTH, HEIGHT, relativeX, relativeY, container);
        createJtextField(methodReturnStatementJtextField, WIDTH, HEIGHT, locationX, relativeY, container);

        relativeY += 30;

        createJlabel(methodArgsJlabel, "Method Args", WIDTH, HEIGHT, relativeX, relativeY, container);
        createJtextField(methodArgsJtextField, WIDTH, HEIGHT, locationX, relativeY, container);

        relativeY += 30;

        createJlabel(problemStatementJlabel, "Problem Statement", WIDTH, HEIGHT, relativeX, relativeY, container);
        createJtextArea(problemStatementJtextarea, WIDTH, HEIGHT * 3, locationX, relativeY, container);

        relativeY = relativeY + 20 + (HEIGHT * 3);

        createJButton(previewJButton, WIDTH / 2, HEIGHT, relativeX + 75, relativeY, container, "Preview");
        previewJButton.setActionCommand(PREVIEW);

        createJButton(generateJButton, WIDTH / 2, HEIGHT, locationX + 75, relativeY, container, "Generate");
        generateJButton.setActionCommand(GENERATE);


        createJtextArea(mainFileTextArea, WIDTH + 100, HEIGHT * 4, 500, 90, container);

        createJtextArea(testFileTextArea, WIDTH + 100, HEIGHT * 4, 500, 240, container);

        setVisible(true);
    }

    public void createJComboBox(JComboBox jComboBox, int width, int height, int locationX, int locationY, Container container, ActionListener actionListner, String actionCommand, Object[] data) {
        if (jComboBox == null)
            jComboBox = new JComboBox();
        jComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        jComboBox.setSize(width, height);
        jComboBox.setLocation(locationX, locationY);
        jComboBox.setActionCommand(actionCommand);
        if (data != null)
            Arrays.stream(data).forEach(jComboBox::addItem);
        jComboBox.addActionListener(actionListner);
        container.add(jComboBox);
    }

    public void createJtextField(JTextField textField, int width, int height, int locationX, int locationY, Container container) {
        if (textField == null)
            textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 15));
        textField.setSize(width, height);
        textField.setLocation(locationX, locationY);
        container.add(textField);
    }

    public void createJButton(JButton jButton, int width, int height, int locationX, int locationY, Container container, String name) {
        if (jButton == null)
            jButton = new JButton();
        jButton.setText(name);
        jButton.setFont(new Font("Arial", Font.PLAIN, 15));
        jButton.setSize(width, height);
        jButton.setLocation(locationX, locationY);
        jButton.addActionListener(this);
        container.add(jButton);
    }

    public void createJtextArea(JTextArea jTextArea, int width, int height, int locationX, int locationY, Container container) {
        if (jTextArea == null)
            jTextArea = new JTextArea();
        jTextArea.setFont(new Font("Arial", Font.PLAIN, 15));
        jTextArea.setSize(width, height);
        jTextArea.setLocation(locationX, locationY);
        jTextArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(jTextArea);
        scrollPane.setVisible(true);

        scrollPane.setSize(width, height);
        scrollPane.setLocation(locationX, locationY);

        container.add(scrollPane);
    }

    public void createJlabel(JLabel jLabel, String title, int width, int height, int locationX, int locationY, Container container) {
        jLabel = new JLabel(title);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        jLabel.setSize(width, height);
        jLabel.setLocation(locationX, locationY);
        container.add(jLabel);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (StringUtils.equals(actionCommand, PREVIEW) || StringUtils.equals(actionCommand, GENERATE)) {
            if (isAnyFieldBlank()) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (StringUtils.equals(actionCommand, PREVIEW)) {
                generateTemplate();
            } else {

                if (StringUtils.isAnyBlank(mainFileTextArea.getText(), testFileTextArea.getText())) {
                    JOptionPane.showMessageDialog(this, "Please click preview first", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                templateGenerator.createFilesAndWriteToFiles(mainFileTextArea.getText(), testFileTextArea.getText());

                JOptionPane.showMessageDialog(this, "Template created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);

            }


        }

        System.out.println(actionCommand);


        if (StringUtils.equals(actionCommand, PACKAGE1)) {
            level2Model.removeAllElements();
            try {
                PackageUtility.getLevel2Package((String) level1Model.getSelectedItem()).stream().forEach(level2Model::addElement);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    private void generateTemplate() {
        String outerPackage = String.join("\\", (String) level1ComboBox.getSelectedItem(), (String) level2ComboBox.getSelectedItem());
        String problemName = problemNameJtextField.getText().replace(" ", "_");
        String javaFileName = javaFileNameJtextField.getText();
        String methodName = methodNameJtextField.getText();
        String returnType = (String) methodReturnTypeComboBox.getSelectedItem();
        String returnStatement = methodReturnStatementJtextField.getText();
        String arguments = methodArgsJtextField.getText();
        String problemStatement = problemStatementJtextarea.getText();

        TemplateData templateData = new TemplateData(outerPackage, problemName, javaFileName, methodName, returnType, returnStatement, arguments);
        templateData.setProblemStatementQuestion(problemStatement);

        templateGenerator = new TemplateGenerator(templateData);
        String[] fileData = templateGenerator.startCreatingTemplate();

        mainFileTextArea.setText(fileData[0]);
        testFileTextArea.setText(fileData[1]);
    }

    private boolean isAnyFieldBlank() {
        return StringUtils.isAnyBlank(
                problemNameJtextField.getText(),
                javaFileNameJtextField.getText(),
                methodNameJtextField.getText(),
                methodReturnStatementJtextField.getText(),
                methodArgsJtextField.getText(),
                problemStatementJtextarea.getText()
        );
    }
}
