import java.awt.Button;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class awt8 {

	TextField search=null;
	public static void main(String[] args) {
//		try {
//			Desktop.getDesktop().browse(new URI("http://naver.com"));
//			
//		}catch(Exception a) {
//			System.out.println("URL ���� �߻�");
//		}
		Frame fr = new Frame();
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setBounds(300,300,350,180);
		TextField search =new TextField();
		Button btn = new Button("�˻�");
		search.setBounds(10,30,150,25);
		btn.setBounds(200,30,80,25);
		fr.add(search);
		fr.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String sh = search.getText();
				if(sh.equals("")) {
					System.out.println("�˻��� �Է��ϼ���");
				}
				else {
					System.out.println(sh);
					try {//�ü���� edge�� ���
						//uri �ڹ�.net api�Լ� (��Ʈ��ũ ��Ʈ) ��� �ܿ� �Ķ���� ���� ���մϴ�. 
						Desktop.getDesktop().browse(new URI("http://search.naver.com/search.naver?query="+sh));
						
					}catch(Exception a) {
						System.out.println("URL ���� �߻�");
					}
				}
				
			}
		});

	}

}
