package sec04;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

public class FlowLayoutDemo extends JFrame{
    FlowLayoutDemo() {
        setTitle("플로우 레이아웃");

        JPanel p = new JPanel(new FlowLayout());
        p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JButton b1 = new JButton("버튼");
        JButton b2 = new JButton("버튼");
        JButton b3 = new JButton("버튼");
        JButton b4 = new JButton("버튼");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
