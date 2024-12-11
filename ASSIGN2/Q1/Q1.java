import java.io.IOException;
import java.io.InputStream;

class LowercaseInputStreamDecorator extends InputStream {
    private final InputStream inputStream;

    public LowercaseInputStreamDecorator(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        int data = inputStream.read();
        if (data == -1) {
            return -1;
        }
        return Character.toLowerCase((char) data);
    }

    @Override
    public void close() throws IOException {
        inputStream.close();
    }
}


public class Q1 {
    public static void main(String[] args) {
        try (InputStream originalStream = System.in;
             InputStream lowercaseStream = new LowercaseInputStreamDecorator(originalStream)) {

            int data;
            while ((data = lowercaseStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
