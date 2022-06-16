
import java.awt.*;
import java.awt.event.*;

public class awt4_class {

	//awt4.java와 연계
	Label lb = new Label();
	public void view(){
		
		decorate de = new decorate();//awt4.java 자식 클래스 로드
		Frame fr = new Frame();
		fr.setBounds(200, 200, 300, 300);
		fr.setTitle("뀨");
		fr.setVisible(true);
		fr.setLayout(null);
		Button btn = new Button("계산"); 
		Button cbtn = new Button("종료"); 
		TextField input = new TextField();
		lb.setBackground(Color.gray);
		input.setBounds(50,50,100,25);
		btn.setBounds(180,50,80,25);
		cbtn.setBounds(50,200,80,25);
		lb.setBounds(50,100,200,100);
		fr.add(input);
		fr.add(btn);
		fr.add(cbtn);
		fr.add(lb);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					int c=Integer.parseInt(input.getText());
					de.btn_push(c);//사용자가 입력한 값을 btn_push메소드로 전달
				lb.setText(de.call());//awt4.java에 있는 getter로 전달 

				}catch(Exception v) { 
					lb.setText("숫자만입력해라");
//					System.out.println("숫자만 입력하세요");
				}
			}
		});
        cbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		        System.exit(0);
			}
		});
	}
	
	
	
	
	
	
	
}
