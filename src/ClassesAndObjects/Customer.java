package ClassesAndObjects;


public class Customer {
    String firstName;
    String lastName;
    Account acc; //account declared
    int defaultBalance = 100;

    int routingNumber;
    int accountNumber;
    Account trf;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer (){ //default name if no one inputs a specific name
        firstName = "John";
        lastName = "Doe";

    }


    public void addAccount(double initialBalance){
        acc = new Account(); //now the account is created
        acc.accountId = "ACCT ID= " + Account.getNextID();
        acc.balance = defaultBalance + initialBalance;
        acc.displayAccountDetails();
    }

    public void addAccount() {
        addAccount( 100 ); // 'recursion'- calling the upper method to have overloaded concept with set value of $100
    }

    public void addTransfer(double transferAmount) {}



}


