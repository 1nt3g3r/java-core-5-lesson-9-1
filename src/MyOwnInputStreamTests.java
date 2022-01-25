import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class MyOwnInputStreamTests {
    public static void main(String[] args) throws IOException {
//        for (int i = -127; i < 0; i++) {
//            char c = (char) i;
//
//            System.out.println("i = " + i);
//            System.out.println("c = " + c);
//        }
        Scanner scanner = new Scanner(new MyOwnInputStream("Hello ￤ 123"));

        System.out.println("scanner.nextLine() = " + scanner.nextLine());

    }
}
