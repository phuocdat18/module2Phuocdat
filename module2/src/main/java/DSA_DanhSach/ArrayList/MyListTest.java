package DSA_DanhSach.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        // Create a new list with the default capacity
        MyList<Integer> myList = new MyList<>();

        // Add some elements to the list
        myList.add(10);
        myList.add(20);
        myList.add(30);

        // Print the list
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Remove an element from the list
        int removed = myList.remove(1); // Remove the second element (20)

// Print the updated list
        System.out.println("List after removing element at index 1:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

// Print the removed element
        System.out.println("Removed element: " + removed);
    }
}
