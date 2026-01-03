package MultilevelInheritance;


class Hotel {
    public void foodMenu(){
        System.out.println("this is a food menu method");
    }
}
class Geetham extends Hotel {

    public void resturantType(){
        System.out.println("This is veg resturant");
    }
}
class Seashell extends Geetham {

    public void todaySpl(){
        System.out.println("Ghee chicken rice");
    }
}





public class Main {
    public static void main(String[] args) {
        Seashell s = new Seashell();
        s.todaySpl();
        s.foodMenu();
        s.resturantType();


        s = null;
    }
}
