import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class awt7 {
	Checkbox ck = null;

	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setTitle(null);
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setBounds(300,300,350,180);
		Checkbox ck = new Checkbox("y");
		Choice se = new Choice();
		ck.setBounds(100,10,100,100);
		se.setBounds(30,120,100,30);
		
		fr.add(se);
		fr.add(ck);
		se.add("St");
		se.add("St2");
		se.add("St3");
		se.add("St4");
		ck.addItemListener(new ItemListener() {
			
			boolean agree = false; //�̰� �ִٸ� 2��
			@Override
			public void itemStateChanged(ItemEvent e) {
				String checks = (String)e.getItem();
				System.out.println(checks);
				System.out.println(e.getStateChange());
				//1�� üũ �� ���� 2�� üũ ����
				if(e.getStateChange()==1) {
					System.out.println("�����ϼ˱���");
					agree =true;
				}
				else {
					System.out.println("�����ؿ����մϤ���.");
					agree=false;
				}
			}
		});

		se.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String chang= (String)e.getItem();
				System.out.println(chang);
				
			}
		});
	}

}
