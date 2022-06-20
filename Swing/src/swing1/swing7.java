package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(98, 10, 260, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("신용카드");
		rd1.setName("card");
		rd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rd1.setSelected(true);
		rd1.setFont(new Font("돋움체", Font.PLAIN, 12));
		rd1.setBounds(154, 25, 115, 23);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("계좌이체");
		rd2.setName("bank");
		rd2.setFont(new Font("돋움체", Font.PLAIN, 12));
		rd2.setBounds(85, 57, 115, 23);
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("무통장입금");
		rd3.setName("no card");//데이터 베이스느 한글로 저장 x 셋네임 옆에 영어로 저장 
		//setname은 노출은 되지 않으며, 백그라운드에서 해당 속성에 값을 적용하는 것을 말합니다. 
		rd3.setFont(new Font("돋움체", Font.PLAIN, 12));
		rd3.setBounds(33, 92, 115, 23);
		panel.add(rd3);
		
		ButtonGroup ap =new ButtonGroup();
		//라디오 사용시 버튼그룹을 이용 해야 한다. 
		ap.add(rd1);
		ap.add(rd2);
		ap.add(rd3);
		
		JButton btn = new JButton("결제진행");
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(154, 92, 93, 23);
		panel.add(btn);
		
		JPanel mu = new JPanel();
		mu.setVisible(false);
		mu.setAutoscrolls(true);
	
		mu.setToolTipText("te");
		mu.setBounds(10, 153, 418, 102);
		contentPane.add(mu);
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setAutoscrolls(false);
		textField.setFont(new Font("돋움체", Font.PLAIN, 12));
		textField.setBounds(74, 58, 288, 34);
		mu.add(textField);
		textField.setColumns(10);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pay="";
				if(rd1.isSelected()==true) {//신용카드
					pay=rd1.getName();
					System.out.println("신용카드 선택");
					mu.setVisible(false);
				}
				else if(rd2.isSelected()==true) {//계좌이체
					System.out.println("계좌이체 선택");
					mu.setVisible(false);
				}
				else {//무통장
					mu.setVisible(true);
				}
			}
		});
	}
}
