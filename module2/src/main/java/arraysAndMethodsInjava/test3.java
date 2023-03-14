package arraysAndMethodsInjava;

public class test3 {
//    // biến static 'ten'
//    public static String ten = "Nguyen Van A";
//
//    // biến static 'tuoi'
//    public static int tuoi = 21;
//
//    public static void main(String args[]) {
//        // Sử dụng biến static bằng cách gọi trực tiếp
//        System.out.println("Ten : " + ten);
//
//        // Sử dụng biến static bằng cách gọi thông qua tên class
//        System.out.println("Tuoi : " + tuoi);
//    }


    // biến instance "ten" kiểu String, có giá trị mặc định là null
    public String ten;

    // biến instance "tuoi" kiểu Integer, có giá trị mặc định là 0
    private int tuoi;

    // sử dụng biến ten trong một constructor
    public test3(String ten) {
        this.ten = ten;
    }

    // sử dụng biến tuoi trong phương thức setTuoi
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showStudent() {
        System.out.println("Ten  : " + ten);
        System.out.println("Tuoi : " + tuoi);
    }

    public static void main(String[] args) {
        test3 sv = new test3("Nguyen Van A");
        sv.setTuoi(21);
        sv.showStudent();
    }





}
