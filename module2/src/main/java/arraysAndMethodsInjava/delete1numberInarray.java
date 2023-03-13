package arraysAndMethodsInjava;

import java.util.Arrays;

public class delete1numberInarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 2;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = pos; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
