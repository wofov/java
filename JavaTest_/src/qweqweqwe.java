import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class qweqweqwe extends JFrame {

	private JPanel contentPane;
	private JTextField msg;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qweqweqwe frame = new qweqweqwe();
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
	public qweqweqwe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		msg = new JTextField();
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBounds(29, 31, 363, 39);
		contentPane.add(msg);
		msg.setColumns(10);
		
		JButton btn = new JButton("인증번호 받기");
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(104, 93, 194, 39);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setFont(new Font("돋움체", Font.PLAIN, 12));
		lb.setBounds(104, 207, 185, 33);
		contentPane.add(lb);
		
		btn2 = new JButton("인증번호 확인하기");
		btn2.setBounds(104, 142, 194, 33);
		contentPane.add(btn2);
		
		
		btn.addActionListener(new ActionListener() {//인증번호 받기 랜덤숫자 만들기
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int w=1;
				String num,total="";
				while(w<5) {
					int a =r.nextInt(9);
					num = Integer.toString(a);
					total+=num;
					w++;
				}
				lb.setText(total);
			//	int result= Integer.valueOf(total);
				
			}
		});
		btn2.addActionListener(new ActionListener() {//인증번호 받았으니 확인하기 
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
