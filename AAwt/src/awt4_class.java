
import java.awt.*;
import java.awt.event.*;

public class awt4_class {

	//awt4.java�� ����
	Label lb = new Label();
	public void view(){
		
		decorate de = new decorate();//awt4.java �ڽ� Ŭ���� �ε�
		Frame fr = new Frame();
		fr.setBounds(200, 200, 300, 300);
		fr.setTitle("��");
		fr.setVisible(true);
		fr.setLayout(null);
		Button btn = new Button("���"); 
		Button cbtn = new Button("����"); 
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
					de.btn_push(c);//����ڰ� �Է��� ���� btn_push�޼ҵ�� ����
				lb.setText(de.call());//awt4.java�� �ִ� getter�� ���� 

				}catch(Exception v) { 
					lb.setText("���ڸ��Է��ض�");
//					System.out.println("���ڸ� �Է��ϼ���");
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
