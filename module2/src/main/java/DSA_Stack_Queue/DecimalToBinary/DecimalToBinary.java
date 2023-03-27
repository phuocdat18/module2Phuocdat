package DSA_Stack_Queue.DecimalToBinary;
import java.util.*;
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int x = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        while (x != 0) {
            int sodu = x % 2;
            stack.push(sodu);
            x /= 2;
        }
        System.out.print("Số nhị phân tương ứng: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}