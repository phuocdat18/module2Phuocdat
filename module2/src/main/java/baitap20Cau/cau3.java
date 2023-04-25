package baitap20Cau;

public class cau3 {
    public static void main(String[] args) {
        int[] arr = { 25, 42, 55, 67, 75, 86, 95 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 5) {
                count++;
            }
        }
        System.out.println("So luong gia tri tan cung bang 5 trong mang la: " + count);
    }
}
