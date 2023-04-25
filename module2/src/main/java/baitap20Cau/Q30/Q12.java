package baitap20Cau.Q30;

import java.util.ArrayList;

public class Q12 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            myList.add(arr[i]);
        }

        myList.add(4);
        myList.add(6);

        for (Integer num : myList) {
            System.out.println(num);
        }
    }
}
