package labs.lab12;

import java.util.ArrayList;
import java.util.Collections;

public class Lab1202 {
    //COMPARABLE
    public static class Student implements Comparable {
        private String studentname;

        private int studentage;

        public Student(String studentname, int studentage) {
            this.studentname = studentname;
            this.studentage = studentage;
        }

        public String getStudentname() {
            return studentname;
        }

        public void setStudentname(String studentname) {
            this.studentname = studentname;
        }

        public int getStudentage() {
            return studentage;
        }

        public void setStudentage(int studentage) {
            this.studentage = studentage;
        }

        @Override
        public String toString() {
            return "[ Name: " + studentname + ", Age: " + studentage + "]";
        }

        @Override
        public int compareTo(Object compares2) {
            int compareAge = ((Student) compares2).getStudentage();
            return this.studentage - compareAge;
        }


    }

    public static void main(String args[]) {
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student("Paola", 60));
        arraylist.add(new Student("Cristina", 39));
        arraylist.add(new Student("Francisco", 21));

        Collections.sort(arraylist);

        for (Student str : arraylist) {
            System.out.println(str);
        }
    }

}
