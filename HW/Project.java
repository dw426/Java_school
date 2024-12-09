package HW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame{
    public Project() {
        setTitle("영화 예매 시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1000, 700);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 1, 5, 5));

        JButton topTime = new JButton("영화1(10:00 AM)");
        JButton midTime = new JButton("영화2(12:00 PM)");
        JButton botTime = new JButton("영화3(3:00 PM)");

        leftPanel.add(topTime);
        leftPanel.add(midTime);
        leftPanel.add(botTime);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.GRAY);
        rightPanel.setLayout(new GridLayout(5, 10, 3, 3));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBackground(Color.GRAY);
        JLabel text = new JLabel("좌석 선택", SwingConstants.LEFT);
        topPanel.add(text);

        JPanel bottomPanel = new JPanel();
        JLabel Check = new JLabel("좌석을 선택하세요", SwingConstants.CENTER);
        bottomPanel.add(Check);

        JButton[][] seats = new JButton[5][10];
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=10; j++) {
                int row = i;
                int col = j;
                JButton seat = new JButton(i + "-" + j);
                seat.setBackground(Color.GREEN);

                seat.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(seat.getBackground() == Color.GREEN){
                            seat.setBackground(Color.RED);
                            Check.setText("좌석" + row + "-" + col + "선택완료!");
                        }
                    }
                });
                seats[i-1][j-1] = seat;
                rightPanel.add(seat);
                bottomPanel.add(Check);
            }
        }


        topTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0; i < 5; i++){
                    for(int j=0; j < 10; j++){
                        seats[i][j].setBackground(Color.GREEN);
                    }
                }
            }
        });

        midTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0; i < 5; i++){
                    for(int j=0; j < 10; j++){
                        seats[i][j].setBackground(Color.GREEN);
                    }
                }
            }
        });

        botTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0; i < 5; i++){
                    for(int j=0; j < 10; j++){
                        seats[i][j].setBackground(Color.GREEN);
                    }
                }
            }
        });

        JPanel Center = new JPanel(new BorderLayout());
        Center.add(rightPanel, BorderLayout.CENTER);
        Center.add(topPanel, BorderLayout.NORTH);

        add(leftPanel, BorderLayout.WEST);
        add(Center, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args){
        new Project();
    }
}