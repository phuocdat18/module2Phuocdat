package BtCustomer.BT13a;


import BtCustomer.BookStore.BookStore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DehaCompany {
    private Scanner scanner = new Scanner(System.in);
    List<Employee> employees;

    public DehaCompany() {
        employees = new ArrayList<>();
        //long id, String fullName, Date birthDay, String phone, String email,
        // EmployeeType employeeType, int expInYear, String proSkill
        Employee ep1 = new Experience(1L, "Quang Dang", new Date(1992, 7, 18), "033399457133",
                "quang.dang@codegym.vn", EmployeeType.Experience, 5, "Chem gio");
        // String majors, int semester, String universityName)
        Employee ep2 = new Intern("Chem gio", 4, "Duy Tan");
        ep2.setFullName("Quoc Phap");
        ep2.setEmail("phapsukumathon@gmail.com");
        ep2.setBirthDay(new Date(2000, 2, 2));


        Employee ep3 = new Fresher(new Date(), "A", "ĐH huế");
        employees.add(ep3);
        employees.add(ep1);
        employees.add(ep2);
    }

    public void showEmployees() {
        System.out.printf("%5s | %10s | %30s | %20s | %30s | %10s \n",
                "ID", "Name", "Birthday", "Phone", "Email", "Employee Type");
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            System.out.printf("%5s | %10s | %30s | %20s | %30s | %10s \n",
                    e.getId(), e.getFullName(), e.getBirthDay(), e.getPhone(), e.getEmail(), e.getEmployeeType());
        }
    }

    public void addEmployee() {
        System.out.println("Nhập thông tin cơ bản:");
        System.out.println("Họ và tên:");
        String fullName = scanner.nextLine();

        System.out.println("Ngày sinh");
        Date date = new Date();

        System.out.println("Số điện thoại");
        String phone = scanner.nextLine();

        System.out.println("Email");
        String email = scanner.nextLine();

        System.out.println("Bạn muốn thêm loại nào");
        System.out.println("Nhập 1: Thêm Experience");
        System.out.println("Nhập 2: Thêm Fresher");
        System.out.println("Nhập 3: Thêm Intern");

        int actionADD = Integer.parseInt(scanner.nextLine());
        Employee employee = null;

        switch (actionADD) {
            case 1: {
                employee = new Experience(maxId() + 1, fullName, date, phone, email, EmployeeType.Experience);
                inputEmployee(employee, EmployeeType.Experience);
                break;
            }
            case 2: {
                employee = new Fresher(maxId() + 1, fullName, date, phone, email, EmployeeType.Fresher);
                inputEmployee(employee, EmployeeType.Fresher);
                break;
            }
        }
        employees.add(employee);
        showEmployees();
    }

    public Employee fineEmployeeById(long id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.get(i);
            }
        }
        return null;
    }

    public void editEmployee() {
        System.out.println("Nhập ID:");
        long id = Long.parseLong(scanner.nextLine());

        Employee employee = fineEmployeeById(id);

        System.out.println("Bạn muốn cập nhật bấc cập nhân viên loại gì: ");
        System.out.println("Nhập 1: Kinh nghiệm");
        System.out.println("Nhập 2: Không kinh nghiệm ");
        System.out.println("Nhập 3: Thực tập ");
        int actionEdit = Integer.parseInt(scanner.nextLine());
        switch (actionEdit) {
            case 1:
                employee = new Experience(maxId() + 1, employee.getFullName(),
                        employee.getBirthDay(), employee.getPhone(), employee.getEmail(), EmployeeType.Experience);
                inputEmployee(employee, EmployeeType.Experience);
                break;
            case 2:
                employee = new Fresher(maxId() + 1, employee.getFullName(),
                        employee.getBirthDay(), employee.getPhone(), employee.getEmail(), EmployeeType.Fresher);
                inputEmployee(employee, EmployeeType.Fresher);
                break;
        }
        updateEmployeeById(id, employee);
        showEmployees();
    }

    private void updateEmployeeById(long id, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.set(i, employee);
            }
        }
    }


     private void inputEmployeeFresher(Employee employee) {
     System.out.println("Nhập ngày tot nghiệp:");
     Date dateGraduation = new Date();
     System.out.println("Nhập xếp loại tốt nghiệp: ");
     String rankGraduation = scanner.nextLine();
     System.out.println("Tốt nghiệp trường:");
     String graduation = scanner.nextLine();
     if (employee instanceof Fresher) {
     Fresher fresher = (Fresher) employee;
     fresher.setEducation(graduation);
     fresher.setGraduationDate(dateGraduation);
     fresher.setGraduationRank(rankGraduation);
     }
     employees.add(employee);
     }
     private void inputEmployeeExperience(Employee employee) {
     System.out.println("Nhập số năm kinh nghiệm: ");
     int expYear = Integer.parseInt(scanner.nextLine());
     System.out.println("Nhập kĩ năng chuyên môn: ");
     String proSkill = scanner.nextLine();
     //long id, String fullName, Date birthDay, String phone,
     // String email, EmployeeType employeeType, int expInYear, String proSkill
     //        employee = new Experience(maxId()+1, fullName, date, phone,
     //                email, employeeType, expYear, proSkill);
     if (employee instanceof Experience) {
     Experience ex = (Experience) employee;
     ex.setProSkill(proSkill);
     ex.setExpInYear(expYear);
     }
     employees.add(employee);
     System.out.println(employee);
     }

    private void inputEmployee(Employee employee, EmployeeType type) {
        switch (type) {
            case Experience:
                System.out.println("Nhập số năm kinh nghiệm: ");
                int expYear = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập kĩ năng chuyên môn: ");
                String proSkill = scanner.nextLine();
                if (employee instanceof Experience) {
                    Experience ex = (Experience) employee;
                    ex.setProSkill(proSkill);
                    ex.setExpInYear(expYear);
                }
                break;
            case Fresher:
                System.out.println("Nhập ngày tốt nghiệp:");
                Date dateGraduation = new Date();
                System.out.println("Nhập xếp loại tốt nghiệp: ");
                String rankGraduation = scanner.nextLine();
                System.out.println("Tốt nghiệp trường:");
                String graduation = scanner.nextLine();

                if (employee instanceof Fresher) {
                    Fresher fresher = (Fresher) employee;
                    fresher.setEducation(graduation);
                    fresher.setGraduationDate(dateGraduation);
                    fresher.setGraduationRank(rankGraduation);
                }
                break;

        }
    }

//    public static void main(String[] args) {
//        DehaCompany dehaCompany = new DehaCompany();
//        dehaCompany.editEmployee();
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DehaCompany dehaCompany = new DehaCompany();
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý sách: ");
            System.out.println("Nhấn 1. Xem danh sách nhân viên");
            System.out.println("Nhấn 2. Thêm nhân viên danh sách");
            System.out.println("Nhấn 3. Sửa thông tin nhân viên");
            System.out.println("Nhấn 4. Xóa thông tin nhân viên");
            System.out.println("Nhấn 5. Sắp xếp nhân viên theo ID");
            System.out.println("Nhấn 6. Sắp xếp nhân viên theo tên");
            System.out.println("Nhấn 7. Tìm kiếm nhân viên theo tên");
            System.out.println("Nhấn 8. Tìm kiếm kiếm nhân viên bằng thông tin");
            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    dehaCompany.showEmployees();
                    break;
                case 2:
                    dehaCompany.addEmployee();
                    break;
                case 3:
                    dehaCompany.editEmployee();
                    break;
                default:
                    System.out.println("Nhập sai! Vui lòng nhập lại");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục hay không: c/k");
                String actionMenuContinue = scan.nextLine();
                switch (actionMenuContinue) {
                    case "c":
                        checkActionMenu = true;
                        checkActionMenuContinue = false;
                        break;
                    case "k":
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                        break;
                    default:
                        checkActionMenuContinue = true;
                }
            }while (checkActionMenuContinue) ;

        } while (checkActionMenu);

    }
    public long maxId() {
        employees.sort(new ComparatorById());
        return employees.get(employees.size() - 1).getId();
    }

}