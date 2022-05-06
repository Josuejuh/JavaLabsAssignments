package assignments;

import java.util.*;

public class Assignment04 {

    static HashMap<Integer, String> hm01 = new HashMap<>();
    static HashSet<String> hm02 = new HashSet<>();
    static TreeSet<Integer> ts01 = new TreeSet<>();

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Assignment04 asg = new Assignment04();

        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - CHARACTER OCCURRENCE USING HASHMAP
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        asg.characterCount("Hello finding occurrences");

        //CALLING METHOD 02 - REVERSE ARRAY
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        List lst = new ArrayList<>();
        lst.add("01");
        lst.add("02");
        lst.add("03");
        asg.reverseArray(lst);

        //CALLING METHOD 03 - CHECK IF KEY EXISTS
        System.out.println("==========================================");
        System.out.println("EXERCISE 03");
        System.out.println("==========================================");
        hm01.put(1, "One");
        hm01.put(2, "Two");
        hm01.put(3, "Three");
        asg.checklKeyHM(2);

        //CALLING METHOD 04 - CHECK IF KEY EXISTS
        System.out.println("==========================================");
        System.out.println("EXERCISE 04");
        System.out.println("==========================================");
        List<Integer> keys = new ArrayList<>(hm01.keySet());
        System.out.println("Keys in list: " + keys);

        //CALLING METHOD 05 - CHECK IF KEY EXISTS
        System.out.println("==========================================");
        System.out.println("EXERCISE 05");
        System.out.println("==========================================");
        hm02.add("Welcome");
        hm02.add("To");
        hm02.add("The");
        hm02.add("Code");
        Object[] arr = hm02.toArray();
        System.out.println("The array that was a hashmap is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        //CALLING METHOD 06 - GET VALUES ONM TREE SET
        System.out.println("==========================================");
        System.out.println("EXERCISE 06");
        System.out.println("==========================================");
        ts01.add(10);
        ts01.add(100);
        ts01.add(21);
        ts01.add(9);
        ts01.add(11);
        asg.getValTree("min",ts01);
        asg.getValTree("max",ts01);

        //CALLING METHOD 07 - SORT ARRAYLIST IN ALPHABETICAL ORDER
        System.out.println("==========================================");
        System.out.println("EXERCISE 07");
        System.out.println("==========================================");
        List lst01 = new ArrayList();
        lst01.add("Zamara");
        lst01.add("Aaron");
        lst01.add("Canada");
        lst01.add("Burgers");
        System.out.println("List not sorted alphabetical: " + lst01);
        Collections.sort(lst01);
        System.out.println("List sorted alphabetical: " + lst01);

        //CALLING METHOD 08 - GET SET VIEW OF KEYS FROM HASHTABLE
        System.out.println("==========================================");
        System.out.println("EXERCISE 08");
        System.out.println("==========================================");
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }

    public void characterCount(String chain) {
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

    public void reverseArray(List ls) {
        Collections.reverse(ls);
        System.out.println(ls);
    }

    public void checklKeyHM(int ls) {
        if (hm01.containsKey(ls)) {
            System.out.println("Key " + ls + " Found");
        } else {
            System.out.println("Key " + ls + " Not Found");
        }
    }

    public void getValTree (String action, TreeSet ls){
        if(action.equalsIgnoreCase("min")){
            System.out.println("The minimun values is: " + ls.first());
        } else if (action.equalsIgnoreCase("max")){
            System.out.println("The maximun values is: " + ls.last());
        }
    }
}
