package BtCustomer.BT13a;

import java.util.Date;

public class Experience extends Employee{
    // Lớp con là "Experrience" kế thừa các thuộc tính và phương thức của lớp cha "Employee"
    private int ExpInYear;
    private String ProSkill;
    public Experience() {

    }
    public Experience(long id, String fullName, Date date, String phone, String email, EmployeeType type) {
        super(id, fullName, date, phone, email, type);
    }

    public Experience(int expInYear, String proSkill) {
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public Experience(long id, String fullName, Date birthDay, String phone, String email, EmployeeType employeeType, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "ExpInYear=" + ExpInYear +
                ", ProSkill='" + ProSkill + '\'' +
                '}';
    }
}