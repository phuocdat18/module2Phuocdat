package baitap20Cau.Q30;

import java.util.HashSet;
import java.util.Iterator;

public class Q3 {
    public static void main(String[] args) {
        String [] arr = {"a", "b"};
        HashSet<String> myList = new HashSet<String>();
        for(int i = 0; i < arr.length; i++) {
            myList.add(arr[i]);
        }

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
