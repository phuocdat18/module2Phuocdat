package ExamModule2.model;

public class Student implements Student1 {
    private long id;
    private String name;
    private int tuoi;
    private String gioitinh;
    private String diachi;
    private double diemTB;

    public Student() {

    }

    public Student(long id, String name, int tuoi, String gioitinh, String diachi, double diemTB) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.diemTB = diemTB;
    }

    public Student(String raw) {
        String[] strings = raw.split(";");
        this.id = Integer.parseInt(strings[0]);
        this.name = strings[1];
        this.tuoi = Integer.parseInt(strings[2]);
        this.gioitinh = strings[3];
        this.diachi = strings[4];
        this.diemTB = Double.parseDouble(strings[5]);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getId() - o2.getId());
    }
}
