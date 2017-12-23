package WhileLoop;

import java.util.Scanner;


public class WhileLoopHw {

    public static void main(String[] args) {

        // Initialization and max limit declared
        int budgetCapacity = 100;
        int i = 0;

        while(i<budgetCapacity){  // Condition created with statements inside while loop

            // Statement 1: amount updated at the beginning of every loop.
            int updatedBudgetCapacity = budgetCapacity - i;
            System.out.println("You have $" +updatedBudgetCapacity + " left before you cross your budget limit");

            // Statement 2: Scanner created to input user's spending from the budget
            System.out.println("Please enter amount of the next item: ");
            Scanner scan = new Scanner(System.in);
            int amount = scan.nextInt();


            // Users to be notified when the purchased amount exceeds the budget amount
            if(i==99){
                System.out.println("You have reached your budget limit");
                break;
            }

            i= i + amount ; // Incremental update pattern declared. Scanner amount to take effect in next loop in updatedBudgetCapacity

        }
    }
}
