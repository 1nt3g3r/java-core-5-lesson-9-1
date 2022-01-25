package reader;

import java.io.*;

public class WriterTests {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("data.txt");

        DataInputStream dis = new DataInputStream(fis);
    }
}
