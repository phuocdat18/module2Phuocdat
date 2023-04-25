package baitap20Cau;

public class cau6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4, 5};
        boolean allInB = true;
        for(int i = 0; i < a.length; i++) {
            boolean found = false;
            for(int j = 0; j < b.length; j++) {
            }
            if(!found) {
                allInB = false;
                break;
            }
        }
        if(allInB) {
            System.out.println("Tất cả các phần tử của mảng a đều nằm trong mảng b");
        } else {
            System.out.println("Không tất cả các phần tử của mảng a nằm trong mảng b");
        }
    }
}
