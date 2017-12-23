package Operator;

public class OperatorsHomework {

    public static void main(String[] args) {

        // 1. Is your age greater then you brothers/sister's age
        int myAge = 26;
        int brotherAge = 21;
        boolean b = myAge > brotherAge;
        System.out.println("Is my age greater than my brother's age = " +b);


        // 2. What two number must be true for you to buy iPhone 10
        int lowestMemory = 999; // minimum price of 64gb
        int hightestMemory = 1149; // minimum price of 256 gb
        boolean buyIphone  = lowestMemory<1050 && hightestMemory>= 1149;
        System.out.println("Two numbers are good to afford to iphone 8 = " + buyIphone);


        //3. What must not equal to one another
        double length = 72.8;
        double width = 17.3;
        boolean result = length != width; // lenth musy not be equal to width
        System.out.println("Condition result = " +result);


    }

}
