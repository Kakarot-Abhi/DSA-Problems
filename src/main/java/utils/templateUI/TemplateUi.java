package utils.templateUI;

import utils.TemplateData;
import utils.TemplateGenerator;

import javax.swing.*;

public class TemplateUi extends JFrame {
    private JTextField outerPackage;
    private JTextField problemName;
    private JTextField javaFileName;
    private JTextField methodName;
    private JTextField methodReturnType;
    private JTextField methodReturnStatement;
    private JTextField methodArgs;
    private JPanel panel;
    private JButton generate;
    private JTextArea problemStatementQuestion;

    public TemplateUi() {
        outerPackage.setText("Array\\Easy");
        javaFileName.setText("Approach1");
        methodReturnType.setText("void");

        generate.addActionListener(e -> {
            TemplateData templateData = new TemplateData();
            templateData.setInitialPackage(outerPackage.getText());
            templateData.setProblemName(problemName.getText().replace(" ", "_"));
            templateData.setMainFileName(javaFileName.getText());
            templateData.setMethodName(methodName.getText());
            templateData.setMethodAllArgs(methodArgs.getText());
            templateData.setMethodReturnType(methodReturnType.getText());
            templateData.setMethodReturnStatement(methodReturnStatement.getText());
            templateData.setProblemStatementQuestion(problemStatementQuestion.getText());

            new TemplateGenerator(templateData);
        });

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        setContentPane(panel);
        setTitle("TemplateGenerator");
        setSize(700, 800);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TemplateUi();
    }
}
