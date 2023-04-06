package BtCustomer.BT13a;
import BtCustomer.BookStore.Book;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getFullName().compareTo(o2.getFullName());
    }

    public static void main(String[] args) {
        // a, b, c, d
        String a1 = "aQuang";
        String a2 = "dQuang";
        System.out.println(a1.compareTo(a2));       // -3

        System.out.println(a2.compareTo(a1));       // 3
    }
}