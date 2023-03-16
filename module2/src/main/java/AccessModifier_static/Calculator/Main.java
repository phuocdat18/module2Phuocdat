package AccessModifier_static.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(1, 2)); // Output: 3
        System.out.println(myCalculator.add(1.5, 2.5)); // Output: 4.0
    }
}
