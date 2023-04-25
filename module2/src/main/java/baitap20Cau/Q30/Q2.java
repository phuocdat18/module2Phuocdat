package baitap20Cau.Q30;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int [] arr = {1,3,5};
        List<Integer> myList = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            myList.add(arr[i]);
        }

        Integer myListadd[] = myList.toArray(new Integer[myList.size()]);
        for (Integer number : myListadd){
            System.out.println(number);
        }
    }
}
