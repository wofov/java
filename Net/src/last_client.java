import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8001
public class last_client {

	public static void main(String[] args) {
		port_chat pc = new port_chat();
		pc.connect();

	}

}
class port_chat{
	String ip  = "127.0.0.1";
	int port = 8001;
	InputStream is = null;
	OutputStream os = null;
	String msg = "";
	Socket sc = null;
	Scanner sc1 = null;
	public void connect() {
		try {
			this.sc=new Socket(this.ip,this.port);
			this.is=this.sc.getInputStream();
			this.os=this.sc.getOutputStream();
			
			this.msg = "클라이언트" + this.port;
			this.os.write(this.msg.getBytes());
			this.os.flush();
			
			while(true) {
				
			sc1= new Scanner(System.in);
			String say = sc1.nextLine();
			this.os.write(say.getBytes());
			this.os.flush();
			
			byte data[] = new byte[1024];
			int n = this.is.read(data);
			String mm = new String(data,n,0);
			System.out.println(mm);
			
			}
			
		}catch(Exception e) {
			
		}
		
	}
	
	
	
}