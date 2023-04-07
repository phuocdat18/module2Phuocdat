package IO_TextFile.FileReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.Reader;

public class FileReaderExample {
    public static void main(String args[]) throws Exception {

        File file = new File("D:\\Documents\\CodeGym\\Báo cáo\\datcute.net\\testIO.txt");
        FileReader fr = new FileReader(file);



        /**
        int t1 = fr.read();

        System.out.println(t1);
        System.out.println((char) t1);


        int t2 = fr.read();

        System.out.println(t2);
        System.out.println((char) t2);
         **/
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}