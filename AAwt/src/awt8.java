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
//			System.out.println("URL 오류 발생");
//		}
		Frame fr = new Frame();
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setBounds(300,300,350,180);
		TextField search =new TextField();
		Button btn = new Button("검색");
		search.setBounds(10,30,150,25);
		btn.setBounds(200,30,80,25);
		fr.add(search);
		fr.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String sh = search.getText();
				if(sh.equals("")) {
					System.out.println("검색을 입력하세요");
				}
				else {
					System.out.println(sh);
					try {//운영체제중 edge를 사용
						//uri 자바.net api함수 (네트워크 파트) 경로 외에 파라미터 값을 말합니다. 
						Desktop.getDesktop().browse(new URI("http://search.naver.com/search.naver?query="+sh));
						
					}catch(Exception a) {
						System.out.println("URL 오류 발생");
					}
				}
				
			}
		});

	}

}
