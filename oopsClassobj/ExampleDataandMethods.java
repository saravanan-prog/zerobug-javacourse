package oopsClassobj;

class Person {
    private int personAge = 28;

    public int getPersonAge(){
        return personAge;
    }
    public void setAge(int age){
        this.personAge = age;
    }
}

public class ExampleDataandMethods {
    public static void main(String[] args) {
        Person obj1 = new Person();
        System.out.println(obj1.getPersonAge());     // 28
        obj1.setAge(52);
        System.out.println(obj1.getPersonAge());    // 52
    }
}
