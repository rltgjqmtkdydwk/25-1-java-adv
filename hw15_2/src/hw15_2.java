//***************************

// 파일명: hw15_2.java

// 작성자: 김은총   

// 작성일: 2025/5/30

// 내용: GUI 프로그램 작성 - 가위바위보 게임

//***************************

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class hw15_2 extends JFrame {
    public hw15_2() {
        setTitle("가위 바위 보 게임");
        setSize(400, 250);
        setLayout(new BorderLayout());

        // 컴포넌트 구성
        JLabel title = new JLabel(" 가위 바위 보 게임", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 18)); // 폰트 크기 설정

        JPanel panel = new JPanel(new GridLayout(1, 3)); // user | vs | computer
        JPanel user = new JPanel(new GridLayout(4, 1)); // user, 가위, 바위, 보
        JPanel vs = new JPanel(new BorderLayout()); // vs
        JPanel computer = new JPanel(new GridLayout(4, 1)); // computer, 가위, 바위, 보

        JButton userScissor = new JButton("가위");
        JButton userRock = new JButton("바위");
        JButton userPaper = new JButton("보");
        JLabel userLabel = new JLabel("사용자", JLabel.CENTER);

        JLabel vsLabel = new JLabel("VS", JLabel.CENTER);
        vsLabel.setFont(new Font("Arial", Font.PLAIN, 25)); // 폰트 크기 설정

        JButton comScissor = new JButton("가위");
        JButton comRock = new JButton("바위");
        JButton comPaper = new JButton("보");
        JLabel comLabel = new JLabel("컴퓨터", JLabel.CENTER);

        JLabel resultLabel = new JLabel("결과", JLabel.CENTER);

        // 컴포넌트 배치
        add(title, BorderLayout.NORTH); // 북쪽에 배치

        user.add(userScissor);
        user.add(userRock);
        user.add(userPaper);
        user.add(userLabel);

        vs.add(vsLabel);

        computer.add(comScissor);
        computer.add(comRock);
        computer.add(comPaper);
        computer.add(comLabel);

        panel.add(user, BorderLayout.WEST); // 서쪽에 배치
        panel.add(vs, BorderLayout.CENTER); // 중앙에 배치
        panel.add(computer, BorderLayout.EAST); // 동쪽에 배치

        add(resultLabel, BorderLayout.SOUTH); // 남쪽에 배치

        add(panel, BorderLayout.CENTER); // 중첩 borderlayout

        // 닫힘 설정, 보이기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("hw10_2:김은총");
        new hw15_2();
    }
}