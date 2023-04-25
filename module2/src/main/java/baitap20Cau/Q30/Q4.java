package baitap20Cau.Q30;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9};
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for( int i = 0; i < arr.length; i++) {
            myList.add(arr[i]);
        }
//
        if (myList.contains(5)) {
            System.out.println("có số 5");
        } else {
            System.out.println("không có số 5");
        }
    }
}
