package HirarichalIheritance;

class College{
    private int studentSize = 100;
    private int teacherSize = 20;
    private String certification = "NDA-Au";

    public int getStudentSize() {
        return studentSize;
    }

    public int getTeacherSize() {
        return teacherSize;
    }

    public String getCertification() {
        return certification;
    }

    public void setStudentSize(int studentSize) {
        this.studentSize = studentSize;
    }

    public void setTeacherSize(int teacherSize) {
        this.teacherSize = teacherSize;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}

class Sairam extends College {

    void printCollegeName(){
        System.out.println("I am Sairam college ");
    }
}

class Savitha extends College {

    void printCollegeName(){
        System.out.println("I am savitha");
    }
}

public class Main {
    public static void main(String[] args) {
        Savitha saviobj = new Savitha();
        saviobj.printCollegeName();
        System.out.println(saviobj.getStudentSize());
        System.out.println(saviobj.getTeacherSize());

        Sairam saiobj = new Sairam();
        saiobj.printCollegeName();
        System.out.println(saiobj.getStudentSize());
        System.out.println(saiobj.getTeacherSize());
    }
}
