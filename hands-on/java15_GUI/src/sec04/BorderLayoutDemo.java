package sec04;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class BorderLayoutDemo extends JFrame {
    BorderLayoutDemo() {
        setTitle("보더 레이아웃");
        setLayout(new BorderLayout());

        add("East", new JButton("동"));
        add("West", new JButton("서"));
        add("South", new JButton("남"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
