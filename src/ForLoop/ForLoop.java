package ForLoop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Instance of scanner created
        Scanner scan = new Scanner(System.in);


        //simple message to user to enter id
        System.out.println("Please enter your Id");
        //takes input from console and storing the value into actualPassword variable
        String actualId = scan.nextLine();
        //setting expected password which is associated with user account details in database
        String expectedId = "technosoft";

        //simple message to user to enter id
        System.out.println("Please enter your password");
        //takes input from console and storing the value into actualPassword variable
        String actualPassword = scan.nextLine();
        //setting expected password which is associated with user account details in database
        String expectedPassword = "techno1234";


        for (int i = 0; i < 4; i++) {
            if (!actualId.equals(expectedId) || !actualPassword.equals(expectedPassword)) {
                //if both or either Id or password doesn't match the actual database, user will have limited attempts to try again
                //subtracting the count by iteration so user will have less tries (-1 every miss tries)
                int count = 4 - i;
                //console message to user of invalid id/password
                System.out.println("Invalid password/id entered");
                //console message to user of login attempt left
                System.out.println("You have " + count + " more tries before session gets locked");
                //let users update their Id and password input again
                System.out.println("Please enter your Id");
                actualId = scan.nextLine();
                System.out.println("Please enter your password");
                actualPassword = scan.nextLine();

                //if count equals to 4, then notifying user with custom message of reaching maximum attempt
                    if (i == 3) {
                        System.out.println("You session will be locked for 10 minuets due to maximum tries in login attempt");
                    }


            } else {  // (actualId.equals(expectedId) && actualPassword.equals(expectedPassword))
                // if at any point in the loop user enters both correct Id and password, then system let user into home page
                System.out.println("You have succesfully logged in" + "\n" + "Welcome to Home Page");
                //this keyword will break the loop and continue with program
                break;
                }
        }
    }
}



