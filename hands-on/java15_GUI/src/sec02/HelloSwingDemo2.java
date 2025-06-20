package sec02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloSwingDemo2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setTitle("성적 입력");
        f.setSize(300, 150);

        JPanel panel = new JPanel();
        f.add(panel);

        panel.add(new JLabel("이름"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("성적"));
        panel.add(new JTextField(20));

        JButton b = new JButton("입력");
        panel.add(b);
        
        f.setVisible(true);
    }
}