package Java1206;

import javax.swing.*;
import java.awt.*;

public class ContainerAndComponentExample extends JFrame{
    public ContainerAndComponentExample(){
        setTitle("Container & Component");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,250);
        setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3,2,10,10));
        leftPanel.setBackground(Color.YELLOW);
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JLabel lblId = new JLabel("Type ID");
        JTextField tfId = new JTextField(10);
        JLabel lblPassword = new JLabel("Type Password");
        JTextField tfPassword = new JTextField(10);

        leftPanel.add(lblId);
        leftPanel.add(tfId);
        leftPanel.add(lblPassword);
        leftPanel.add(tfPassword);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(Color.GREEN);
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JLabel lblProgram = new JLabel("좋아하는 프로그램");
        JCheckBox cbJava = new JCheckBox("Java 프로그램");
        JCheckBox cbCpp = new JCheckBox("C++ 프로그램");

        rightPanel.add(lblProgram);
        rightPanel.add(cbJava);
        rightPanel.add(cbCpp);

        JPanel bottomPanel = new JPanel();
        JButton btnOk = new JButton("OK");
        bottomPanel.add(btnOk);

        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args){
        new ContainerAndComponentExample();
    }
}
