import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class net {

	public static void main(String[] args) {
		try {
			ServerSocket ss= new ServerSocket();
			ss.bind(new InetSocketAddress("localhost",7070));
			System.out.println("�������Դϴ�.");
			Socket sc= ss.accept();
			InetSocketAddress ia =(InetSocketAddress) sc.getRemoteSocketAddress();
			System.out.println("����Ȯ��");
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
