package BtCustomer.BT13a;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DehaCompany {
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

        employees.add(ep1);
        employees.add(ep2);
        //Date graduationDate, String graduationRank, String education
        Employee ep3 = new Fresher(new Date(2017, 7, 30), "Gioi", "Kinh te");
        ep3.setFullName("Han Hoan");
        ep3.setEmail("han.hoan@gmail.com");
        ep3.setPhone("0357791212");
        employees.add(ep3);


    }

    public void showEmployees() {
        System.out.printf("%5s | %20s | %30s | %20s | %30s \n", "ID", "FullName", "Email", "Address", "Type");
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeType() == EmployeeType.Experience) {
                Experience experience = (Experience) employees.get(i);
                System.out.printf("%5s | %20s | %30s | %20s | %30s \n",
                        experience.getId(), experience.getFullName(), experience.getEmail(),
                        experience.getEmployeeType(), experience.getExpInYear(), experience.getProSkill());
            }
//
//        public void showEmployees(List<Employee> employees) {
//            System.out.printf("%5s | %20s | %30s | %20s | %30s \n", "ID", "FullName", "Email", "Address", "Type");
//            for (int i = 0; i < employees.size(); i++) {
//                Employee employee = employees.get(i);
//                System.out.printf("%5s | %20s | %30s | %20s | %30s \n",
//                        employee.getId(), employee.getFullName(), employee.getEmail(),
//                        employee., employee.);
//            }
//        }

        }


    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        DehaCompany managerCustomer = new DehaCompany();
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý employee: ");
            System.out.println("Nhấn 1. Xem danh sách");
            System.out.println("Nhấn 2. Thêm nhân viên ");
            System.out.println("Nhấn 3. Sửa thông tin nhân viên");
            System.out.println("Nhấn 4. Xóa nhân viên");
            System.out.println("Nhấn 5. Tìm kiếm nhân viên theo kiểu ");
            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    managerCustomer.showEmployees();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Nhập sai! Vui lòng nhập lại: ");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
                String actionMenuContinue = scan.nextLine();
                switch (actionMenuContinue) {
                    case "Y":
                        checkActionMenu = true;
                        checkActionMenuContinue = false;
                        break;
                    case "N":
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                        break;
                    default:
                        checkActionMenuContinue = true;
                }
            } while (checkActionMenuContinue);
        } while (checkActionMenu);
    }

}