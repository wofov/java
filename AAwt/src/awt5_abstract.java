import java.awt.*;
import java.awt.event.*;

//awt ȯ�漳���� 
public abstract class awt5_abstract {

	public abstract String signok();//void�� �ƴ� �ڷ��� �� getter
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
		this.bt = new Button("�溹üũ");
		this.close = new Button("����");
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
		this.click();//awt�������� �Ϸ� �� �ش� �ڵ鸲 �޼ҵ�� �̵�
	}
	public void click() {
		
		this.bt.addActionListener(new ActionListener() {
			//setText ��� getText ����� �Է°� �������� 
			@Override
			public void actionPerformed(ActionEvent e) {
//				awt5_abstract.this.msg.setText("üũ�Ϸ�"); 
				//new ActionListener << �̰� Ŭ���� ����̶�. awt5_abstract.���
				String userid = awt5_abstract.this.mid.getText();
				if(userid.equals("")) {
					msg.setText("���̵� �Է��ϼ���");//<<���� �׳� msg ȣ�� ����
				}
				else {
					id_check(userid);
					String result = signok();
					if(result==null) {
						msg.setText("��밡���� ���̵��Դϴ�");
					}
					else {
						msg.setText("�ٸ� ���̵� �Է��ϼ���");
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
