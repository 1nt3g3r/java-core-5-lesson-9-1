import java.io.*;
import java.util.Scanner;

public class FileInputStreamTests {
    public static void main(String[] args) throws IOException {
        File file = new File("./data.txt");

        InputStream fileInputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        fileInputStream.close();

    }
}
