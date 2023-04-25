package baitap20Cau.Q30;

import java.util.Arrays;
import java.util.HashSet;

public class Q13 {
    public static void main(String[] args) {
        Integer[] arr = {1,5,6,2};
        HashSet<Integer> myList = new HashSet<>(Arrays.asList(arr));

        myList.add(3);
        myList.add(7);

        for (Integer num : myList) {
            System.out.println(num);
        }
    }
}
