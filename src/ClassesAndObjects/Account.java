package ClassesAndObjects;

import java.util.Scanner;

public class Account {

    double balance ;
    String accountId;
    static int nextId = 0;
    static final int ROUTING_NUMBER = 12345;

    public void deposit(double amount){

        balance = balance + amount ;
    }
    public void withdrawal(double amount){

        balance = balance - amount ;
    }
    public void displayAccountDetails(){
        System.out.println("*** Account Information***");
        System.out.println("ID: "+accountId);
        System.out.println("Balance: "+balance);
    }
    public static String getNextID(){
        return "ACCT#" + nextId++;
    }

    public void transfer (double amount){
        balance = balance - amount;
    }

    public void displayTransferDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in transfer to account # ");
        int accountNumber = scan.nextInt();
        System.out.println("type in transfer to routing# ");
        int routingNumber = scan.nextInt();

    }
}
