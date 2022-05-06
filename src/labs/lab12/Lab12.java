package labs.lab12;

import java.util.*;

public class Lab12 {
    //DECLARING LISTS
    static List lst1 = new ArrayList();
    static List lst2 = new ArrayList();
    static List<String> lst3 = new LinkedList<>();


    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab12 lb = new Lab12();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - ADD LIST TO LIST
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        //ADDING ELEMENTS TO THE LIST
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst2.add(4);
        lst2.add(5);
        lst2.add(6);
        //MIXING THE LISTS AND PRINTING IT
        lb.addListToList(lst1, lst2);

        //CALLING METHOD 02 - ADD BOOKS AND PRINTING BACK AND FOR WARD
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        //ADDING ELEMENTS TO THE LIST
        lst3.add("Book1");
        lst3.add("Book2");
        lst3.add("Book3");
        lst3.add("Book4");
        lst3.add("Book5");
        lst3.add("Book6");
        //MIXING THE LISTS AND PRINTING IT
        lb.iterateList(lst3);

        //CALLING METHOD 03 - FIND MAX AND MIN
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        lb.minAndMax(lst3);

    }

    public void addListToList(List ls1, List ls2) {
        ls1.addAll(ls2);
        System.out.println("The combination of the list contains: " + Arrays.toString(ls1.toArray()));
    }

    public void iterateList(List lst) {
        ListIterator<String> listIterator = lst.listIterator();

        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    public void minAndMax (List lst){
        System.out.println("The MIN of the list is: " + Collections.min(lst));
        System.out.println("The MAX of the list is: " + Collections.max(lst));

    }
}
