package utils;

public class TemplateData {
    private String initialPackage;
    private String problemName;
    private String mainFileName;
    private String methodName;
    private String methodReturnType;
    private String methodReturnStatement;
    private String methodAllArgs;
    private String problemStatementQuestion;

    public TemplateData(String initialPackage, String problemName, String mainFileName, String methodName, String methodReturnType, String methodReturnStatement, String methodAllArgs) {
        this.initialPackage = initialPackage;
        this.problemName = problemName;
        this.mainFileName = mainFileName;
        this.methodName = methodName;
        this.methodReturnType = methodReturnType;
        this.methodReturnStatement = methodReturnStatement;
        this.methodAllArgs = methodAllArgs;
    }

    public TemplateData() {
    }

    public String getProblemStatementQuestion() {
        return problemStatementQuestion;
    }

    public void setProblemStatementQuestion(String problemStatementQuestion) {
        this.problemStatementQuestion = problemStatementQuestion;
    }

    public String getInitialPackage() {
        return initialPackage;
    }

    public void setInitialPackage(String initialPackage) {
        this.initialPackage = initialPackage;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getMainFileName() {
        return mainFileName;
    }

    public void setMainFileName(String mainFileName) {
        this.mainFileName = mainFileName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodReturnType() {
        return methodReturnType;
    }

    public void setMethodReturnType(String methodReturnType) {
        this.methodReturnType = methodReturnType;
    }

    public String getMethodReturnStatement() {
        return methodReturnStatement;
    }

    public void setMethodReturnStatement(String methodReturnStatement) {
        this.methodReturnStatement = methodReturnStatement;
    }

    public String getMethodAllArgs() {
        return methodAllArgs;
    }

    public void setMethodAllArgs(String methodAllArgs) {
        this.methodAllArgs = methodAllArgs;
    }
}
