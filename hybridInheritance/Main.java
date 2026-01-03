package hybridInheritance;

class Parent {
    void display(){
        System.out.println("I am Parent");
    }
}

class Child1 extends Parent{
    void print(){
        System.out.println("I am child");
    }
}

class Child2 extends Parent{
    void printMessage(){
        System.out.println("I am child");
    }
}

class Trade extends Child1{
    void openDematAc(){
        System.out.println("Demat ac processing....");
    }
}







public class Main {

    public static void main(String[] args) {
        Trade obj = new Trade();
        obj.openDematAc();
        obj.print();

        Child2 obj1 = new Child2();
        obj1.display();
        obj1.printMessage();
    }
}
