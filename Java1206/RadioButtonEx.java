package Java1206;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame{
    public RadioButtonEx(){
        setTitle("RadioButton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ButtonGroup g = new ButtonGroup();

        JRadioButton apple = new JRadioButton("Apple");
        JRadioButton pear = new JRadioButton("배", true);
        JRadioButton cherry = new JRadioButton("cherry");
        g.add(apple);
        g.add(pear);
        g.add(cherry);
        c.add(apple);
        c.add(pear);
        c.add(cherry);
        setSize(250,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
