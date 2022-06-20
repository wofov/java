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
		 frame�� absolute ���·� layer�� �����մϴ�. 
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.RED));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB274 \uBC14\uD2BC");
		
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(270, 56, 110, 24);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("����ü", Font.PLAIN, 12));
		textField.setForeground(Color.DARK_GRAY);
		textField.setBounds(68, 21, 299, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel msg = new JLabel("");//���⼭ msg�� ���� �߱� ������ �� ���� �ڵ尡 ������ �ȵȴ�. 
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setForeground(Color.BLACK);
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(10, 90, 418, 24);
		contentPane.add(msg);
		/*
		�ڵ鸵 Ŭ������ ������Ʈ ���� �����ڵ忡 ������ �ش� ������Ʈ�� �ε��������մϴ�. 
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}
				else {
					int lg = textField.getText().length();//�Է� ���� ���� 
					if(lg<5) {
						msg.setText("���̵�� 5�� �̻� ��� ����");
					}
					else {
						msg.setText("���̵� ���� ���Դϴ�.");
					}
				}
			}
		});
	}
}
