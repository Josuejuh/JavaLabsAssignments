package labs;

import java.util.*;

public class Lab13 {

    static Set<String> set1 = new HashSet<>();
    static LinkedHashSet<String> set2 = new LinkedHashSet<>();
    static TreeSet<Integer> set3 = new TreeSet<>();


    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab13 lb = new Lab13();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - INSERT AND RETRIEVE
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        //INSERTING
        lb.InsertAndRetrieve(true, "What?");
        lb.InsertAndRetrieve(true, "World");
        //RETRIEVING
        lb.InsertAndRetrieve(false, "World");

        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        //GET HASHSET SIZE
        System.out.println("The size of the set is: " + set1.size());

        //CHECK IF AN ELEMENT EXIST ON A LinkedHashSet
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        //ADDING ELEMENTS
        set2.add("Element01");
        set2.add("Element02");
        set2.add("Element03");
        System.out.println(set2);
        lb.checkElement("Element01");

        //CONVERT TreeSet TO INTEGER ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 04");
        System.out.println("==========================================");
        set3.add(1);
        set3.add(2);
        set3.add(3);
        System.out.println("TreeSet: " + set3);
        //CONVERSION
        Integer[] intArray = set3.toArray(new Integer[0]);
        System.out.println("Integer Array: " + Arrays.toString(intArray));



    }

    public void InsertAndRetrieve(Boolean flag, String element) {
        if (flag) {
            set1.add(element);
        } else if (!flag) {
            for (String st : set1) {
                if (st.equalsIgnoreCase(element))
                    System.out.println("Element found on set, element is: " + st);
            }

        }
    }

    public void checkElement(String check) {
        for (String st : set2) {
            if (st.equalsIgnoreCase(check))
                System.out.println("Element found on LinkedHashSet, element is: " + st);
        }
    }


}
