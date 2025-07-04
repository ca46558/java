package tw.index;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame; //JFrame 設定執行彈出視窗

public class test19 extends JFrame {
	private JButton b1, b2, b3;

	public test19() {
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");

		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);

		System.out.println("test19()");
		setSize(640, 480); // 設定視窗大小
		setVisible(true); // 視窗彈出
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 設定視窗關閉後不會再繼續執行 (單視窗程式)
	}

	public static void main(String[] args) {
		new test19();

	}

}
