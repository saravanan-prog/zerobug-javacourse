package oopsClassobj;

class Student {
    int roll_number = 100;
    String name = "Saravanan";
    static int count = 0; //3
}

public class ExampleClas {

    public static void main(String[] args) {
        Student obj1 = new Student();  // 2000 memory address
        Student obj2 = new Student();  // 3000 memory address
        Student obj3 = new Student();  // 4000 memory address

        obj1.roll_number = 1;

        System.out.println("obj1 roll number ===>" + obj1.roll_number);
        System.out.println("obj2 roll number ===>" + obj2.roll_number);
        System.out.println("obj3 roll number ===>" + obj3.roll_number);

        obj1.count++;
        obj2.count++;
        obj3.count++;

        System.out.println("obj2 Count====>" + obj2.count );
        System.out.println("obj1 Count====>" + obj1.count);

    }
}
