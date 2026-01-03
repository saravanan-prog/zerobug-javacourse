package abstractclass;


abstract class Company {
    int salary = 25000;
    int pf = 2500;
    int tax = 600;
    int esi = 300;
    abstract double computeFullSalary(); // abstract method
    void showCompanyDetails(){
        System.out.println("this is TCS"); // Concrete Method
    }

}

class SalaryCalculation extends Company {

    double computeFullSalary(){

        int fullSalary =( (salary + 2500 + 300) - 300);
        return fullSalary;
    }
}

class Pfcalculation extends Company {
    double computeFullSalary(){
        return 0;
    }

}





public class Main {
    public static void main(String[] args) {

        SalaryCalculation sobj = new SalaryCalculation();
        double fullSalary = sobj.computeFullSalary();
        System.out.println("full Salary ===>" + fullSalary);


        Company obj = new SalaryCalculation();
        System.out.println("full Salary2 ====>" + obj.computeFullSalary());
        obj.showCompanyDetails();

    }
}
