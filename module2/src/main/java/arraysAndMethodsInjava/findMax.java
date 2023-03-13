package arraysAndMethodsInjava;

public class findMax {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 4, 2 };
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println(maxValue);
    }
}
