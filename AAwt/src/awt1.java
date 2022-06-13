import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {

    public awt1() {
    	
    }
	public static void main(String[] args) {
		//frame > bound > object
		Frame fr = new Frame();//창
		fr.setTitle("AWT 기초 화면");
		fr.setVisible(true);
		fr.setLayout(null);//패널을 사용 안하기 위한 대입
		fr.setBounds(150,150,500,500);//(x축, y축, 가로크기, 세로크기) 0,0 왼쪽 위
		
		Button btn =new Button("클릭");
		Button closebtn = new Button("닫기");
		Label msg = new Label("^&^");
		
		msg.setBackground(Color.red);
		btn.setBounds(40,40,100,30);
		closebtn.setBounds(160,40,100,30);
		msg.setBounds(30,100,300,40);
		//object를 frame에 적용하게 됩니다. 
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);
		//ActionListener(버튼) 이벤트 메소드 / 단, this사용 절대 안됨.
		closebtn.addActionListener(new ActionListener() {
			//new ActionListener : 오버라이드 메소드 자동 생성
			@Override
			public void actionPerformed(ActionEvent e) {
                    System.exit(0);
			}
		});
		btn.addActionListener(new ActionListener() {
			String a= "홀길동";
			//addActionListener 이벤트 메소드 필드에 String을 생성 가능.
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(this.a);//this를 이용하여 핸들링 가능. 
			}
		});
	}

}
