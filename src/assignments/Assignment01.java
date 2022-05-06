package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment01 {

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Assignment01 asg = new Assignment01();

        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - CALCULATE FACTORIAL WITH LOOP
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        asg.factorialLoop(6);

        //CALLING METHOD 02 - PRINTING FIBONACCI
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        asg.fibonacciPrint(10);

        //CALLING METHOD 03 - SORTING ARRAY
        System.out.println();
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        //DECLARING ARRAY
        int[] arr = {13, 7, 6, 45, 21, 9, 300, 102};
        asg.sortArray(arr);

        //CALLING METHOD 04 - SORTING ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 04");
        System.out.println("==========================================");
        System.out.print("Write a year yyyy to determine if it is leap or not: ");
        int year;
        year = sc.nextInt();
        asg.yearLeap(year);

        //CALLING METHOD 05 - SORTING ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 05");
        System.out.println("==========================================");
        System.out.print("Printing first 10 prime numbers: ");
        asg.printPrimeNumbers();

        //CALLING METHOD 06 - CALCULATE TRIANGLE AREA
        System.out.println("==========================================");
        System.out.println("EXERCISE 06 - CALCULATE AREA OF TRIANGLE");
        System.out.println("==========================================");
        int base, height;
        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
        asg.areaTriangle(base, height);

        //CALLING METHOD 07 - SUM OF NATURAL NUMBERS
        System.out.println();
        System.out.println("==========================================");
        System.out.println("EXERCISE 07");
        System.out.println("==========================================");
        asg.sumNaturalNumbers(20);

        //CALLING METHOD 08 - REVERSE ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 08");
        System.out.println("==========================================");
        System.out.print("Enter the size of the Integer array: ");
        int sizeArr;
        sizeArr = sc.nextInt();
        int[] arr1 = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.print("Enter next element: ");
            arr1[i] = sc.nextInt();
        }
        asg.reverseArray(arr1);

        //CALLING METHOD 09 - PRINT EVEN NUMBERS
        System.out.println("==========================================");
        System.out.println("EXERCISE 09");
        System.out.println("==========================================");
        asg.printEvenNumbers(50);

        //CALLING METHOD 10 - PRINT TRIANGLE ARRAY
        System.out.println();
        System.out.println("==========================================");
        System.out.println("EXERCISE 10");
        System.out.println("==========================================");
        asg.triangleArrayPrint(10);

    }

    public void factorialLoop(int num) {
        int fact = 1, i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        //PRINTING RESULT
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public void fibonacciPrint(int value) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        // Iterate till counter is N
        while (counter < value) {
            // Print the number
            System.out.print(num1 + " ");
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public void sortArray(int[] arr) {
        System.out.println("Original arr[] : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted arr[] : " + Arrays.toString(arr));
    }

    public void yearLeap(int yyyy) {
        boolean leap = false;
        //IF THE YEAR IS DIVIDED BY 4
        if (yyyy % 4 == 0) {

            //IF THE YEAR IS A CENTURY
            if (yyyy % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if (yyyy % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            //IF THE YEAR IS NOT A CENTURY
            else {
                leap = true;
            }
        } else
            leap = false;

        if (leap) {
            System.out.println(yyyy + " is a leap year.");
        } else {
            System.out.println(yyyy + " is not a leap year.");
        }
    }

    public void printPrimeNumbers() {
        int ct = 0, n = 0, i = 1, j = 1;
        while (n < 10) {
            j = 1;
            ct = 0;
            while (j <= i) {
                if (i % j == 0)
                    ct++;
                j++;
            }
            if (ct == 2) {
                System.out.printf("%d ", i);
                n++;
            }
            i++;
        }
    }

    public void areaTriangle(int base, int height) {
        int area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
    }

    public void sumNaturalNumbers(int num) {
        int i, sum = 0;
        for (i = 1; i <= num; ++i) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + num + " Natural Numbers is = " + sum);
    }

    public void reverseArray(int[] array) {
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public void printEvenNumbers(int n) {
        System.out.print("Even Numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void triangleArrayPrint(int row) {
        int i, j;
        System.out.println("TRIANGLE ARRAY: ");
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

}
