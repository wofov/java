package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {

	//jEditorPane 온 게시판 내용 출력 또는 입력 등 사용이 되며,
	//하이브리드 웹앱에서는 
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
		setTitle("하이브리드 웹/앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(48, 26, 698, 703);
		contentPane.add(webpage);
		webpage.setContentType("text/html");//setContentType 문자도 사용 그리고 html코드도 사용
		webpage.setText("<h1>ap</h1>"+"<a href=' '><img src=https://cdn.pixabay.com/photo/2022/06/18/18/05/skateboard-7270418__480.jpg>");
	
	}
}
