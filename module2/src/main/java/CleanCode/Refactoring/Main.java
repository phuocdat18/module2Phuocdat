package CleanCode.Refactoring;

import CleanCode.Refactoring.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = calculator.Calculate(4,5,'+');
        System.out.println(a);
    }
}