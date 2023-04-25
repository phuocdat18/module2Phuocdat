package baitap20Cau.Q30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q16 {
    public static void main(String[] args) {
        HashMap<String, String> myList = new HashMap<>();
        myList.put("Girl1", "đẹp");
        myList.put("Girl2", "xinh");

//        for (String key : myList.keySet()) {
//            System.out.println(key + " " + myList.get(key));
//        }

        Set<String> keySet = myList.keySet();
        Iterator<String> keySetIterator = keySet.iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            System.out.println(key + " " + myList.get(key));
        }

//        Set<Map.Entry<String, String>> entrySet = myList.entrySet();
//        for (Map.Entry entry : entrySet) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

//        Set<Map.Entry<String, String>> entrySet1 = myList.entrySet();
//        Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
//        while (entrySetIterator.hasNext()) {
//            Map.Entry entry = entrySetIterator.next();
//            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
//        }
    }
}
