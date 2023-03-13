package LoopInJava;

//public class test {
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 5, 6, 3, 2, 9};
//
//        for( int i = 0; i < numbers.length /2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[numbers.length - 1 -i];
//            numbers[numbers.length -1 -i] = temp;
//        }
//
//    }
//}

import java.util.Arrays;

public class test {
    public static void RemoveElementFromArray(int [] a; int index) {
        int
    }
    }


public class RemoveElementFromArray {
    public static void main(String[] args) {

        int index = 2;
        int value = 10;
        int[] newa = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
            newa[i] = a[i];
        }
        newa[index] = value;
        for (int i = index + 1; i < newa.length; i++) {
            newa[i] = a[i - 1];
        }
        System.out.println( Arrays.toString(newa));
    }
}


public class RemoveElementFromArrayExample {
    public static void main(String[] args) {
        int pos = 2;
        int[] newArr = new int[a.length - 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = a[i];
        }
        for (int i = pos; i < a.length - 1; i++) {
            newa[i] = [i + 1];
        }
        System.out.println("Mảng mới: " + Arrays.toString(newArr));
    }
}