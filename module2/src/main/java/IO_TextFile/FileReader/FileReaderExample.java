package IO_TextFile.FileReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class FileReaderExample {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("D:\\Documents\\CodeGym\\Báo cáo\\datcute.net\\testIO.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}