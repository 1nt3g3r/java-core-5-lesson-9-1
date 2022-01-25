import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;

public class MyOwnInputStream extends InputStream {
    private ByteArrayInputStream bais;

    public MyOwnInputStream(String input) {
        bais = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public int read() throws IOException {
        return bais.read();
    }

    @Override
    public int available() throws IOException {
        return bais.available();
    }
}
