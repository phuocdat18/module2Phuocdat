package JavaCollectionFramework.ArayList_LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Cập nhật sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiện sản phẩm");
            System.out.println("5. Tìm sản phẩm bằng tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("8. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    manager.updateProduct();
                    break;
                case 3:
                    manager.removeProduct();
                    break;
                case 4:
                    manager.displayProducts();
                    break;
                case 5:
                    manager.searchProductByName();
                    break;
                case 6:
                    manager.sortProductsAscending();
                    break;
                case 7:
                    manager.sortProductsDescending();
                    break;
                case 8:
                    System.out.println("Thoát khỏi chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 8);
    }
}