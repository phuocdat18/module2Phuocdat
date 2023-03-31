package BtCustomer.BT13a;


import BtCustomer.BookStore.Book;
import BtCustomer.BookStore.BookStore;
import BtCustomer.BookStore.ComparatorByPrice;

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
        Employee ep1 = new Experience(1, "Quang Dang", new Date(92, 7, 18), "033399457133",
                "quang.dang@codegym.vn", EmployeeType.Experience, 5, "Chem gio");
        employees.add(ep1);
        employees.add(new Employee(2, "Long", new Date(99, 3, 19), "08514512364",
                "long@gmail.com",EmployeeType.Fresher));
        employees.add(new Employee(3, "Đạt", new Date(99, 3, 18), "0856419555",
                "dat@gmail.com",EmployeeType.Experience));
        employees.add(new Employee(4, "Dũng", new Date(99, 7, 23), "0545242364",
                "dung@gmail.com",EmployeeType.Intern));
//        for (int i = employees.size() - 3; i < employees.size(); i++) {
//            System.out.println(employees.get(i).toString());
//        }
        // String majors, int semester, String universityName)
        Employee ep2 = new Intern("Chem gio", 4, "Duy Tan");
        ep2.setFullName("Quoc Phap");
        ep2.setEmail("phapsukumathon@gmail.com");
        ep2.setBirthDay(new Date(2000, 2, 2));


        Employee ep3 = new Fresher(new Date(), "A", "ĐH huế");
//        employees.add(ep3);
//        employees.add(ep1);
//        employees.add(ep2);
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
    public void showEmployees(List<Employee> employees) {
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
//            case 3: {
//                employee = new Intern(maxId() + 1, fullName, date, phone, email, EmployeeType.Intern);
//                inputEmployee(employee, EmployeeType.Intern);
//                break;
//            }
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
     Date graduationDate = new Date();
     System.out.println("Nhập xếp loại tốt nghiệp: ");
     String graduationRank = scanner.nextLine();
     System.out.println("Tốt nghiệp trường:");
     String graduation = scanner.nextLine();
     if (employee instanceof Fresher) {
     Fresher fresher = (Fresher) employee;
     fresher.setEducation(graduation);
     fresher.setGraduationDate(graduationDate);
     fresher.setGraduationRank(graduationRank);
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

     }
    private void inputEmployeeIntern(Employee employee) {
        System.out.println("Chuyên ngành đang học là gì:");
        String majors = scanner.nextLine();
        System.out.println("Học kì đang học: ");
        int semester = scanner.nextInt();
        System.out.println("Trường học:");
        String universityName = scanner.nextLine();
        if (employee instanceof Intern) {
            Intern intern = (Intern) employee;
            intern.setMajors(majors);
            intern.setSemester(semester);
            intern.setUniversityName(universityName);
        }
        employees.add(employee);

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
            System.out.println("Nhấn 4. Sắp xếp nhân viên theo tên");
            System.out.println("Nhấn 5. Sắp xếp nhân viên theo ID");
            System.out.println("Nhấn 6. Tìm kiếm nhân viên theo tên");
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
                case 4:
                    dehaCompany.sortByName();
                    break;
                case 5:
                    dehaCompany.sortById();
                    break;
                case 6:
                    dehaCompany.searchByName();
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
    private void searchByName() {
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String kw = scanner.nextLine();
        List<Employee> results = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getFullName().contains(kw)){
                results.add(employees.get(i));
            }
        }
        showEmployees(results);
    }
    private void sortByName() {
        employees.sort(new ComparatorByName());
        showEmployees();
    }

    private void sortById() {
//        Comparator comparator = new ComparatorByPrice();
        employees.sort(new ComparatorById());
        showEmployees();
    }
    public long maxId() {
        employees.sort(new ComparatorById());
        return employees.get(employees.size() - 1).getId();
    }

}