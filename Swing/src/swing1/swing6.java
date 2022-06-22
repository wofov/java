package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("돋움체", Font.PLAIN, 12));
		textField.setBounds(20, 27, 244, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("인증번호받기");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setBounds(44, 90, 140, 23);
		contentPane.add(btnNewButton);
		
		msg = new JLabel("");
		msg.setForeground(Color.CYAN);
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBounds(67, 151, 227, 39);
		contentPane.add(msg);
		

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.addKeyListener(new KeyAdapter() {//키를 누를경우 적용되는 이벤트 클래스
	         //keyPressed _ 키를 누를 때
			 //keyReleased _키를 누른 후 올라올 때
			//keyTyped _ 키를 문자입력을받을때
			@Override
			public void keyTyped(KeyEvent k) {
				//입력 값에 대한 자릿수.
				int i =textField.getText().length();
				if(i>12){
					k.consume();//>조건 이후 입력하는것을 null로 인식
				}
				System.out.println(k);
				System.out.println(k.getKeyChar());
				System.out.println(k.getKeyCode());
				int n = Integer.valueOf(k.getKeyChar());//아스키 코드로 변경 
				System.out.println(n);
				if(n>=48&&n<=57) {//sysout에서는 정상적인 문자 getKeyChar 보이지만
					//integer로 변경시 아스키 코드 
					msg.setText("");
				}
				else {
//					if(!Character.isDigit(n)) {
						msg.setText("숫자만 입력하세요");
						k.consume();//keyTyped를 이용 / 컨슘은 해당 입력시 null로 간주
						//KeyEvent k에서만 사용한다. 
//                        return;
//					}
				}
				
			}
		});
	}
}
