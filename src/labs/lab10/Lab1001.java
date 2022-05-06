package labs.lab10;

public class Lab1001 {

    public static void main(String[] args) throws Lab1002 {
        //LAB1002 CONTAINS THE CUSTOM EXCEPTION
        int age = 15;
        if (age < 21) {
            throw new Lab1002("Custom Exception Display");
        } else {
            System.out.println("Does not meet the accepted age");
        }
    }

}
