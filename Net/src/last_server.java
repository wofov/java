import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


//Exception : bind Exception (��Ʈ �浹)
public class last_server {
//Server�� �������� ��Ʈ�� ���� 
	public static void main(String[] args) {
		int port[] = {8001,8002};
		int w=0;
		openchat oc = null;
		while(w<port.length) {
			oc = new openchat(port[w]);
			oc.start();
			w++;
		}

	}

}
class openchat extends Thread{
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk =null;
	InputStream is = null;
	OutputStream os = null;
	Scanner sc = null;
	String mm="";
	public openchat(int p) {
		this.pt =p;
	}
	@Override
	public void run() {
		try {
			sk = new ServerSocket(this.pt);
			Socket s = sk.accept();//�ش� port ��� ���� 
			System.out.println("��������");
			
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			
			while(true) {
				
			byte data[] = new byte[1024];
			int n = is.read(data);
			String message = new String(data,0,n);
			System.out.println(message);
			
			sc = new Scanner(System.in);
			mm=sc.nextLine();
			this.os.write(this.mm.getBytes());
			this.os.flush();
			
			}
			
		}catch(Exception e) {
			
		}
	}
}





