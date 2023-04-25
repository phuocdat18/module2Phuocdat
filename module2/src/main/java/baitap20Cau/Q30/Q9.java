package baitap20Cau.Q30;

import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i =0; i < arr.length; i++) {
            myList.add(arr[i]);
        }
        System.out.println(myList.size());
    }
}
