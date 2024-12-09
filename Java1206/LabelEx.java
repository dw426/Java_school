package Java1206;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
    public LabelEx(){
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        JLabel textLabel = new JLabel("제임스 고슬링입니다.!", SwingConstants.CENTER);
        c.add(textLabel);
        ImageIcon img = new ImageIcon("./gosling.png");
        JLabel imageLabel = new JLabel(img);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.add(imageLabel);
        ImageIcon icon = new ImageIcon("./call.pnㄴg");
        JLabel label = new JLabel("커피한잔 하실레예, 전화주이소", icon, SwingConstants.CENTER);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.add(label);
        setSize(600,800);
        setVisible(true);
    }
    public static void main(String[] args){
        new LabelEx();
    }
}
