package LoopInJava;

import java.util.Scanner;

public class Buoi2Advanced {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        printSquareStar();
//        printTriangleStarTopLeft();
//        printTriangleStarTopRight();
//       printTriangleStarBotLeft();
        boolean checkActionMenu = false;
        do {
            System.out.println("Chọn chức năng cần in ra");
            System.out.println("Nhấn 1: In hình vuông sao");
            System.out.println("Nhấn 2: In tam giác sao trên - trái");
            System.out.println("Nhấn 3: In tam giác sao trên - phải");

            // Bài tập
            System.out.println("Nhấn 4: In tam giác sao dưới - trái");
            System.out.println("Nhấn 5: In tam giác sao dưới - phải");
            System.out.println("Nhấn 6: In ra viền ngoài hình vuông");
            System.out.println("Nhấn 7: In ra 2 đường chéo");
            int actionMenu = scanner.nextInt();

            switch (actionMenu) {
                case 1:
                    printSquareStar();
                    break;
                case 2:
                    printTriangleStarTopLeft();
                    break;
                case 3:
                    printTriangleStarTopRight();
                    break;
                case 4:
                    printTriangleStarBotLeft();
                    break;
                case 5:
                    printTriangleStarBotRight();
                    break;
                case 6:
                    printSquareBorder();
                    break;
                    case 7:
                        printMatrixDiagonalCrossStars();
                    break;
            }
            checkActionMenu = true;
        } while (checkActionMenu);

    }

    public static int size = 10;

    private static void printTriangleStarTopRight() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("   ");
            }
            for (int j = i; j < size; j++) {
                System.out.printf("*  ");
            }
            System.out.println();
        }
    }

    public static void printTriangleStarTopLeft() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void printSquareStar() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }


    private static void printTriangleStarBotLeft() {
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    private static void printTriangleStarBotRight() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.printf("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("*  ");
            }
            System.out.println();
        }
    }

    private static void printSquareBorder() {
        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < size - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < size - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("*  ");
        }
        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
    }

    private static void printMatrixDiagonalCrossStars() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}




