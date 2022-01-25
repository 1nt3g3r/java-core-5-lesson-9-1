package copy;

import java.io.IOException;

public class FileCopierTests {
    public static void main(String[] args) throws IOException {
        new FileCopier("data.txt", "data-copy.txt").copy();
    }
}
