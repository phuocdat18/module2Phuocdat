package IO_TextFile.FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        char[] arr = {'C','0','1','2', '2', 'K'};
        try {
            FileWriter fw = new FileWriter("./abc.txt");


            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello!!!");



            bw.write(arr,0, arr.length);

            bw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void fileWriterBasic() {
        try {
            FileWriter fw = new FileWriter("./abc.txt");
            fw.write("Hello");
            fw.flush();

//            fw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
