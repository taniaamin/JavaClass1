package Math;

public class MathHomework {


    public static void main(String[] args) {

        // Random variables
        int a = 50;
        int b = -20;
        double c = 75.8;
        double d = 0.88;


        // exp
        System.out.println("Exponential value of c =  " + Math.exp(c) );

        // log
        System.out.println("Log value of a = " +Math.log(a));

        // pow
        System.out.println("Value of b to the power of a = " +Math.pow(b, a));

        //floor
        System.out.println("Floor value of c = " +Math.floor(c) );

        // sqrt
        System.out.println("Square root of d = " +Math.sqrt(d));

        // ceil
        System.out.println("Ceil value of c = " +Math.ceil(c));

        // sin
        System.out.println("Sin of a = " + Math.sin(a));

        // cos
        System.out.println("Cosine of b = "+Math.cos(b));

        // tan
        System.out.println("Tan of d = "+Math.tan(d));

        // toRadians
        System.out.printf("toRadians of c = " +Math.toRadians(c));
    }

}