package labs;

import java.util.*;

public class Lab14 {

    static Map<Integer, String> mp = new HashMap();
    static Map<Integer, String> mp01 = new LinkedHashMap<>();

    public static void main(String[] args) {
        //CREATING AN OBJECT TO ACCESS TO THE METHODS
        Lab14 lb = new Lab14();
        //SCANNER CALL
        Scanner sc = new Scanner(System.in);

        //CALLING METHOD 01 - INSERT AND RETRIEVE AND ITERATE
        System.out.println("==========================================");
        System.out.println("EXERCISE 01");
        System.out.println("==========================================");
        mp.put(1, "One Value");
        mp.put(2, "Two Value");
        mp.put(3, "Three Value");
        lb.checkKey(0, "Check");
        System.out.println("HashMap before remove: " + mp);
        lb.checkKey(3, "Remove");
        System.out.println("HashMap after remove: " + mp);

        //CONVERSION FORM MAP TO LIST
        List<String> list = new ArrayList<String>(mp.values());
        System.out.println("The map converted in list is: " + list);

        //ITERATE AND PRINT NODES
        System.out.println("==========================================");
        System.out.println("EXERCISE 02");
        System.out.println("==========================================");
        mp01.put(1, "One Value");
        mp01.put(2, "Two Value");
        mp01.put(3, "Three Value");
        lb.iterateLinkedMap();
    }

    public void checkKey(int keyToBeChecked, String Action) {
        Iterator<Map.Entry<Integer, String>> iterator = mp.entrySet().iterator();
        //FLAG TO STORE THE RESULT OF THE SEARCH
        boolean isKeyPresent = false;
        //ITERATE OVER THE HASHMAP
        while (iterator.hasNext()) {
            // Get the entry at this iteration
            Map.Entry<Integer, String> entry = iterator.next();
            // Check if this key is the required key
            if (keyToBeChecked == entry.getKey()) {
                isKeyPresent = true;
            }
            if (isKeyPresent && Action.equalsIgnoreCase("Remove")) {
                mp.remove(entry.getKey());
            }
        }
        //PRINT THE RESULT
        if (isKeyPresent && Action.equalsIgnoreCase("Check")) {
            System.out.println("Key " + keyToBeChecked + " exists: " + isKeyPresent);
        } else if (!isKeyPresent && Action.equalsIgnoreCase("Check")) {
            System.out.println("Key " + keyToBeChecked + " does not exists: " + isKeyPresent);
        }
    }

    public void iterateLinkedMap() {
        Iterator<Map.Entry<Integer, String>> iterator = mp01.entrySet().iterator();
        //ITERATE OVER THE HASHMAP
        while (iterator.hasNext()) {
            // Get the entry at this iteration
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " and Value: " + entry.getValue());
        }
    }
}


