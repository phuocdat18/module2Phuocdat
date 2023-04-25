package baitap20Cau;

public class cau4 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 7, 5 };
        boolean containsZero = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                containsZero = true;
                break;
            }
        }
        if (containsZero) {
            System.out.println("Mang co gia tri 0");
        } else {
            System.out.println("Mang khong co gia tri 0");
        }
    }
}
