import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {

    public awt1() {
    	
    }
	public static void main(String[] args) {
		//frame > bound > object
		Frame fr = new Frame();//â
		fr.setTitle("AWT ���� ȭ��");
		fr.setVisible(true);
		fr.setLayout(null);//�г��� ��� ���ϱ� ���� ����
		fr.setBounds(150,150,500,500);//(x��, y��, ����ũ��, ����ũ��) 0,0 ���� ��
		
		Button btn =new Button("Ŭ��");
		Button closebtn = new Button("�ݱ�");
		Label msg = new Label("^&^");
		
		msg.setBackground(Color.red);
		btn.setBounds(40,40,100,30);
		closebtn.setBounds(160,40,100,30);
		msg.setBounds(30,100,300,40);
		//object�� frame�� �����ϰ� �˴ϴ�. 
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);
		//ActionListener(��ư) �̺�Ʈ �޼ҵ� / ��, this��� ���� �ȵ�.
		closebtn.addActionListener(new ActionListener() {
			//new ActionListener : �������̵� �޼ҵ� �ڵ� ����
			@Override
			public void actionPerformed(ActionEvent e) {
                    System.exit(0);
			}
		});
		btn.addActionListener(new ActionListener() {
			String a= "Ȧ�浿";
			//addActionListener �̺�Ʈ �޼ҵ� �ʵ忡 String�� ���� ����.
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(this.a);//this�� �̿��Ͽ� �ڵ鸵 ����. 
			}
		});
	}

}
