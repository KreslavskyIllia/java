import java.io.IOException;
import java.net.Socket;

public class CharApplication {
    public static void main(String[] args) {
        try {
            new Socket("localhost", 8551);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}