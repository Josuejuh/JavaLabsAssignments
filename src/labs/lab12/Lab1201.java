package labs.lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab1201 {
//COMPARATOR
    static class Emmployee {
        //DECLARING VARIABLES
        String name;
        int salary;

        //INITIALIZING CONSTRUCTOR
        Emmployee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    //CREATES THE COMPARATOR FOR COMPARING SALARY
    static class SalaryComparator implements Comparator<Emmployee> {

        public int compare(Emmployee s1, Emmployee s2) {
            if (s1.salary == s2.salary)
                return 0;
            else if (s1.salary > s2.salary)
                return 1;
            else
                return -1;
        }
    }


    public static void main(String[] args) {
        //CREATE THE ARRAYLIST
        ArrayList<Emmployee> s = new ArrayList<Emmployee>();
        s.add(new Emmployee("Macy", 520));
        s.add(new Emmployee("Sam", 213));
        s.add(new Emmployee("Pedro", 1010));
        s.add(new Emmployee("Roberto", 590));
        s.add(new Emmployee("Lucas", 1000));

        System.out.println("Before sorting: ");
        for (Emmployee emp : s) {
            System.out.println(emp.name + " " + emp.salary + " ");
        }
        System.out.println();

        System.out.println(
                "After sorting (sorted by Salary): ");

        //CALLING THE SORT FUNCTION
        Collections.sort(s, new SalaryComparator());
        for (Emmployee emp : s) {
            System.out.println(emp.name + " " + emp.salary + " ");
        }
    }

}
