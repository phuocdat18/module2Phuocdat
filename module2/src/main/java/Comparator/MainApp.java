package Comparator;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr= {6, 1, 5, 8, 2};
        for ( int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
