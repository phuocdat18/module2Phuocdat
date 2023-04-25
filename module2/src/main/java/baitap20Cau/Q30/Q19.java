package baitap20Cau.Q30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q19 {
    public static void main(String[] args) {
        Integer[] arr = {5,7,1,3,2};
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(arr));

//        myList.sort((o1, o2) -> o2 - o1);
        Collections.sort(myList, Collections.reverseOrder());

        for (Integer number : myList) {
            System.out.println(number + " ");
        }
    }

}
