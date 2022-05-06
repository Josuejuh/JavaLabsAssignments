package labs.lab03.lab0302;

public class OverloadCalculation {

    public static void main(String[] args) {
        System.out.println("Triangle Equilateral perimeter: " + calculatePerimeter(4));
        System.out.println("Rectangle perimeter: " + calculatePerimeter(10,5));
        System.out.println("Trapezium Isosceles perimeter: " + calculatePerimeter(5,12,6));
    }

    //Triangle Equilateral
    public static int calculatePerimeter(int num1){
        return num1 * 3;
    }

    //Rectangle
    public static int calculatePerimeter(int num1, int num2){
        return 2 * (num1 + num2);
    }

    //Trapezium Isosceles
    public static int calculatePerimeter(int num1, int num2, int num3){
        return (num1 * 2) + (num2 + num3);
    }
}
