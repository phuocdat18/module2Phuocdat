package JavaCollectionFramework.ArayList_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> productList = new ArrayList<Product>();

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID sản phẩm: ");
        int id = scanner.nextInt();

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.next();

        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();

        productList.add(new Product(id, name, price));
        System.out.println("\n" +
                "Đã thêm sản phẩm thành công.");
    }

    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID sản phẩm để cập nhật: ");
        int id = scanner.nextInt();

        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Sản phẩm không có.");
            return;
        }

        System.out.print("Nhập tên sản phẩm mới: ");
        String name = scanner.next();

        System.out.print("Nhập giá sản phẩm mới: ");
        double price = scanner.nextDouble();

        product.setName(name);
        product.setPrice(price);
        System.out.println("Đã cập nhật sản phẩm thành công.");
    }

    public void removeProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID to remove: ");
        int id = scanner.nextInt();

        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        productList.remove(product);
        System.out.println("Product removed successfully.");
    }

    public void displayProducts() {
        System.out.println("Product List:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProductByName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name to search: ");
        String name = scanner.next();

        ArrayList<Product> foundProducts = new ArrayList<Product>();
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                foundProducts.add(product);
            }
        }

        if (foundProducts.size() == 0) {
            System.out.println("Product not found.");
        } else {
            System.out.println("Found products:");
            for (Product product : foundProducts) {
                System.out.println(product);
            }
        }
    }

    public void sortProductsAscending() {
        Collections.sort(productList, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() < p2.getPrice()) {
                    return -1;
                } else if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Products sorted in ascending order of price:");
        displayProducts();
    }

    public void sortProductsDescending() {
        Collections.sort(productList, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() > p2.getPrice()) {
                    return -1;
                } else if (p1.getPrice() < p2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Products sorted in descending order of price:");
        displayProducts();
    }

    private Product findProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}