package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing11 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//ImageIcon : 이미지 파일을 로드. 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing11 frame = new swing11();
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
	public swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("이미지 로드");
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(20, 28, 206, 35);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setBounds(32, 84, 372, 171);
		contentPane.add(lb);
//		ImageIcon img =new ImageIcon()
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("C:\\java5\\Swing\\src\\swing1\\image3.jpg");
			    Image reimg = img.getImage();//이미지 파일 경로를 로드
			    //getScaledInstance(가로크기,세로크기,변환방법)
			    //SCALE_SMOOTH 부드럽게 적용 
			    //SCALE_FAST 빠르게 적용하나 픽셀이 깨짐 
			    //SCALE_DEFAULT 이미지가 가지고있는 해상도에 맞춰서 적용
			    //SCALE_AREA_AVERAGING 모니터 해상도에 평균 값으로 적용 
			    Image resize = reimg.getScaledInstance(410, 200, Image.SCALE_AREA_AVERAGING);
			    ImageIcon rimg = new ImageIcon(resize);
				lb.setIcon(rimg);
			}
		});
	}

}
