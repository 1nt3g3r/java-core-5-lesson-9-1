import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ByteArrayInputStreamTests {
    public static void main(String[] args) {
        byte[] bytes = {65, 66, 67}; //A, B, C

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        bytes[0] = 68; //D

        Scanner scanner = new Scanner(bais);

        System.out.println("scanner.nextLine() = " + scanner.nextLine());
    }
}
