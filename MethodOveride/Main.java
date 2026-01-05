package MethodOveride;

class MasterDb{

    void connection(){
        System.out.println("Master Database is connecting");
    }
}
class SubDatabase extends MasterDb{

    void connection(){
        System.out.println("Dog is making soud LoL");
    }
}

public class Main {
    public static void main(String[] args) {
        MasterDb obj = new SubDatabase();
        obj.connection();

    }
}
