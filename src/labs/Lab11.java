package labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab11 {

    static List<String> lst = new ArrayList<>();

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab11 lb = new Lab11();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - INSERT AND RETRIEVE
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        //ADDING ELEMENTS TO THE LIST
        lb.insertAndRetrieve(true, 0, "Hello");
        lb.insertAndRetrieve(true, 1, "My");
        lb.insertAndRetrieve(true, 2, "Name");
        lb.insertAndRetrieve(true, 3, "Is");
        lb.insertAndRetrieve(true, 4, "Josue");

        System.out.println("The ArrayList contains: " + Arrays.toString(lst.toArray()));
        //RETRIEVING ELEMENT FROM AN SPECIFIC INDEX
        lb.insertAndRetrieve(false, 1, "");

        //CALLING METHOD 02 - REPLACEMENT
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        System.out.println("The ArrayList before replacement: " + Arrays.toString(lst.toArray()));
        //REPLACING VALUE ON ARRAYLIST
        lb.replacement(4, "Diego");
        System.out.println("The ArrayList after replacement: " + Arrays.toString(lst.toArray()));

        //CALLING METHOD 03 - SEARCHING
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        lb.search("Diego");
    }

    public void insertAndRetrieve(Boolean flag, int index, String element) {
        if (flag) {
            lst.add(index, element);
        } else if (!flag) {
            System.out.println("The element retrieved in the index " + index + " is: " + lst.get(index));
        }
    }

    public void replacement(int index, String element) {
        lst.set(index, element);
    }

    public void search(String element) {
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).equalsIgnoreCase(element)){
                System.out.println("Element found on index: " + i);
            }
        }
    }


}
