package reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ReaderTests {
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("Make Java great again!");

        int nextChar;
        while (true) {
            nextChar = reader.read();

            if (nextChar < 0) {
                break;
            }

            System.out.print(((char) nextChar));
        }
    }
}
