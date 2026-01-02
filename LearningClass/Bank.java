package LearningClass;

class Accounts {
    private int currentBalance = 0;

    public int getCurrentBalance() {
        return currentBalance;
    }
    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void deposit(int cash){
        currentBalance += cash;
    }
    public void withDraw(int amount){
        currentBalance -= amount;
    }
    public int checkBalce(){
        return currentBalance;
    }
}

public class Bank {

    public static void main(String[] args) {
        Accounts person1 = new Accounts();
        person1.setCurrentBalance(5000);

        Accounts person2 = new Accounts();
        person2.setCurrentBalance(25000);

        Accounts person3 = new Accounts();






        System.out.println("Person1 View Banalce ====>" + person1.checkBalce());
        person1.deposit(1000);
        System.out.println("Person1 after deposit checking View Banalance ===>" + person1.checkBalce());
        person1.withDraw(300);
        System.out.println("Person1 after with draw checking View Banalance ===>" + person1.checkBalce());
        System.out.println("Person2 check Balance ===>" + person2.checkBalce());

        person1 = null;
        person2 = null;

        System.out.println("checking===>"+person1.getCurrentBalance());


    }
}
