package sec04;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridLayoutDemo extends JFrame {
    GridLayoutDemo() {
        setTitle("그리드 레이아웃");
        setLayout(new GridLayout(0, 3));

        add(new JButton("b1"));
        add(new JButton("b2"));
        add(new JButton("b3"));
        add(new JButton("b4"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 110);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
