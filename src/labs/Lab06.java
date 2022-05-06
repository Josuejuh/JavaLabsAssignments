package labs;

import java.util.Arrays;
import java.util.Scanner;

public class Lab06 {

    public static void main(String[] args) {

        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab06 lb = new Lab06();

        //CALLING METHOD 01 - AVERAGE ON ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        double[] arr = {58.6, 58, 7, 30, 25, 10, 100.6, 58};
        lb.avgArray(arr);

        //CALLING METHOD 02 - PRINT 2D ARRAY
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                null,
                {8, 9}
        };
        lb.print2DArray(arr2);

    }

    public void avgArray(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        double average = total / arr.length;

        System.out.format("The average is: " +  average);
    }

    public void print2DArray(int[][] arr){
        for (int[] row: arr) {
            System.out.println(Arrays.toString(row));
        }
    }

}
