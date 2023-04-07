package IO_TextFile.SumFileText;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./abc.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
    }
}
