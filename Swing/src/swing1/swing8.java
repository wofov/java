package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import java.awt.Cursor;

public class swing8 extends JFrame {

	//progress 사용법
	private JPanel contentPane;
	public JProgressBar progress = null;
	JLabel lb =null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.progress = new JProgressBar();
		progress.setStringPainted(true);
		progress.setFont(new Font("돋움체", Font.PLAIN, 12));
		progress.setBounds(46, 33, 337, 20);
		contentPane.add(progress);
		
		this.lb = new JLabel("New label");
		lb.setVisible(false);
		this.lb.setFont(new Font("돋움체", Font.PLAIN, 12));
		this.lb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		this.lb.setBounds(139, 111, 156, 38);
		contentPane.add(lb);
		
		
		
		//swing 프로그램이 작동 후 해당 메소드로 1초 후 실행 되므로 적용함 
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				pstart();
			}
		};
		t.schedule(task, 500);
	}
	public void pstart() {
		int w=0;
		try {
			while(w<=100) {
				System.out.println(w);
				Thread.sleep(50);
				this.progress.setValue(w);
			
				w++;
			}
		}catch(Exception k) {
			
			System.out.println("오류발생");
		}
		if(this.progress.getValue()==100) {
			this.lb.setVisible(true);
			this.lb.setText("다운도르완료");
		}
	}
}
