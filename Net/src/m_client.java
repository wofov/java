import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력하세요");
		String user = sc.nextLine();
		chatclient cc = new chatclient(user);

	}

}
class chatclient{
	static final String ip = "127.0.0.1";
	static final int port = 9009;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	
	public chatclient(String mid) {
		this.sc = new Scanner(System.in);
		try {
			this.sk = new Socket(this.ip, this.port);
			
			this.os = this.sk.getOutputStream();
			this.is = this.sk.getInputStream();
			this.os.write((mid+"님 접속").getBytes());
			
			while(true) {
//				
				byte data[] = new byte[4096];
				int n = this.is.read(data);
				this.result = new String(data,0,n);
				System.out.println(this.result);
				
				System.out.println("채팅 내용을 입력하세요.");
				String uu = this.sc.nextLine();
				this.message = mid + " : " + uu;
				this.os.write(this.message.getBytes());
				this.os.flush();
				
			}
			
		}catch(Exception e) {
			
		}
		
	}
	
}