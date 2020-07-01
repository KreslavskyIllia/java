import java.io.*;
import java.net.Socket;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDR = "localhost";
    private static final int SERVER_PORT = 8189;
    private DataOutputStream out;
    private DataInputStream in;
    private Scanner message;
    private Socket socket;

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    public void start() {
        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            message = new Scanner(System.in);
            System.out.println("Введите сообщение:");
            while (!socket.isOutputShutdown()) {
                if (message.hasNextLine()) {
                    List<String> msgToSend = new ArrayList<>();
                    while (true) {
                        String clientMessage = message.nextLine();
                        System.out.println("Чтобы отправить сообщение, нажмите пробел с новой строки");
                        msgToSend.add(clientMessage);
                        System.out.println("Сообщение " + msgToSend + " готово к отправке на сервер.");
                        if (clientMessage.equals(" ")) {
                            break;
                        }
                        if (clientMessage.equalsIgnoreCase("/end")) {
                            System.out.println("Клиент отключился");
                            close();
                            break;
                        }
                    }
                    sendMessage(msgToSend);
                    System.out.println("Сообщение отправлено. Ожидайте ответ от сервера\n");
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                while (true) {
                                    String reply = in.readUTF();
                                    System.out.println("Принято сообщение от сервера: " + reply + "\nВведите ответ:");
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            } finally {
                                System.out.println("Соединение прервано");
                            }
                        }
                    })
                            .start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(List<String> msg) throws IOException {
        out.writeUTF(String.valueOf(msg));
        out.flush();
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
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        message.close();
    }
}
