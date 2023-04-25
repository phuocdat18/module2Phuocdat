package baitap20Cau.Q30.Q18.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainQ18 {
    public static void main(String args[]){
        ArrayList<Q18> arraylist = new ArrayList<Q18>();
        arraylist.add(new Q18(223, "Chaitanya"));
        arraylist.add(new Q18(245, "Rahul"));
        arraylist.add(new Q18(209, "Ajeet"));

        Collections.sort(arraylist);

        for(Q18 num: arraylist){
            System.out.println(num);
        }
    }

}
