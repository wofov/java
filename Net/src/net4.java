import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class net4 {
//ũ�Ѹ� 2�� 
	public static void main(String[] args) throws Exception{
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url = new URL(page);
		/*
		 Stream�� ����ϸ� read�� ��� ����(byte �̿�) int ��� 
		 Reader��� ������ readLine ��� ����(String)
		 flush() ��� ���� BufferedOutputStream 
		 */
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is);//�迭 byte[]
		byte html[]=new byte[1024];
		
		//BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html")); 
		//�̰͵� �����ϸ� �� �� �����ٰ� �Ѵ�. �̰� ����ϸ� �Ʒ� fs.flush�ۼ� �ؾ��Ѵ�. 
		
		FileOutputStream fs=new FileOutputStream("game.html");//���� �Է��ϴ� �ּ�? _ �迭 �� �ε��ؼ� ���� 
		//FileWriter�� �޾Ƶ� �ȴ�. 
		int s = 0;
		while((s=bs.read(html))!=-1) {
			//System.out.println(s); �ƽ�Ű �ڵ� ���
			fs.write(html,0,s);
		}
		//fs.flush();
		bs.close();
		fs.close();

	}

}
