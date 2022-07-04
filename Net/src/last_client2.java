import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class last_client2 {
//8002
	public static void main(String[] args) {
			port_chat1 pc = new port_chat1();
			pc.connect();

		}

}
class port_chat1{
		String ip  = "";
		int port = 8002;
		InputStream is = null;
		OutputStream os = null;
		String msg = "";
		Socket sc = null;
		public void connect() {
			try {
				this.sc=new Socket(this.ip,this.port);
				this.is=this.sc.getInputStream();
				this.os=this.sc.getOutputStream();
				while(true) {
				this.msg = "클라이언트" + this.port;
				this.os.write(this.msg.getBytes());
				this.os.flush();
				}
				
			}catch(Exception e) {
				
			}
			
}
}

	
		