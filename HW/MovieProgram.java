package HW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieProgram extends JFrame {
    public MovieProgram() {
        setTitle("영화 예매 시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(900, 600);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton movie1Button = new JButton("영화1(10:00 AM)");
        JButton movie2Button = new JButton("영화2(12:00 PM)");
        JButton movie3Button = new JButton("영화3(3:00 PM)");

        leftPanel.add(movie1Button);
        leftPanel.add(movie2Button);
        leftPanel.add(movie3Button);

        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBackground(Color.LIGHT_GRAY);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBackground(Color.LIGHT_GRAY);
        JLabel seatSelect = new JLabel("좌석 선택", JLabel.LEFT);
        topPanel.add(seatSelect);

        JPanel bottomPanel = new JPanel();
        JLabel Selecting = new JLabel("좌석을 선택하세요", JLabel.CENTER);
        bottomPanel.add(Selecting);

        JButton[][] seats = new JButton[5][10];
        JPanel seatPanel = new JPanel();
        seatPanel.setLayout(new GridLayout(5, 10, 2, 2));

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 10; col++) {
                String seatLabel = (row + 1) + "-" + (col + 1);
                JButton seatButton = new JButton(seatLabel);
                seatPanel.setBackground(Color.LIGHT_GRAY);
                seatButton.setBackground(Color.GREEN);
                seatButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (seatButton.getBackground() == Color.GREEN) {
                            seatButton.setBackground(Color.RED);
                            Selecting.setText("좌석 " + seatLabel + " 예약 완료!");
                        }
                    }
                });
                seats[row][col] = seatButton;
                seatPanel.add(seatButton);
            }
        }

        rightPanel.add(topPanel, BorderLayout.NORTH);
        rightPanel.add(seatPanel, BorderLayout.CENTER);
        rightPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MovieProgram();
    }
}
