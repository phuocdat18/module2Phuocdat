package baitap20Cau;

public class cau5 {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 5, 3, 1};
        boolean isDescending = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                isDescending = false;
                break;
            }
        }
        if (isDescending) {
            System.out.println("Mang la mang giam dan");
        } else {
            System.out.println("Mang khong phai la mang giam dan");
        }
    }
}
