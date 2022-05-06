package assignments;

import java.util.Scanner;

public class Assignment02 {

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Assignment02 asg = new Assignment02();

        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 02 - CALCULATE AVERAGE FROM ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        int[] array01 = {1, 5, 7, 4, 15, 235, 6, 9};
        asg.averageArray(array01);

        //CALLING METHOD 01 - CALCULATE ODD NUMBERS IN A RANGE
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        asg.oddNumbers(79, 187);

        //CALLING METHOD 03 - CHECK IF A NUMBER IS PRIME
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        asg.checkPrime(13);

        //CALLING METHOD 04 - FIND THE SUM OF DIGITS
        System.out.println("==========================================");
        System.out.println("EXERCISE 04");
        System.out.println("==========================================");
        asg.sumNum(1234);

        //CALLING METHOD 05 - REVERSE THE DIGITS
        System.out.println("==========================================");
        System.out.println("EXERCISE 05");
        System.out.println("==========================================");
        asg.reverseNum(1234);

        //CALLING METHOD 06 - FIND DUPLICATES IN AN ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 06");
        System.out.println("==========================================");
        int[] array02 = {1, 5, 7, 5, 15, 235, 15, 9};
        asg.duplicatesArray(array02);
    }

    public void averageArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double average = sum / arr.length;
        System.out.println("Average of array : " + average);
    }

    public void oddNumbers(int init, int end) {
        System.out.print("Odd Numbers from " + init + " to " + end + " are: ");
        for (init = init; init <= end; init++) {
            if (init % 2 != 0) {
                System.out.print(init + " ");
            }
        }
    }

    public void checkPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }

    public void sumNum(int number) {
        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }

    public void reverseNum(int num) {
        int reversed = 0;
        System.out.println("Original Number: " + num);
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

    public void duplicatesArray(int[] numArray){
        for(int i = 0; i < numArray.length; i++){
            for(int j = i + 1; j < numArray.length; j++){
                if(numArray[i] == numArray[j]){
                    System.out.println("Duplicate element found " + numArray[j]);
                }
            }
        }
    }

}
