import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		String ip = "192.168.1.152";
		int port = 8009;
		Socket sc =null;
		Scanner sn = null;
		OutputStream os = null;
		InputStream is=null;
		try {
			sc = new Socket(ip,port);
			os = sc.getOutputStream();
			is = sc.getInputStream();
			for(;;) {//���������� ���Ͽ� ��� ���� �ǵ��� �ϴ� ���� 
			System.out.println("���� ���� ����");
			
			sn = new Scanner(System.in);
			System.out.println("�Է��Ͻ� ������ �����ּ���");
			String msg = sn.nextLine();
			os.write(msg.getBytes());
			
			byte data[] = new byte[1024];
			int n = is.read(data);
			String cmsg=new String(data,0,n);
			System.out.println(cmsg);
			
			os.flush();
//			sc.close();
//			sn.close();
			}
			
		}catch(Exception c) {
			if(c.getMessage()!=null) {
			//	sn.close();	
			System.out.println("���� ���� ��ְ� �߻� �Ͽ����ϴ�.");
			}
		}
		finally {//Ŭ���̾�Ʈ�� ���� ����� �ش� ���� �� ���� Stream,Scanner ��� ���� 
			try {
			    sn.close();
				sc.close();//�ʵ忡 �����ϱ�. 
				is.close();
				sn.close();
				System.out.println("����");
			}catch(Exception aa) {
				
			}
		}
		
		
	}

}
