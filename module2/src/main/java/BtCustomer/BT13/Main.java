package BtCustomer.BT13;

import BtCustomer.BT13.ui.ScannerFactory;
import BtCustomer.BT13.ui.UIManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UIManager uiManager = new UIManager();
        Scanner scanner = ScannerFactory.getScanner();
        Integer ch = scanner.nextInt();
        while (true) {
            System.out.println("Ứng dụng");
            System.out.println("Nhấn 1: Thêm vào: ");
            System.out.println("Nhấn 2: Tìm kiếm: ");
            // TODO HERE
            System.out.println("Nhấn 4: Thoát:");
            switch (ch) {
                case 1: {
                    // input 0 => insert Experience
                    // input 1 => insert Fresher
                    // input 2 => insert Intern
                    int type = scanner.nextInt();
                    uiManager.insert(type);
                }
                // TODO HERE
            }
        }
    }
}