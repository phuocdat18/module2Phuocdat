package baitap20Cau.Q30;

import java.util.HashSet;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        HashSet<Integer> myList = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            myList.add(arr[i]);
        }

        if(myList.contains(2)) {
            System.out.println("có số 2");
        } else {
            System.out.println("không có số 2");
        }
    }
}
