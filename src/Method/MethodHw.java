/* import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class MethodHw {
    public static void main(String[] args) { // this is the main method where all the work gets done
        getCurrentDate(); // #1

        printToConsole("2.square root of input = " +squareRoot(4));  // #2

        printToConsole(monthName("June")); // #3

        int [] result = getCalculator(100,50);  // #4
        System.out.println("4.Add a&b= " + result[0]);
        System.out.println("4.Subtract a&b= " + result[1]);
        System.out.println("4.Multiply a&b= " + result[2]);
        System.out.println("4.Divide a&b= " + result[3]);

    }




    //Instance of input printing to be used for other methods below (1-4)
    public static void printToConsole(String value){
        System.out.println(value);
    }


    // 1. Today's date in format dd/MM/yyyy
    public static String getCurrentDate() {
        Date myDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); //format declared
        String todayDate = format.format(myDate);
       return todayDate;
    }

    // 2. Method always returns a sqrt of any number which is passed on to method
    public static double squareRoot(double a){
        double root = Math.sqrt(a);
        return root ;
    }


     // 3. Method prints the month name based on the season name
    public static String monthName(String desiredMonth) {

        String desiredtMonth = null;

        switch (desiredtMonth) {
            case "January":
            case "February":
            case "December":
                System.out.println("it is now winter in " + desiredtMonth);
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("it is now spring in " + desiredtMonth);
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("it is now summer in " + desiredtMonth);
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("it is now fall in " + desiredtMonth);
            return desiredMonth ;
        }
    }
        public static int[] getCalculator (int a , int b) {


            int[] result = new int[4];
            result[0] = a + b;
            result[1] = a - b ;
            result[2] = a * b ;
            result[3] = a / b ;

            return result ;
        }

}

*/