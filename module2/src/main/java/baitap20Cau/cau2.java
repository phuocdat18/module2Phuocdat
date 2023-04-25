package baitap20Cau;

import java.util.ArrayList;

public class cau2 {
    public static void main(String[] args) {

        cau2 cau2 = new cau2();
        int[] arr = {2, 4, 7, 11, 13, 16, 17, 19, 23, 29};
        ArrayList<Integer> myList = new ArrayList<>();

        System.out.print("Vi tri cac so nguyen to la: ");
        for (int i = 0; i < arr.length; i++) {
            if (cau2.isPrime(arr[i])) {
                myList.add(arr[i]);
                System.out.print(i + " ");
            }
        }
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
