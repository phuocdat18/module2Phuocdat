package baitap20Cau.Q30;

import java.security.Key;
import java.util.*;

public class Q17 {

    static Map<String, Integer> myList = new HashMap<>();

    public static void sortByKey() {
        TreeMap<String, Integer> sort = new TreeMap<>(myList);
        sort.putAll(myList);

        for (Map.Entry<String, Integer> entry : sort.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
    public static void sortByValue() {
        Comparator<String> valueComparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return myList.get(s1).compareTo(myList.get(s2));
            }
        };

        TreeMap<String, Integer> sort = new TreeMap<>(valueComparator);
        sort.putAll(myList);

        for (Map.Entry<String, Integer> entry : sort.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

    public static void main(String[] args) {
        myList.put("C" , 15);
        myList.put("A" , 30);
        myList.put("L" , 20);
        myList.put("Z" , 16);

        System.out.println("Sắp xếp theo Key");
        sortByKey();
        System.out.println("Sắp xếp theo Value");
        sortByValue();
    }
}
