package baitap20Cau.Q30;

import java.util.ArrayList;
import java.util.Arrays;

public class Q8 {
    public static void main(String args[]) {
        String[] arr ={"Boston", "Dallas", "New York", "Chicago"};

        ArrayList<String> myList= new ArrayList<>(Arrays.asList(arr));

//        myList.add("San Francisco");
//        myList.add("San jose");

        for(String s : myList) {
            System.out.println(s);
        }
    }
}
