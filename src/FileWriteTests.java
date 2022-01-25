import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileWriteTests {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        FileOutputStream fos = new FileOutputStream(file);

        for (byte b :"Hello World! 123".getBytes(StandardCharsets.UTF_8)){
            fos.write(b);
        }

        fos.flush();
        fos.close();

        new Scanner(System.in).nextLine();
//        fos.close();
    }
}
