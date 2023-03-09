package com.test;

import java.util.Scanner;

public class tinhcannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Cân nặng của bạn(kg):");
        weight = scanner.nextDouble();

        System.out.println("Chiều cao của bạn(m):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Ốm");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Mập");
        else
            System.out.printf("%-20.2f%s", bmi, "Quá mập");
    }
}
