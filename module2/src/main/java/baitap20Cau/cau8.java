package baitap20Cau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class cau8 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 2, 7};
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                myList.add(arr[i]);
            }
        }
        Collections.sort(myList);
        int[] result = new int[arr.length];
        int evenNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = arr[i];
            } else {
                result[i] = myList.get(evenNumbers);
                evenNumbers++;
            }
            if (evenNumbers == myList.size()) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
