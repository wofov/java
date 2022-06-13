import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//외부 클래스로 awt생성
public class awt2 {

	public static void main(String[] args) {
//		log ok = new log();
		login lg = new login();

	}
class loginok extends login{//로그인 누른 후 새로운 창 꾸미는 곳.
	public loginok() {
		this.fr.setTitle("회원가입 후 페이지 만들기");
		this.fr.setBounds(0,0,400,400);//크기만들기
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}
}
class login {//추상 클래스를 먼저 로드하여 필드에 적용
	Frame fr = new Frame();
	Font ft=new Font("돋움체",Font.BOLD,20);//글자체, 굵은체, 글자크기 
	Button close_btn = new Button("종료");
	Button lg_btn = new Button("로그인");
	Button sh_btn = new Button("회원가입");
	Label msg1 = new Label();
	TextField mid = new TextField();
	TextField mpw = new TextField();
	public login() {
		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(0,0,400,400);//크기만들기
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.mid.setFont(ft);//글자 속성을 적용하고자 하는 오브젝트 선택
		this.mpw.setFont(ft);//
		this.mpw.setEchoChar('*');//char 때문에 '' 로 한다
//		this.close_btn = new Button("종료");
		this.mid.setBounds(100,60,200,40);
		this.mpw.setBounds(100,120,200,40);
		this.lg_btn.setBounds(100,180,200,40);
		this.sh_btn.setBounds(100,240,200,40);
		this.close_btn.setBounds(100,300,200,40);
	//	this.msg1.setBackground(Color.white);
		this.msg1.setBounds(100,100,200,20);
		this.fr.add(msg1);
		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(lg_btn);
		this.fr.add(sh_btn);
		this.fr.add(this.close_btn);
		
		this.clicks();
		
		
	}
	public void clicks() {//버튼에 관한 모든 핸들링 메소드 집합소 
		this.sh_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);//해당 프레임 종료
//				loginok ok = new loginok();//다음 프레이를 실행>아직 여기 해결방안 못찾음.
			
				
			}
		});
		
		this.close_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane();//swing API 경고 옵션 로드 
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼 아이디 및 패스워드 검토 
				String user_id = mid.getText();
				 String user_pw = mpw.getText();
				if(user_id.equals("")) {//여기서는 null사용금지 null 또한 값이 있는 상태 이기 때문이다
					msg1.setText("아이디를 입력하세요");
				  //alert.showMessageDialog(null, "아이디를 입력해주세요"); // 경고창 처럼 뜨는거
				}
				else {
				   if(user_pw.equals("")) {
					   msg1.setText("패스워드를 입력하세요");
				   }
				   else {
					   msg1.setText("로그인 성공");
				   }
					
				}
				
			}
		});
		
		
	}
}