package Java1206;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListComboMenuPopup extends JFrame {
    private JList<String> list;
    private JComboBox<String> comboBox;
    private JPopupMenu popupMenu;

    public ListComboMenuPopup() {
        setTitle("Swing Component Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        list = new JList<>(items);
        JScrollPane listScroller = new JScrollPane(list);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        c.add(listScroller, BorderLayout.WEST);
        comboBox = new JComboBox<>(items);
        comboBox.setSelectedIndex(0);
        c.add(comboBox, BorderLayout.NORTH);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        popupMenu = new JPopupMenu();
        JMenuItem popupItem1 = new JMenuItem("Popup Option 1");
        popupItem1.addActionListener(e -> JOptionPane.showMessageDialog(this, "Option 1 Selected"));
        JMenuItem popupItem2 = new JMenuItem("Popup Option 2");
        popupItem2.addActionListener(e -> JOptionPane.showMessageDialog(this, "Option 2 Selected"));
        popupMenu.add(popupItem1);
        popupMenu.add(popupItem2);
        JTextArea textArea = new JTextArea("Right-click to see the popup menu");
        textArea.setComponentPopupMenu(popupMenu);
        c.add(new JScrollPane(textArea), BorderLayout.CENTER);
        comboBox.addActionListener(e->list.setSelectedValue(comboBox.getSelectedItem(), true));
        setVisible(true);
    }
    public static void main(String[] args) {
    new ListComboMenuPopup();
    }
}