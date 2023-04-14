package ExamModule2.views;

import ExamModule2.utils.ConverUtils;
import ExamModule2.utils.ValidateUtils;
import ExamModule2.model.Student;
import ExamModule2.service.StudentService;



import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentView {

    private static StudentService studentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public void add() {
        int id;
        Random r = new Random();
        int low = 1;
        int high = 9999;
        do {
            id = r.nextInt(high - low) + low;
        } while (studentService.exists(id));

        System.out.println("Nhập họ tên sinh viên: (vd: Đạt kute) ");
        System.out.print("➨ ");
        String ten = scanner.nextLine();
        String namecheck;
        namecheck = ConverUtils.removeAccent(ten);

        System.out.println("Nhập tuổi của sinh viên: ");
        int tuoi;
        do {
            tuoi = Integer.parseInt(scanner.nextLine());
            if (!(tuoi >= 0)) {
                System.out.println("Sai \n" +
                        " \t Xin vui lòng nhập lại! \n ➨ \t ");
                System.out.print("➨ \t ");
            }
        } while (!(tuoi >= 0));
        System.out.printf("➨ \t ");


        System.out.println("Nhập giới tính của sinh viên");
        System.out.print("➨ ");
        String gioiTinh = scanner.nextLine();
        while (!ValidateUtils.isGioitinh(gioiTinh)) {
            System.out.println("Giới tính " + gioiTinh + " không đúng." + " Vui lòng nhập lại!" + " (Tên phải viết hoa chữ cái đầu và có dấu)");
            System.out.println("Nhập giới tính (ví dụ: Nam hoặc Nữ");
            System.out.print("➨ ");
            gioiTinh = scanner.nextLine();
        }


        System.out.print("Nhập địa chỉ: \n➨ \t");
        String diaChi = scanner.nextLine();

        System.out.print("Nhập điểm trung bình ");
        double diemTrungBinh;
        do {
            diemTrungBinh = Double.parseDouble(scanner.nextLine());
            if (!(diemTrungBinh > 0)) {
                System.out.print("Nhập sai. Xin vui lòng nhập lại!");
                diemTrungBinh = Double.parseDouble(scanner.nextLine());
            }
        } while (!(diemTrungBinh > 0));

        Student student = new Student(id, ten, tuoi, gioiTinh, diaChi, diemTrungBinh);
        studentService.addItem(student);
        System.out.println("Đã thêm sinh viên thành công!");
        show(studentService.getItem());


        boolean flag = true;
        do {
            System.out.printf(" Nhấn 1 để thêm sinh viên \n Nhấn 2 để quay lại \n Nhấn 3 để thoát \n");
            System.out.print("➨ \t ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    Menu.mainMenu();
                    break;
                case 3:
                    Menu.exit();
                    break;
                default:
                    System.out.println("Xin vui lòng nhập lại!");
                    flag = false;
            }
        } while (!flag);
    }


    public void update() {
        show(studentService.getItem());
        System.out.print("Nhập thông tin sinh viên cần sửa \t ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            if (studentService.exists(id)) {
                Menu.update();
                boolean is = true;
                do {
                    try {
                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice) {
                            case 1:
                                inputTen(id);
                                break;
                            case 2:
                                inputTuoi(id);
                                break;
                            case 3:
                                inputGioiTinh(id);
                                break;
                            case 4:
                                inputDiachi(id);
                                break;
                            case 5:
                                inputDiemTrungBinh(id);
                                break;
                            case 0:
                                Menu.mainMenu();
                                break;
                            default:
                                System.out.print("Chưa hợp lệ!! Mời Nhập Lại\n");
                                is = false;
                        }
                    } catch (Exception e) {
                        update();
                    }
                } while (!is);
                boolean flag = true;
                do {
                    System.out.print("Nhấn 1 để tiếp tục cập nhật \nNhấn 2 để quay lại \nNhấn 3 để thoát... \n=> \t");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            update();
                            break;
                        case 2:
                            Menu.mainMenu();
                            break;
                        case 3:
                            Menu.exit();
                            break;
                        default:
                            System.out.println("Mời Nhập Lại");
                            flag = false;
                    }
                } while (!flag);
            } else {
                System.out.println("Mời Nhập Lại");
                update();
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public void show(List<Student> studentList) {

        System.out.println("╔══════════════════════════════════════════════DANH SÁCH SINH VIÊN═════════════════════════════════════════════════════════════╗");
        System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
        for (Student student : studentList) {
            System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n",student.getId(), student.getName(), student.getTuoi(), student.getGioitinh(), student.getDiachi(), student.getDiemTB());
        }
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }


    public void showStudent() {
        show(studentService.getItem());
        boolean flag = true;
        do {
            System.out.println("╔═════════════════════════════════════════════════════════╗");
            System.out.println("║   1. Quay lại                                           ║");
            System.out.println("║   2. Thoát                                              ║");
            System.out.println("╚═════════════════════════════════════════════════════════╝");
            System.out.print("\t➺ ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (choice) {
                    case 1:
                        Menu.mainMenu();
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Vui lòng nhập lại!");
                        flag = false;
                }
            } catch (Exception e) {
                System.out.println("Chưa hợp lệ! Xin vui lòng nhập lại!");
            }
        } while (!flag);
    }

    public void inputTen(int id) {
        Student student = studentService.getStudentByID(id);
        System.out.printf("Cập nhật tên sinh viên: \n➨ \t");
        String ten = scanner.nextLine().trim();
        student.setName(ten);
        studentService.update(student);
        show(studentService.getItem());
        System.out.println("Cập nhật thành công!");
    }

    public void inputTuoi(int id) {
        Student student = studentService.getStudentByID(id);
        System.out.printf("Cập nhật tuổi sinh viên: \n➨ \t");
        int tuoi = Integer.parseInt(scanner.nextLine().trim());
        student.setTuoi(tuoi);
        studentService.update(student);
        show(studentService.getItem());
        System.out.println("Cập nhật thành công!");
    }

    public void inputGioiTinh(int id) {
        Student student = studentService.getStudentByID(id);
        System.out.printf("Cập nhật giới tính sinh viên: \n➨ \t");
        String gioiTinh = scanner.nextLine();
        student.setGioitinh(gioiTinh);
        studentService.update(student);
        show(studentService.getItem());
        System.out.println("Cập nhật thành công!");
    }

    public void inputDiachi(int id) {
        Student student = studentService.getStudentByID(id);
        System.out.printf("Cập nhật địa chỉ của sinh viên: \n➨ \t");
        String diaChi = scanner.nextLine();
        student.setDiachi(diaChi);
        studentService.update(student);
        show(studentService.getItem());
        System.out.println("Cập nhật thành công!");
    }

    public void inputDiemTrungBinh(int id) {
        Student student = studentService.getStudentByID(id);
        System.out.printf("Cập nhật điểm trung bình của sinh viên: \n➨ \t");
        double diemTrungBinh = Double.parseDouble(scanner.nextLine().trim());
        student.setDiemTB(diemTrungBinh);
        studentService.update(student);
        show(studentService.getItem());
        System.out.println("Cập nhật thành công!");
    }


    public void remove() {
        List<Student> studentList = studentService.getItem();
        show(studentList);
        System.out.printf("Nhập mã sinh viên \n➨ \t");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = studentService.getStudentByID(id);
        if (student != null) {
            boolean check = true;
            Menu.removeConfirm();
            String chon = scanner.nextLine();
            try {
                switch (chon) {
                    case "y":
                        studentService.remove(student.getId());
                        System.out.println("Xóa thành công sinh viên ra khỏi danh sách!");
                        show(studentService.getItem());
                        do {
                            System.out.println("╔═════════════════════════════════════════════════════════╗");
                            System.out.println("║   1. Quay lại                                           ║");
                            System.out.println("║   2. Thoát                                              ║");
                            System.out.println("╚═════════════════════════════════════════════════════════╝");
                            System.out.print("\t➺ ");
                            int choice = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice) {
                                case 1:
                                    Menu.mainMenu();
                                    break;
                                case 2:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("\t Nhập lại!!! ");
                                    check = false;
                            }
                        } while (!check);
                        break;
                    case "c":
                        Menu.mainMenu();
                        break;
                    default:
                        System.out.println("Vui lòng nhập lại!");
                }
            } catch (Exception e) {
                System.out.println("Chưa hợp lệ! Xin vui lòng nhập lại!");
            }
        }
    }
    public void showAll() {
        List<Student> studentList = studentService.getItem();
        try {
            System.out.println("╔══════════════════════════════════════════════DANH SÁCH SINH VIÊN═════════════════════════════════════════════════════════════╗");
            System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s", "Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Địa chỉ", "Điểm trung bình");
            for (Student student : studentList) {
                System.out.printf("%-20s %-30s %-10s %-10s %-20s %-15s\n",student.getId(), student.getName(), student.getTuoi(), student.getGioitinh(), student.getDiachi(), student.getDiemTB());
            }
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            boolean flag = true;
            do {
                System.out.print("\tNhấn 1 để quay lại \n\tNhấn 2 để thoát chương trình \n\t➨ \t");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        Menu.mainMenu();
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Chưa hợp lệ, mời nhập lại");
                        flag = false;
                }
            } while (!flag);
        } catch (Exception ex) {
            ex.printStackTrace();


        }

    }
}