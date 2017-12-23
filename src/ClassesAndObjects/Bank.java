package ClassesAndObjects;

public class Bank {

    public static void main(String[] args) {

        Customer Ben = new Customer("Ben","Leon");
        Ben.addAccount(1000);

        Customer abc = new Customer();
        abc.addAccount();


    }
}
