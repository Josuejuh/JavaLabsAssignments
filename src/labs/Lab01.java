package labs;

import static java.lang.Math.round;

public class Lab01 {

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab01 lb = new Lab01();

        //CALLING METHOD 01 - CALCULATE RECTANGLE
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        lb.rectangleCal(6, 4);

        //CALLING METHOD 02 - UNARY USE ON ARITHMETIC METHOD
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        if (!lb.sum(5, 7)) {
            System.out.println("The sum is negative");
        } else {
            System.out.println("The sum is positive");
        }

        //CALLING METHOD 03 - QUOTIENT & REMAINDER
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        lb.printRemQuo(10,6);

    }

    public void rectangleCal(int width, int height) {
        int perimeter = 2 * (width + height);
        int area = width * height;
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
    }

    public boolean sum(int a, int b) {
        if (a + b > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printRemQuo(int dividend, int divisor){
        int reminder = dividend % divisor;
        int quotient = round(dividend / divisor);
        System.out.println("The quotient is: " + quotient);
        System.out.println("The reminder is: " + reminder);

    }

}
