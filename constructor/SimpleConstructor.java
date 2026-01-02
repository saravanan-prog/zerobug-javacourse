package constructor;

class ExampleSimpleConstructor {
    private  int count;
//    ExampleSimpleConstructor(){
//        System.out.println("Constructor is calling....");
//    }

    ExampleSimpleConstructor(int count){
        this.count = count;
    }
    public void getCount(ExampleSimpleConstructor obj){
        System.out.println( obj + "Current count is====>" + this.count);
    }
    public void addCount(){
        this.count += 1;
    }
}

public class SimpleConstructor {

    public static void main(String[] args) {
        ExampleSimpleConstructor eobj1 =  new ExampleSimpleConstructor(0);
        eobj1.getCount(eobj1);  //0
        eobj1.addCount();  // 1
        eobj1.addCount();  // 2
        eobj1.getCount(eobj1);

        ExampleSimpleConstructor eobj2 = new ExampleSimpleConstructor(25);
        eobj2.getCount(eobj2);
        eobj2.getCount(eobj2);

        ExampleSimpleConstructor eobj3 = new ExampleSimpleConstructor(250);
        eobj3.getCount(eobj3);

        System.gc();


        eobj2.getCount(eobj3);


        eobj1 = null;
        eobj2 = null;
        eobj3 = null;

    }
}
