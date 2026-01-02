package oopsClassobj;

public class BasicClassObj {
    //Instance variables
    static int firstNumber = 100;
    int secondNumber = 100;
    float price = 500.25252525252525f;
    double tax = 250.454545454545454545;

    public static void main(String[] args) {
        //local variables
        BasicClassObj bco = new BasicClassObj();
        System.out.println("First Number ====>" + BasicClassObj.firstNumber);
        System.out.println("Second Number ====>" + bco.secondNumber);
        System.out.println("pirce ========>"+bco.price);
        System.out.println("tax ========>"+bco.tax);

    }
}
