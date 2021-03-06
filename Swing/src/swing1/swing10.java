package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing10 extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String list[]= {"skt","kt","lg","알뜰폰"};
		
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("돋움체", Font.PLAIN, 12));
		cb.setBounds(54, 98, 162, 44);
		contentPane.add(cb);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("돋움체", Font.PLAIN, 12));
		msg.setBounds(39, 167, 344, 31);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int v = cb.getSelectedIndex();//배열 인덱스 로드 단, 필드에 배열이 선언 되어야 한다. 
//				System.out.println(e.getItem());//lg skt 등등 출력
				String data = String.valueOf(cb.getSelectedItem());
//				String data = cb.getSelectedItem().toString();>>이건 14버전 이상. 
//				String data =String.valueOf(e.getItem());
//				String data =e.getItem().toString();
				msg.setText(list[v]);//>이것도 가능 17버전 이상. 
				msg.setText(data);
				
			}
		});
	}
}
 




