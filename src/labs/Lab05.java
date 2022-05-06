package labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab05 {

    public static void main(String[] args) {

        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab05 lb = new Lab05();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - LARGEST NUMBER
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        lb.printingTable(5, 10);

        //CALLING METHOD 02 - PRIME NUMBERS
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        System.out.print("Enter init number: ");
        int init = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        System.out.print("List of prime numbers in range: ");
        lb.prime(init, end);

    }

    public void printingTable(int number, int rows) {
        System.out.println("TABLE OF " + number);
        for (int i = 1; i <= rows; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }

    public void prime(int rangeInit, int rangeEnd) {
        while (rangeInit < rangeEnd) {
            boolean flag = false;

            for(int i = 2; i <= rangeInit/2; ++i) {
                // condition for nonprime number
                if(rangeInit % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && rangeInit != 0 && rangeInit != 1)
                System.out.print(rangeInit + " ");

            ++rangeInit;
        }
    }


}


