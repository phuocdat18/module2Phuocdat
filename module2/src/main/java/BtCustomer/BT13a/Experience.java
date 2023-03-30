package BtCustomer.BT13a;

import java.util.Date;

public class Experience extends Employee{
    private int ExpInYear;
    private String ProSkill;
    public Experience() {

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
}