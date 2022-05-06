package labs.lab09;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Lab0902 {
    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab0902 lb = new Lab0902();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 03 - PARSING DATE
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        System.out.println("Enter date in format dd/MM/yyyy :");
        String date = sc.next();
        lb.formatDate(date);

    }

    public void formatDate (String date){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println(sdf2.format(sdf.parse(date)));
        } catch (Exception e){
            //It throws ParseException cause it receive a different format not supported for the process
            e.printStackTrace();
        }
    }

}
