package Switch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SwitchHw {
        public static void main(String[] args) {

            Date date = new Date();
            DateFormat sdf = new SimpleDateFormat("MMMM") ;
            String currentMonth = sdf.format(date);

            switch (currentMonth) {
                case "December":
                case "January":
                case "February":
                    System.out.println("it is now winter in " + currentMonth);
                    break;
                case "March":
                case "April":
                case "May":
                    System.out.println("it is now spring in " + currentMonth);
                    break;
                case "June":
                case "July":
                case "August":
                    System.out.println("it is now summer in " + currentMonth);
                    break;
                case "September":
                case "October":
                case "November":
                    System.out.println("it is now fall in " + currentMonth);
            }


        }
    }