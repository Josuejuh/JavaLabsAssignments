package labs;

import java.util.Scanner;

public class Lab08 {

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab08 lb = new Lab08();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - COMPARE 2 STRINGS
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        lb.compareStrings("Hola", "Hola", true);

        //CALLING METHOD 02 - ADD A DOUBLE TO A STRING
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        lb.addDoubleToString(77);

        //CALLING METHOD 03 - CONVERT BOOLEANS OBJECTS IN VARIABLES
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        Boolean bObj = new Boolean("True");
        lb.objToVariable(bObj);

        //CALLING METHOD 04 - APPEND
        System.out.println("==========================================");
        System.out.println("EXERCISE 04");
        System.out.println("==========================================");
        lb.builderBuffer();

        //CALLING METHOD 05 - REVERSE NUMBER
        System.out.println("==========================================");
        System.out.println("EXERCISE 05");
        System.out.println("==========================================");
        lb.reverse(56841);


    }

    public void compareStrings(String word01, String word02, boolean flag) {
        word01 = word01.trim();
        word02 = word02.trim();
        if (word01.equalsIgnoreCase(word02) && !flag) {
            System.out.println("The words are equal no matter upper or lower case");
        } else if (!flag) {
            System.out.println("The words are not equal");
        }

        if (word01.equals(word02) && flag) {
            System.out.println("The words are exactly the same");
        } else if (flag) {
            System.out.println("The words are not equal");
        }


    }

    public void addDoubleToString(double num) {
        String str = "Hello Employee ";
        str = str + String.valueOf(num);
        System.out.println(str);
    }

    public void objToVariable(Boolean obj1) {
        boolean bvar = obj1.booleanValue();
        System.out.println("Boolean value of the object is: " + bvar);
    }

    public void builderBuffer() {
        char[] ch = {'J', 'A', 'V', 'A'};
        StringBuilder sb00 = new StringBuilder("StringBuilder ");
        StringBuffer sb01 = new StringBuffer("StringBuffer ");

        sb00.append(ch);
        sb01.append(ch);
        System.out.println(sb00);
        System.out.println(sb01);
    }

    public void reverse(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        } else {
            System.out.print(num % 10);
            reverse(num / 10);
        }
    }

}
