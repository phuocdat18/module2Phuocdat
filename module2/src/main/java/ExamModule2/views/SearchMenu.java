package ExamModule2.views;

import ExamModule2.model.Student;
import ExamModule2.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class SearchMenu {
    static Scanner scanner = new Scanner(System.in);
    static StudentView studentView = new StudentView();
    static StudentService studentService = new StudentService();

    public static void searchMenu() {
        boolean isChoice = true;
        int choice = -1;
        do {
            System.out.println("╔═════════════════════════════════════════════════════════╗");
            System.out.println("║                   TÌM KIẾN NHÂN VIÊN                    ║");
            System.out.println("║   1. Tìm kiếm theo mã sinh viênh                        ║");
            System.out.println("║   1. Tìm kiếm theo tên                                  ║");
            System.out.println("║   1. Tìm kiếm theo giới tính                            ║");
            System.out.println("║   1. Tìm kiếm theo điểm trung bình                      ║");
            System.out.println("║   2. Quay lại                                           ║");
            System.out.println("╚═════════════════════════════════════════════════════════╝");

            System.out.print("Chọn\t➨ ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
            }
            switch (choice) {
                case 1:
                    searchById();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchByGioiTinh();
                    break;
                case 4:
                    searchByDiemTrungBinh();
                    break;
                case 0:
                    Menu.mainMenu();
                    isChoice = false;
                    break;
                default:
                    System.out.println("Chưa hợp lệ! Xin vui lòng nhập lại!");
            }

        } while (isChoice);
    }

    public static void searchByDiemTrungBinh() {
        List<Student> studentList = studentService.getItem();
        int count = 0;
        System.out.println();
        System.out.print("Nhập số điểm trung bình cần tìm kiếm : ");
        try {
            int search = Integer.parseInt(scanner.nextLine());
            System.out.println("Kết quả :  '" + search + "' là : ");
            System.out.println("╔══════════════════════════════════════════════DANH SÁCH TÌM KIẾM══════════════════════════════════════════════════════════════╗");
            System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
            for (Student student : studentList) {
                if (student.getDiemTB() == search) {
                    count++;
                    System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n", student.getId(), student.getName(), student.getTuoi(), student.getGioitinh(), student.getDiachi(), student.getDiemTB());
                    System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                }
            }
            showReturnSearch(count);
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Chưa hợp lệ! Xin vui lòng nhập lại!");
            searchByDiemTrungBinh();
        }
    }

    public static void searchById() {
        List<Student> studentList = studentService.getItem();
        int count = 0;
        System.out.println();
        System.out.print("Nhập mã sinh viên cần tìm kiếm : ");
        try {
            int search = Integer.parseInt(scanner.nextLine());
            System.out.println("Kết quả :  '" + search + "' là : ");
            System.out.println("╔══════════════════════════════════════════════DANH SÁCH TÌM KIẾM══════════════════════════════════════════════════════════════╗");
            System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
            for (Student student : studentList) {
                if (student.getId() == search) {
                    count++;
                    System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n", student.getId(), student.getName(), student.getTuoi(), student.getGioitinh(), student.getGioitinh(), student.getDiemTB());
                    System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                }
            }
            showReturnSearch(count);

        } catch (Exception e) {
            System.out.println("Chưa hợp lệ! Xin vui lòng nhập lại!");
        }
    }

    public static void searchByName() {
        List<Student> studentList = studentService.getItem();
        int count = 0;
        System.out.println();
        System.out.print("Nhập tên sinh viên cần tìm kiếm : ");
        String search = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm của từ khóa '" + search + "' là : ");
        search = search.toLowerCase();
        System.out.println("╔══════════════════════════════════════════════DANH SÁCH TÌM KIẾM══════════════════════════════════════════════════════════════╗");
        System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
        for (Student student : studentList) {
            if (student.getName().toLowerCase().contains(search)) {
                count++;
                System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n", student.getId(), student.getName(), student.getTuoi(), student.getGioitinh(), student.getDiachi(), student.getDiemTB());
                System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            }
            showReturnSearch(count);
        }
    }

    public static void searchByGioiTinh() {
        List<Student> studentList = studentService.getItem();
        int count = 0;
        System.out.println();
        System.out.print("Nhập giới tính cần tìm kiếm : ");
        try {
            String search = scanner.nextLine();
            System.out.println("Kết quả :  '" + search + "' là : ");
            search = search.toLowerCase();
            System.out.println("╔══════════════════════════════════════════════DANH SÁCH TÌM KIẾM══════════════════════════════════════════════════════════════╗");
            System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
            for (Student student : studentList) {
                if (student.getGioitinh().toLowerCase().contains(search)) {
                    count++;
                    System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n", student.getId(), student.getName(), student.getTuoi(), student.getGioitinh(), student.getDiachi(), student.getDiemTB());
                    System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                }
            }
            showReturnSearch(count);
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Chưa hợp lệ! Xin vui lòng nhập lại!");
            searchByDiemTrungBinh();
        }
    }

    public static void showReturnSearch(int count) {
        System.out.println("Có '" + count + "' sản phẩm được tìm thấy!");
        char press = ' ';
        boolean isChoice;
        System.out.println();
        do {
            System.out.print("Nhấn 1 để về menu tìm kiếm! ➨ ");
            try {
                press = scanner.nextLine().charAt(0);
            } catch (Exception e) {
                press = ' ';
            }
            switch (press) {
                case 1: {
                    SearchMenu.searchMenu();
                    isChoice = false;
                    break;
                }
                default:
                    isChoice = true;
            }
        } while (isChoice);
    }
}