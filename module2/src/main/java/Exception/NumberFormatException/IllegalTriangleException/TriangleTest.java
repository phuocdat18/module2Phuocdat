package Exception.NumberFormatException.IllegalTriangleException;

import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("Cạnh tam giác không thể là số âm hoặc bằng 0.");
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại.");
            }

            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " là cạnh của một tam giác hợp lệ.");

        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
        }

        scanner.close();
    }
}


