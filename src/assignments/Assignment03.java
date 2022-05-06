package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Assignment03 {

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Assignment03 asg = new Assignment03();

        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - OCCURRENCE OF A CHARACTER
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        asg.charOccur("DevLabs Alliance Training");

        //CALLING METHOD 02 - CHECK IF A WORD IS PALINDROME
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        if (asg.checkPalindrome("trurt"))
            System.out.println("The word is palindrome");
        else
            System.out.println("The word is not palindrome");

        //CALLING METHOD 03 - CHECK IF A WORD IS IN A SENTENCE
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        asg.checkWordOnChain("brown", "A brown fox ran away fast");

        //CALLING METHOD 04 - CONVERSION STRING TO ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 04");
        System.out.println("==========================================");
        String example01 = "String";
        char[] example02 = {'H', 'E', 'L', 'L', 'O'};
        char[] example03 = {};
        //STRING TO CHAR
        asg.conversionStringChar(example01, example03, true);
        //CHAR TO STRING
        asg.conversionStringChar("", example02, false);

        //CALLING METHOD 05 - EXCEPTION HANDLING
        System.out.println("==========================================");
        System.out.println("EXERCISE 05");
        System.out.println("==========================================");
        try {
            asg.NumberException("Hola");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //CALLING METHOD 06 - ARITHMETIC EXCEPTION HANDLING
        System.out.println("==========================================");
        System.out.println("EXERCISE 06");
        System.out.println("==========================================");
        try {
            int num = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        //EXERCISE 07 - TRY CATCH NESTED
        System.out.println("==========================================");
        System.out.println("EXERCISE 07");
        System.out.println("==========================================");
        try {
            try {
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }


        //EXERCISE 08 - RE THROW EXCEPTION
        System.out.println("==========================================");
        System.out.println("EXERCISE 08");
        System.out.println("==========================================");
        try {
            int num = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ArithmeticException();
        }

    }


    public void charOccur(String chain) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = chain.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;

    }

    public void checkWordOnChain(String word, String chain) {
        if (chain.contains(word)) {
            System.out.println("The phrase: '" + chain + "' contains the word: " + word);
        } else {
            System.out.println("The phrase: '" + chain + "' does not contains the word: " + word);
        }
    }

    public void conversionStringChar(String word, char[] charArray, Boolean flag) {
        if (flag) {
            System.out.println("The string is: " + word);
            char[] ch = word.toCharArray();
            System.out.println("Character Array...");
            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i] + " ");
            }
        } else if (!flag) {
            String Fstring = String.valueOf(charArray);
            System.out.println("");
            System.out.println("The Char converted in String is: " + Fstring);
        }
    }

    public void NumberException(String integer) {
        int num = parseInt(integer);
    }

}
