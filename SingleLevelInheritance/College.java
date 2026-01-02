package SingleLevelInheritance;

class ArtsCollege{


    int artsCollegeStudentCount = 21;

    public int getArtsCollegeStudentCount() {
        return artsCollegeStudentCount;
    }
}
class EngineeringCollege extends ArtsCollege{


    int engineerCollegeStudentCount = 51;

    public int getEngineerCollegeStudentCount() {
        return engineerCollegeStudentCount;
    }

}

public class College {
    public static void main(String[] args) {
        EngineeringCollege obj1 = new EngineeringCollege();
        int artsCount = obj1.getArtsCollegeStudentCount();
        System.out.println("arts studnet count ===>" + artsCount);
        int engineerCount = obj1.getEngineerCollegeStudentCount();
        System.out.println("Engineer student count ===>" + engineerCount);

    }
}
