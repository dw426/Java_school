package Java1206;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3]; // 체크박스 배열
    private String[] names = {"사과", "배", "체리"}; // 과일 이름
    private JLabel sumLabel; // 합계 표시 라벨
    private int sum = 0; // 합계

    public CheckBoxItemEventEx() {
        setTitle("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 상품 정보 라벨 추가
        c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

        // 체크박스 생성 및 추가
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true); // 테두리 표시
            c.add(fruits[i]);

            // 체크박스에 ItemListener 추가
            fruits[i].addItemListener(new MyItemListener());
        }

        // 합계 표시 라벨 생성
        sumLabel = new JLabel("현재 0원 입니다.");
        c.add(sumLabel);

        setSize(250, 200);
        setVisible(true);
    }

    // 내부 클래스: 체크박스 상태 변경 이벤트 처리
    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            // 체크박스 선택 상태 확인
            JCheckBox source = (JCheckBox) e.getItem(); // 이벤트 발생 체크박스 가져오기

            if (e.getStateChange() == ItemEvent.SELECTED) { // 선택됨
                if (source == fruits[0]) {
                    sum += 100; // 사과
                } else if (source == fruits[1]) {
                    sum += 500; // 배
                } else if (source == fruits[2]) {
                    sum += 20000; // 체리
                }
            } else { // 선택 해제됨
                if (source == fruits[0]) {
                    sum -= 100; // 사과
                } else if (source == fruits[1]) {
                    sum -= 500; // 배
                } else if (source == fruits[2]) {
                    sum -= 20000; // 체리
                }
            }

            // 합계 업데이트
            sumLabel.setText("현재 " + sum + "원 입니다.");
        }
    }

    public static void main(String[] args) {
        new CheckBoxItemEventEx(); // 프로그램 실행
    }
}
