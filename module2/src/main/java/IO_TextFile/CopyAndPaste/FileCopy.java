package IO_TextFile.CopyAndPaste;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "abc.txt";
        String destinationFile = "aaa.txt";
        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                System.out.println("File nguồn không tồn tại.");
                return;
            }

            file = new File(destinationFile);
            if (file.exists()) {
                System.out.println("Tập tin đích đã được tạo.");
//                return;
            }

            InputStream in = new FileInputStream(sourceFile);
            OutputStream out = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            in.close();
            out.close();

            System.out.println("Sao chép thành công vào tập tin " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

