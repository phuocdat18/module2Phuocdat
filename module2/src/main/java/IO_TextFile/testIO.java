package IO_TextFile;
import java.io.File;

public class testIO {

    public static void main(String[] args) {
        // đường dẫn đến tệp tin
        File x = new File("./abc.txt");

        System.out.println("Tên file: " + x.getName());
        System.out.println("Thư mục: " + x.getParent());
        System.out.println("File: " + x.getPath());         // ra cái gì:
        System.out.println("File 1: " + x.getAbsolutePath());         // ra cái gì:

        // tạo một đối tượng File với đường dẫn đã cho
//        File file = new File(filePath);

        // kiểm tra xem tệp tin đã tồn tại hay chưa
        if (x.exists()) {
            System.out.println(x.getName() + " tồn tại.");
        } else {
            System.out.println("Tệp tin không tồn tại.");
        }

        // lấy tên của tệp tin
        String fileName = x.getName();
        System.out.println("Tên tệp tin: " + fileName);

        // lấy đường dẫn tuyệt đối của tệp tin
        String absolutePath = x.getAbsolutePath();
        System.out.println("Đường dẫn tuyệt đối của tệp tin: " + absolutePath);

        // kiểm tra xem tệp tin có thể đọc được hay không
        if (x.canRead()) {
            System.out.println("Tệp tin có thể đọc được.");
        } else {
            System.out.println("Tệp tin không thể đọc được.");
        }

        // kiểm tra xem tệp tin có thể ghi được hay không
        if (x.canWrite()) {
            System.out.println("Tệp tin có thể ghi được.");
        } else {
            System.out.println("Tệp tin không thể ghi được.");
        }
    }
}
