package arraysAndMethodsInjava;

import java.util.Arrays;

public class add1numberInarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 2;
        int value = 10;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = value;
        for (int i = pos + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
