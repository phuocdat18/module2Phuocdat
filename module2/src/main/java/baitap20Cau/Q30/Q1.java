package baitap20Cau.Q30;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {3, 17, 6, 9, 7};
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            myList.add(arr[i]);
        }

        for (Integer number : myList) {
            System.out.println(number);
        }
    }
}
