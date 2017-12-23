package IfElseIf;

public class CarModeHomework {
    public static void main(String[] args) {

        char carMode =  'D'; //option- P, D, N, R
        String driveType = "Sport Type";  //option- Snow Type, Sport Type, Regular Type
        String parkType = ""; //option- Parallel and Regular


        //  If i am on P mode I can park parallel between two cars, or park regularly
        if(carMode == 'P'){
            System.out.println(carMode + " : put car in parking mode");
            if(parkType.equals("Parallel")){
                System.out.println("Can park parallel betwen two car");}
            else{
                System.out.println("Can park regularly");}
        }
        // If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
        else if ( carMode == 'D') {
            System.out.println(carMode + " : put car in drive mode");

            if(driveType.equals("Snow Type")) {
                System.out.println("Can drive in snow type"); }
            else if(driveType.equals("Sport Type")) {
                System.out.println("Can drive in sport type"); }
            else{
                System.out.println("Can drive in regular type");
                }
        }
        else if (carMode == 'N') {
            System.out.println(carMode + " : put car in neutral");
        }
        else if (carMode == 'R') {
            System.out.println(carMode + " : only reverse the car and car will activate back camera");
        }
        else {
            System.out.println( carMode + " : Invalid car mode : please check your car mode");
        }
    }
}
