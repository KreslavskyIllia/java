import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatFrame extends JFrame {
    public ChatFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 305, 500);
        setBackground(new Color(11, 213, 99));
        setVisible(true);
        setLayout(null);

        JPanel chatPanel = new JPanel();
        chatPanel.setLayout(new BorderLayout());
        chatPanel.setBounds(0, 0, 287, 400);
        chatPanel.setBackground(new Color(11, 213, 99));
        JTextField cjtf = new JTextField();
        cjtf.setBackground(new Color(187, 251, 215));
        JScrollPane cjsp = new JScrollPane(cjtf);
        cjsp.setBackground(new Color(11, 213, 99));
        chatPanel.add(cjsp);
        add(chatPanel);

        JPanel messagePanel = new JPanel();
        messagePanel.setBounds(0,400, 287, 53);
        messagePanel.setLayout(null);
        messagePanel.setBackground(new Color(11, 213, 99));
        add(messagePanel);
        JTextArea mjta = new JTextArea();
        JScrollPane mjsp = new JScrollPane(mjta);
        mjsp.setBounds(10,10,195, 30);
        messagePanel.add(mjsp);
        JButton mjb = new JButton("Send");
        mjb.setBounds(210, 10, 70, 30);
        mjb.setBackground(new Color(10, 184, 85));
        mjb.addActionListener(new ButtonListener(cjtf, mjta));
        messagePanel.add(mjb);
    }
}
