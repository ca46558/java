package tw.index;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessGame extends JFrame implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	
	
	public GuessGame() {
		super("Guess Number Game");
		
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout()); //隔間
		add(log, BorderLayout.CENTER); //可輸入文字
		
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		
		guess.addActionListener(this);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		intiGame();  //開新局
	}

	public static void main(String[] args) {
	     new GuessGame();

	}
    // 開新局
	private void intiGame() {
		answer = createAnswer(3);
		System.out.println(answer);
	}
	// 產生謎底
	private String createAnswer(int d) {
		final int nums = 10;
		int[] poker = new int[nums];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;

		for (int i = nums - 1; i > 0; i--) {
			int r = (int) (Math.random() * (i + 1));
			// poker[r] <=> poker[i]
			int temp = poker[r];
			poker[r] = poker[i];
			poker[i] = temp;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<3; i++) sb.append(poker[i]);
	
	    return sb.toString();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ok");
		
	}

}
