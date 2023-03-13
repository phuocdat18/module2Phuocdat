package LoopInJava;

public class buoi3Bt {
    public class SumArrayExample {
        public static void main(String[] args) {
            int[] numbers = { 2, 4, 6, 8, 10 };
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Tổng các giá trị trong mảng là: " + sum);
        }
    }
}


//public class buoi3Bt {
//    public static void main(String[] args) {
//        int[] numbers = { 2, 4, 6, 8, 10 };
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println("Mảng có " + count + " số chẵn.");
//    }
//}
//
//public class MinValueArrayExample {
//    public static void main(String[] args) {
//        int[] numbers = { 10, 5, 8, 4, 2 };
//        int minValue = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < minValue) {
//                minValue = numbers[i];
//            }
//        }
//        System.out.println("Giá trị nhỏ nhất của mảng là: " + minValue);
//    }
//}
//
//public class AddElementToArrayExample {
//    public static void main(String[] args) {
//        int[] numbers = { 1, 2, 3, 4, 5 };
//        int newElement = 6;
//        int[] newNumbers = new int[numbers.length + 1];
//        for (int i = 0; i < numbers.length; i++) {
//            newNumbers[i] = numbers[i];
//        }
//        newNumbers[numbers.length] = newElement;
//        numbers = newNumbers;
//        System.out.println("Mảng mới là: " + Arrays.toString(numbers));
//    }
//}
