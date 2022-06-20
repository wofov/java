package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing12 extends JFrame {

	private String imgdata[] = {"image.jpg" , "image2.jpg" ,"image3.jpg" };
	private JPanel contentPane;

	public int count =0;
	public String url ="C:\\java5\\Swing\\src\\swing1\\";
	//http://naver.com/1.jpg.  C:\\java5\\Swing\\1.jpg : 절대경로
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing12 frame = new swing12();
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
	public swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBounds(36, 43, 613, 596);
		contentPane.add(lb);
		
		JButton prev = new JButton("이전");
		prev.setBounds(36, 10, 93, 23);
		contentPane.add(prev);
		
		JButton next = new JButton("다음");
		next.setBounds(535, 10, 93, 23);
		contentPane.add(next);
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count --;
				if(swing12.this.count < 0) {
					swing12.this.count=0;
				}
			
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count+1]);
				lb.setIcon(v);
			}
		});
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count ++;
				if(swing12.this.count>2) {
					swing12.this.count = 2;
				}
		
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count+1]);
				lb.setIcon(v);
			}
		});
	}

}
