import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server_ex1 {

	static String mid = null;
	public static void main(String[] args) {
		/*
		 * 9090��Ʈ
		 �������� ����Ͻ� ���̵� �Է����ּ���.
		 �����....
		 */
		ServerSocket ss = null;
		Scanner sc = null;
		Socket s1=null;
		InputStream is=null;
		OutputStream os=null;
		int port =9091;
		try {//��� ���� ����ó���� �ʿ�. 
			ss = new ServerSocket(port);
			System.out.println("�������� ����Ͻ� ���̵� �Է����ּ���.");
			sc = new Scanner(System.in);
			String msg2 = sc.nextLine();
			
	//		sc.close();//���߿� ��ε��ϴϱ� ������ ����
			
			System.out.println("�����.....");
			s1 = ss.accept();
			is = s1.getInputStream();
			os = s1.getOutputStream();
			
			for(;;) {
			byte data[]= new byte[1024];
			int n = is.read(data);
			
			String msg = new String(data,0,n);
			System.out.println(msg);
//			if(msg.indexOf("exit")!=-1) {
//				System.out.println("������ ����");
//			}
		
	//		sc = new Scanner(System.in);
			System.out.println("������ �Է����ּ���.");
			
			String msg1 = msg2+" : "+sc.nextLine();
			os.write(msg1.getBytes());
			
			os.flush();
			}
	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
