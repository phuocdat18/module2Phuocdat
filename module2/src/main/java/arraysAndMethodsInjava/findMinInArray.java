package arraysAndMethodsInjava;

public class findMinInArray {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 4, 2 };
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println(minValue);
    }
}
