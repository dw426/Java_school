package Java1206;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame{
    public ButtonImageEx(){
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon normalIcon = resizeIcon(new ImageIcon("./call.png"), 50, 50);
        ImageIcon rolloverIcon = resizeIcon(new ImageIcon("./call_hover.png"), 50, 50);
        ImageIcon pressedIcon = resizeIcon(new ImageIcon("/call_click.png"), 50, 50);

        if (normalIcon == null || rolloverIcon == null || pressedIcon == null) {
            System.err.println("이미지를 로드할 수 없습니다.");
        }
        JButton btn = new JButton("call~~", normalIcon);
        btn.setRolloverEnabled(true);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);
        c.add(btn);
        setSize(250,150);
        setVisible(true);
    }
    private ImageIcon resizeIcon(ImageIcon icon, int width, int height){
        if (icon.getImageLoadStatus() != MediaTracker.COMPLETE){
            System.err.println("이미지를 로드할 수 없습니다." + icon.getDescription());
            return null;
        }
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
    public static void main(String[] args) {
        new ButtonImageEx();
    }
}
