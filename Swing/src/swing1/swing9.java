package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {

	//jEditorPane �� �Խ��� ���� ��� �Ǵ� �Է� �� ����� �Ǹ�,
	//���̺긮�� ���ۿ����� 
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
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
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("���̺긮�� ��/��");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(48, 26, 698, 703);
		contentPane.add(webpage);
		webpage.setContentType("text/html");//setContentType ���ڵ� ��� �׸��� html�ڵ嵵 ���
		webpage.setText("<h1>ap</h1>"+"<a href=' '><img src=https://cdn.pixabay.com/photo/2022/06/18/18/05/skateboard-7270418__480.jpg>");
	
	}
}
