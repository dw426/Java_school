package Java1206;

import javax.swing.*;
import java.awt.*;

public class TextFieldExample extends JFrame{
    public TextFieldExample(){
        setTitle("TextField Example");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("이름"));
        c.add(new JTextField(20));
        c.add(new JLabel("학과"));
        c.add(new JTextField("컴퓨터공학과", 20));
        c.add(new JLabel("주소"));
        c.add(new JTextField("경산시 ...", 20));
        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args){
        new TextFieldExample();
    }
}
