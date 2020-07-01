import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class Server {
    private DataInputStream in;
    private DataOutputStream out;
    private BufferedReader replyReader;

    public static void main(String[] args) {
        new Server().start();
    }

    public void start() {
        Socket socket;
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println(serverSocket.getInetAddress().toString());
            System.out.println(serverSocket.getLocalPort());
            System.out.println("Сервер запущен. Ожидается подключение...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            System.out.println(socket.toString());
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            replyReader = new BufferedReader(new InputStreamReader(System.in));
            while (!socket.isClosed()) {
                System.out.println("Сервер читает сообщение");
                String clientMessage = in.readUTF();
                System.out.println("Принято сообщение: " + clientMessage + "\nВведите ответ:");
                String reply = replyReader.readLine();
                out.writeUTF(reply);
                out.flush();
                System.out.println("Ответ отправлен");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Соединение прервано");
            close();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String reply = replyReader.readLine();
                        out.writeUTF(reply + "\n");
                        out.flush();
                        System.out.println("Ответ отправлен");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        })
                .start();
    }
    public void close() {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            replyReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
