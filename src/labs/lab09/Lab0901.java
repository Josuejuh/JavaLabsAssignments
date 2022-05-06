package labs.lab09;

import labs.Lab07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Lab0901 {

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab0901 lb = new Lab0901();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - EXAMPLE OF TRY/CATCH/FINALLY
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        lb.tryCatch();
        //CALLING METHOD 02 - EXAMPLE OF TRY/CATCH/FINALLY
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        int[] correct = {1, 2, 3};
        int[] incorrect = {1, 2, 3, 4};
        lb.arrayException(correct);
        lb.arrayException(incorrect);

    }

    public void tryCatch() {
        try {
            int a = 0;
            int b = 10;
            int res = b / a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("It will always be printed!!!");
        }
    }

    public void arrayException(int[] arr) {
        if (arr.length > 3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}
