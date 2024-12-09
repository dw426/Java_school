package Java1206;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends JFrame{
    private JTextArea displayArea;
    public TextAreaExample(){
        setTitle("TextArea Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름"));
        JTextField nameField = new JTextField(20);
        c.add(nameField);
        c.add(new JLabel("학과"));
        JTextField deptField = new JTextField("컴퓨터공학", 20);
        c.add(deptField);
        c.add(new JLabel("주소"));
        JTextField addressField = new JTextField ("경산시, 20");
        c.add(addressField);

        displayArea = new JTextArea(5, 25);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        c.add(scrollPane);

        nameField.addActionListener(new TextFieldActionListener("이름", nameField));
        deptField.addActionListener(new TextFieldActionListener("학과", deptField));
        addressField.addActionListener(new TextFieldActionListener("주소", addressField));

        setSize(300,150);
        setVisible(true);
    }

    class TextFieldActionListener implements ActionListener {
        private String label;
        private JTextField textField;

        public TextFieldActionListener(String label, JTextField textField) {
            this.label = label;
            this.textField = textField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String input = textField.getText();
            if (!input.isEmpty()) {
                displayArea.append(label + ": " + input + "\n");
                textField.setText("");
                displayArea.setCaretPosition(displayArea.getDocument().getLength());
            }
        }
    }

    public static void main(String[] args){
        new TextAreaExample();
    }
}
