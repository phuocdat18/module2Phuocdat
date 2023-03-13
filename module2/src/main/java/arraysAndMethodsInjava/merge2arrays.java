package arraysAndMethodsInjava;

import java.util.Arrays;

public class merge2arrays {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };
        int[] c = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            c[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[index++] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
