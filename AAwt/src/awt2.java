import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//�ܺ� Ŭ������ awt����
public class awt2 {

	public static void main(String[] args) {
//		log ok = new log();
		login lg = new login();

	}
class loginok extends login{//�α��� ���� �� ���ο� â �ٹ̴� ��.
	public loginok() {
		this.fr.setTitle("ȸ������ �� ������ �����");
		this.fr.setBounds(0,0,400,400);//ũ�⸸���
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}
}
class login {//�߻� Ŭ������ ���� �ε��Ͽ� �ʵ忡 ����
	Frame fr = new Frame();
	Font ft=new Font("����ü",Font.BOLD,20);//����ü, ����ü, ����ũ�� 
	Button close_btn = new Button("����");
	Button lg_btn = new Button("�α���");
	Button sh_btn = new Button("ȸ������");
	Label msg1 = new Label();
	TextField mid = new TextField();
	TextField mpw = new TextField();
	public login() {
		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(0,0,400,400);//ũ�⸸���
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.mid.setFont(ft);//���� �Ӽ��� �����ϰ��� �ϴ� ������Ʈ ����
		this.mpw.setFont(ft);//
		this.mpw.setEchoChar('*');//char ������ '' �� �Ѵ�
//		this.close_btn = new Button("����");
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
	public void clicks() {//��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ� 
		this.sh_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);//�ش� ������ ����
//				loginok ok = new loginok();//���� �����̸� ����>���� ���� �ذ��� ��ã��.
			
				
			}
		});
		
		this.close_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane();//swing API ��� �ɼ� �ε� 
			@Override
			public void actionPerformed(ActionEvent e) {
				//�α��� ��ư ���̵� �� �н����� ���� 
				String user_id = mid.getText();
				 String user_pw = mpw.getText();
				if(user_id.equals("")) {//���⼭�� null������ null ���� ���� �ִ� ���� �̱� �����̴�
					msg1.setText("���̵� �Է��ϼ���");
				  //alert.showMessageDialog(null, "���̵� �Է����ּ���"); // ���â ó�� �ߴ°�
				}
				else {
				   if(user_pw.equals("")) {
					   msg1.setText("�н����带 �Է��ϼ���");
				   }
				   else {
					   msg1.setText("�α��� ����");
				   }
					
				}
				
			}
		});
		
		
	}
}