package baitap20Cau;
import java.util.ArrayList;
import java.util.Collections;

public class cau7 {
    public static void main(String[] args) {
        int[] arr = {-2, 5, 0, 3, -1, 4};
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                myList.add(arr[i]);
            }
        }
        Collections.sort(myList);
        int[] result = new int[arr.length];
        int positiveIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                result[i] = arr[i];
            } else {
                result[i] = myList.get(positiveIndex);
                positiveIndex++;
            }
            if (positiveIndex == myList.size()) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
