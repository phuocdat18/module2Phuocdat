//package arraysAndMethodsInjava;
//import java.util.Arrays;
//import java.util.Random;
//
//public class StopWatch {
//    public static void main(String[] args) {
//        int[] arr = generateArray(100000);
//        StopWatch sw = new StopWatch();
//
//        sw.start();
//        selectionSort(arr);
//        sw.stop();
//
//        System.out.println("Elapsed time: " + sw.getElapsedTime() + " ms");
//    }
//
//    public static int[] generateArray(int size) {
//        int[] arr = new int[size];
//        Random random = new Random();
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = random.nextInt(size);
//        }
//
//        return arr;
//    }
//
//    public static void selectionSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            if (minIndex != i) {
//                int temp = arr[i];
//                arr[i] = arr[minIndex];
//                arr[minIndex] = temp;
//            }
//        }
//    }
//}
