package IO_TextFile;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class testIterator {
    public static void main(String[ ] args) {

        //Tạo thư mục
        File d = new File("D:\\Documents\\CodeGym\\Báo cáo\\datcute.net");
        if (!d.exists())
            d.mkdir();

        //Tạo mới và viết nội dung vào file
        try {
            Formatter f = new Formatter("D:\\Documents\\CodeGym\\Báo cáo\\datcute.net\\testIO.txt");
            f.format("Đây là file Vidu\r\n", null);
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown");

            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        //Đọc nội dung file
        try {
            File x = new File("D:\\Documents\\CodeGym\\Báo cáo\\datcute.net\\testIO.txt");
            Scanner sc = new Scanner(x);
            String content = "";
            while(sc.hasNextLine()) {
                content += sc.nextLine()+"\r\n";
            }
            System.out.println(content);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}