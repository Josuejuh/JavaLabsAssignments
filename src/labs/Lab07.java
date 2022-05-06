package labs;

import java.util.Scanner;

public class Lab07 {

    public static void main(String[] args) {

        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab07 lb = new Lab07();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - AVERAGE ON ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        String[] arr = {"Ciaz", "Alto", "Swift", "Dezire", "Brezza"};
        lb.bubbleSortStringArr(arr);
        //USER INPUT THE WORDS (ONLY 5)
        System.out.println("");
        String[] arr2 = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter next element: ");
            arr2[i] = sc.next();
        }
        lb.bubbleSortStringArr(arr2);

        //CALLING METHOD 02 - COUNT UPPERCASE AND LOWERCASE
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        String characters = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
        lb.countCharactersType(characters);

        //CALLING METHOD 03 - CONCAT WORDS
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        lb.concatTwoWords("Hello ","World!");

        //CALLING METHOD 04 - TRIM SENTENCE
        System.out.println("==========================================");
        System.out.println("EXERCISE 04");
        System.out.println("==========================================");
        lb.trimChain("  She sells sea shells on the sea shore  ");

        //CALLING METHOD 05 - REPLACING P for F
        System.out.println("==========================================");
        System.out.println("EXERCISE 05");
        System.out.println("==========================================");
        lb.replaceLetter("Pan Pun Prank Pit Pat",'P','F');

    }

    public void bubbleSortStringArr(String[] arr) {
        String temp;
        System.out.println("Strings sorted:");
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                // comparing adjacent strings
                if (arr[i].compareTo(arr[j]) < 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print(arr[j] + " , ");
        }
    }

    public void countCharactersType(String chain) {
        int upper = 0, lower = 0, number = 0, special = 0;

        for (int i = 0; i < chain.length(); i++) {
            char ch = chain.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);

    }

    public void concatTwoWords(String word01, String word02){
        String result = "";
        result = word01.concat(word02);
        System.out.println("Concat of words result is: " + result);
    }

    public void trimChain(String nWord){
        System.out.println(nWord.trim());
    }

    public void replaceLetter(String chain, char target, char replace){
        chain = chain.replace(target,replace);
        System.out.println(chain);
    }
}
