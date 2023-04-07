package IO_TextFile;
import java.util.Formatter;
public class testFormatter {
    public static void main(String[] args) {
        try {
            Formatter f = new Formatter("D:\\Documents\\CodeGym\\Báo cáo\\ab.txt");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
