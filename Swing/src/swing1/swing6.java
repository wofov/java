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
		textField.setFont(new Font("����ü", Font.PLAIN, 12));
		textField.setBounds(20, 27, 244, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("������ȣ�ޱ�");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(44, 90, 140, 23);
		contentPane.add(btnNewButton);
		
		msg = new JLabel("");
		msg.setForeground(Color.CYAN);
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBounds(67, 151, 227, 39);
		contentPane.add(msg);
		

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.addKeyListener(new KeyAdapter() {//Ű�� ������� ����Ǵ� �̺�Ʈ Ŭ����
	         //keyPressed _ Ű�� ���� ��
			 //keyReleased _Ű�� ���� �� �ö�� ��
			//keyTyped _ Ű�� �����Է���������
			@Override
			public void keyTyped(KeyEvent k) {
				//�Է� ���� ���� �ڸ���.
				int i =textField.getText().length();
				if(i>12){
					k.consume();//>���� ���� �Է��ϴ°��� null�� �ν�
				}
				System.out.println(k);
				System.out.println(k.getKeyChar());
				System.out.println(k.getKeyCode());
				int n = Integer.valueOf(k.getKeyChar());//�ƽ�Ű �ڵ�� ���� 
				System.out.println(n);
				if(n>=48&&n<=57) {//sysout������ �������� ���� getKeyChar ��������
					//integer�� ����� �ƽ�Ű �ڵ� 
					msg.setText("");
				}
				else {
//					if(!Character.isDigit(n)) {
						msg.setText("���ڸ� �Է��ϼ���");
						k.consume();//keyTyped�� �̿� / ������ �ش� �Է½� null�� ����
						//KeyEvent k������ ����Ѵ�. 
//                        return;
//					}
				}
				
			}
		});
	}
}
