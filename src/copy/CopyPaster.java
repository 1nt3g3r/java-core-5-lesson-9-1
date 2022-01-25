package copy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyPaster {
    private final InputStream from;
    private final OutputStream to;

    public CopyPaster(InputStream from, OutputStream to) {
        this.from = from;
        this.to = to;
    }

    public void copy() throws IOException {
        while(from.available() > 0) {
            to.write(from.read());
        }

        from.close();
        to.close();
    }
}
