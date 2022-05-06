package labs;

import java.util.Locale;
import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {

        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab04 lb = new Lab04();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - LARGEST NUMBER
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        System.out.println("The largest number is: " + lb.getLargestNumber(589, 632, 899));

        //CALLING METHOD 02 - VOWEL OR CONSONANT
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        lb.vowelOrConsonant("c");

        //CALLING METHOD 03 - POSITIVE OR NEGATIVE - USER INPUT
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        System.out.print("Enter number: ");
        double num = sc.nextDouble();
        lb.positiveOrNegative(num);

    }

    public double getLargestNumber(double a, double b, double c) {
        double large = 0;
        if (a >= b && a >= c) {
            large = a;
        } else if (b >= a && b >= c) {
            large = b;
        } else {
            large = c;
        }
        return large;
    }

    public void vowelOrConsonant(String letter) {
    letter = letter.toLowerCase();
        switch (letter) {
            case "a", "e", "i", "o", "u" -> System.out.println(letter + " is vowel");
            default -> System.out.println(letter + " is consonant");
        }
    }

    public void positiveOrNegative (double number){
        if (number > 0){
            System.out.println("The number is positive");
        } else if (number < 0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is 0");
        }
    }

}
