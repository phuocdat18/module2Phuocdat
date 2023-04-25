package baitap20Cau;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 2, 7};
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                myList.add(arr[i]);
            }
        }
        Collections.sort(myList);
        System.out.println(myList);
    }
}
