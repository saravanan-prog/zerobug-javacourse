package InterfaceExample;

interface Bakery{
    int count = 0;
    public void bakingCake();
    public void bakingBiscusts();
    default void integrits(){
        System.out.println(
                "maida , sugar, carmel"
        );
    }
}

interface PriceList{

    public void smallSize();
    public void mediumSize();
}

class Iyyengar implements Bakery, PriceList{

    public void bakingCake(){
        System.out.println("birthday cake making" + count + 1);
    }
    public void bakingBiscusts(){
        System.out.println("Cahsew cookies is processing");
    }
    public void smallSize(){
        System.out.println("Rs.500");
    }
    public void mediumSize(){
        System.out.println("Rs.1500");
    }
}

public class Main {
    public static void main(String[] args) {
        Bakery obj = new Iyyengar();
        obj.bakingBiscusts();
        obj.bakingCake();
        obj.integrits();

        PriceList price = new Iyyengar();
        price.smallSize();
        price.mediumSize();


        Iyyengar iobj = new Iyyengar();
        iobj.bakingBiscusts();
        iobj.mediumSize();

    }
}
