package baitap20Cau.Q30;

import java.util.Arrays;
import java.util.HashSet;

public class Q11 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        HashSet<Integer> myList = new HashSet<>(Arrays.asList(arr));

        for (Integer num : myList) {
            System.out.println(num);
        }
    }
}
