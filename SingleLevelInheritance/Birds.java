package SingleLevelInheritance;

class FlyingBirds{
    public void printFlyingBirds(String bridName){
        System.out.println("FlyingBird===> " + bridName);
    }
}
class NonFlyingBirds extends FlyingBirds{
    public void printNonFlyingBirds(String bridName){
        System.out.println("NonFlyingBird===> " + bridName);
    }

}

public class Birds {
    public static void main(String[] args) {
        NonFlyingBirds obj1 = new NonFlyingBirds();
        obj1.printFlyingBirds("dove");
    }
}
