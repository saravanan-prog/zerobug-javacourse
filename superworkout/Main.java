package superworkout;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void sound() {
        super.sound(); // calls Animal's sound()
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}
