package LearningClass;

class Exam{
    private String examName;
    private String examType;

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }
}

class School{

    private String schoolName;
    private String schoolType;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }
}

public class Student {
    public static void main(String[] args) {
        Exam examobj = new Exam();
        examobj.setExamName("Quterly");
        System.out.println("Exam Name====>" + examobj.getExamName());
    }
}
