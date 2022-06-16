import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class awt6_absteact {
	public abstract void make();
	public abstract void user_num(String get);
	public abstract void pp();
	public abstract String re();
	Frame fr = new Frame();
	Button bt=null;
	Button bt2=null;
	Button cbt=null;
	TextField mid = null;
	Label msg = new Label();
	
	public void fire() {
		this.fr.setTitle(null);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.fr.setBounds(300,300,350,180);
		this.bt=new Button("인증번호 발송");
		this.bt2=new Button("인증번호 입력");
		this.cbt=new Button("종료");
		this.mid=new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(50,140,250,25);
		this.mid.setBounds(50,100,100,25);
		this.cbt.setBounds(300,60,30,25);
		this.bt.setBounds(50,60,100,25);
		this.bt2.setBounds(170,100,100,25);
		this.fr.add(bt);
		this.fr.add(bt2);
		this.fr.add(cbt);
		this.fr.add(mid);
		this.fr.add(msg);
		this.ok();
		}
	public void ok() {
		
		this.cbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.bt.addActionListener(new ActionListener() {//인증번호 발송버튼
			@Override
			public void actionPerformed(ActionEvent e) {
				awt6_absteact.this.make();
				
			}
		});
		this.bt2.addActionListener(new ActionListener() {//인증번호 확인 버튼
			@Override
			public void actionPerformed(ActionEvent e) {
//				int qq=Integer.valueOf(awt6_absteact.this.mid.getText());
				String qq =awt6_absteact.this.mid.getText();
				awt6_absteact.this.user_num(qq);
				
				awt6_absteact.this.msg.setText(re());
				
				
				
			}
		});
	}
}
