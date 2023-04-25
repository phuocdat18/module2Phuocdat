package ExamModule2.views;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static boolean isFinished = false;
    static StudentView studentView = new StudentView();

    public static void student() {
        Scanner scanner = new Scanner(System.in);
        mainMenu();
        while (!isFinished) {
            try {
                System.out.println("\nChọn chức năng ");
                System.out.print("\t➺ ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        studentView.showAll();
                        break;
                    case 2:
                        studentView.add();
                        break;
                    case 3:
                        studentView.update();
                        break;
                    case 4:
                        studentView.remove();
                        break;
                    case 5:
                        MenuSort.sortMenu();
                        break;
                    case 6:
                        MenuSort.sortMenu();
                        break;
                    case 7:
                        studentView.readStudentListFromCsv();
                        break;
                    case 8:
                        exit();
                        isFinished = true;
                        break;
                    default:
                        System.out.println("Chọn chức năng không đúng! Mời chọn lại");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai! Mời nhập lại");
                scanner.nextLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void mainMenu() {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("║                     Giao diện quản lý                   ║");
        System.out.println("║                                                         ║");
        System.out.println("║   1. Xem danh sách sinh viên                            ║");
        System.out.println("║   2. Thêm mới                                           ║");
        System.out.println("║   3. Cập nhật                                           ║");
        System.out.println("║   4. Xóa                                                ║");
        System.out.println("║   5. Sắp xếp                                            ║");
        System.out.println("║   6. Đọc từ file                                        ║");
        System.out.println("║   7. Ghi từ file                                        ║");
        System.out.println("║   8. Thoát                                              ║");
        System.out.println("║                                                         ║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }

    public static void exit() {

        System.out.println("\t\t\t\t\t  ⚰️Hẹn gặp lại⚰️");
        System.exit(0);
    }

    public static void update() {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("║               Tìm kiếm thông tin Sinh viên              ║");
        System.out.println("║                                                         ║");
        System.out.println("║   1. Cập nhật họ tên sinh viên                          ║");
        System.out.println("║   2. Cập nhật tuổi của sinh viên                        ║");
        System.out.println("║   3. Cập nhật giới tính sinh viên                       ║");
        System.out.println("║   4. Cập nhật địa chỉ sinh viên                         ║");
        System.out.println("║   5. Cập nhật điểm trung bình sinh viên                 ║");
        System.out.println("║   6. Quay lại                                           ║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }

    public static void removeConfirm() {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("║                 Bạn có muốn xóa không?                  ║");
        System.out.println("║   1. Đồng ý                                             ║");
        System.out.println("║   2. Quay lại                                           ║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }
}
