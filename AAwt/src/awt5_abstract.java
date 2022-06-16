import java.awt.*;
import java.awt.event.*;

//awt 환경설정이 
public abstract class awt5_abstract {

	public abstract String signok();//void가 아닌 자료형 즉 getter
	public abstract void dataload();
	public abstract void id_check(String id);//setter
	Frame fr = new Frame();
	Button bt = null;
	Button close = null;
	TextField mid = null;
	Label msg = new Label();
	public void design() {
		
		this.fr.setBounds(200,200,300,450);
//		this.fr.setTitle(null);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.bt = new Button("충복체크");
		this.close = new Button("종료");
		this.mid =new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(20,100,250,25);
		this.fr.add(this.msg);
		this.mid.setBounds(20,50,150,25);
		this.bt.setBounds(180,50,80,25);
		this.close.setBounds(200,410,80,25);
		this.fr.add(this.mid);
		this.fr.add(this.bt);
		this.fr.add(this.close);
		this.click();//awt디자인이 완료 후 해당 핸들림 메소드로 이동
	}
	public void click() {
		
		this.bt.addActionListener(new ActionListener() {
			//setText 출력 getText 사용자 입력값 가져오기 
			@Override
			public void actionPerformed(ActionEvent e) {
//				awt5_abstract.this.msg.setText("체크완료"); 
				//new ActionListener << 이게 클래스 취급이라. awt5_abstract.사용
				String userid = awt5_abstract.this.mid.getText();
				if(userid.equals("")) {
					msg.setText("아이디를 입력하세요");//<<원래 그냥 msg 호출 금지
				}
				else {
					id_check(userid);
					String result = signok();
					if(result==null) {
						msg.setText("사용가능한 아이디입니다");
					}
					else {
						msg.setText("다른 아이디를 입력하세요");
					}
				}
				
			}
		});
		this.close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
	}

}
