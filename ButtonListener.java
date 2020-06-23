import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JTextField jtf;
    private JTextArea jta;

    public ButtonListener(JTextField jtf, JTextArea jta){
        this.jtf = jtf;
        this.jta = jta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        jtf.setText("Your message: " + jta.getText());
    }
}
