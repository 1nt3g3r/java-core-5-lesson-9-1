package copy;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CopyPasterTests {
    public static void main(String[] args) throws IOException {
//        InputStream from = new FileInputStream("data.txt");
//        OutputStream to = new FileOutputStream("data-copy.txt");
//
//        new CopyPaster(from, to).copy();

        //Write string example
        String text = "This is my text in CopyPasterTexts";
        new CopyPaster(
                new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)),
                new FileOutputStream("text-file.txt")
        ).copy();
    }
}
