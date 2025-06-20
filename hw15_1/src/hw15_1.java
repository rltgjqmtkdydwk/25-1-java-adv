//***************************

// 파일명: hw15_1.java

// 작성자: 김은총   

// 작성일: 2025/5/23

// 내용: GUI 프로그램 작성

//***************************

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hw15_1 extends JFrame {
    hw15_1() {
        setTitle("원의 넓이 구하기");
        setSize(200, 100);

        JPanel panel = new JPanel();

        JLabel radius_label= new JLabel("원의 반지름");
        JTextField radius = new JTextField(10);

        JLabel area_label = new JLabel("원의 넓이");
        JTextField area = new JTextField(10);
        area.setEditable(false);
        // area = radius*radius*3.14;
        
        panel.add(radius_label);
        panel.add(radius);
        panel.add(area_label);
        panel.add(area);
        add(panel);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new hw15_1();
    }
}