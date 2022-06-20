package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		/*
		 frame를 absolute 형태로 layer을 변경합니다. 
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.RED));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB274 \uBC14\uD2BC");
		
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setBounds(270, 56, 110, 24);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("돋움체", Font.PLAIN, 12));
		textField.setForeground(Color.DARK_GRAY);
		textField.setBounds(68, 21, 299, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel msg = new JLabel("");//여기서 msg를 선언 했기 때문에 이 위에 코드가 있으면 안된다. 
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setForeground(Color.BLACK);
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(10, 90, 418, 24);
		contentPane.add(msg);
		/*
		핸들링 클래스가 오브젝트 보다 상위코드에 있으면 해당 오브젝트를 로드하지못합니다. 
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					msg.setText("아이디를 입력하세요");
				}
				else {
					int lg = textField.getText().length();//입력 문자 갯수 
					if(lg<5) {
						msg.setText("아이디는 5자 이상만 사용 가능");
					}
					else {
						msg.setText("아이디 검토 중입니다.");
					}
				}
			}
		});
	}
}
