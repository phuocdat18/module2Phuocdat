package baitap20Cau;

import java.util.ArrayList;

public class cau1 {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 46, 79, 88, 91, 246, 357, 468 };
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            myList.add(arr[i]);
            int num = arr[i];
            boolean isAllOdd = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    isAllOdd = false;
                    break;
                }
                num /= 10;
            }
            if (isAllOdd) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
