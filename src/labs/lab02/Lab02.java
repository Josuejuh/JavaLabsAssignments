package labs.lab02;

public class Lab02 {

    public static void main(String[] args) {
        //CREATING AN OBJECT AND INITIALIZE IT, TO ACCESS TO THE METHODS
        Lab0201 lb00 = new Lab0201(25,"Test",20.5);

        //CALLING METHOD 01 OF CLASS LAB0201 - DIFFERENT VARIABLES AND METHODS
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        System.out.println("Variable int: " + lb00.getTest00());
        System.out.println("Variable String: " + lb00.getTest01());
        System.out.println("Variable double: " + lb00.getTest02());

        //CALLING METHOD 02 OF SAME CLASS - SWAP VALUES
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        swapFloat(845.23f,785.00f);

        //POINT 03 IS ALREADY DONE WITH THE FIRST EXERCISE, YOU CAN CHECK LAB0201 CLASS FOR IT


    }

    public static void swapFloat(float n1, float n2){
        System.out.println("Variable 1 is: " + n1);
        System.out.println("Variable 2 is: " + n2);
        float temp = 0;
        temp = n2;
        n2 = n1;
        n1 = temp;
        System.out.println("Variable 1 now is: " + n1);
        System.out.println("Variable 2 now is: " + n2);
    }

}
