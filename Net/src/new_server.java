import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class new_server {

	public static void main(String[] args) {
		chat ch = new chat();
		ch.chatserver();
	}

}
class chat{
	private int port = 8009;
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os= null;
	String mid = null;
	String msg = null;
	String cmsg = null;
	public void chatserver() {
		int a=0;
		try {
			this.sk = new ServerSocket(port);
			this.sc = new Scanner(System.in);
			
			System.out.println("사용자 아이디를 입력해주세요.");
			this.mid = sc.nextLine();
			this.so=this.sk.accept();
			
			System.out.println("채팅방 개설 완료.");
			
			this.is=this.so.getInputStream();
			this.os=this.so.getOutputStream();
			
			if(a==0) {
			byte data[]=new byte[1024];
			int n = this.is.read(data);
			this.msg = new String(data,0,n);
			System.out.println(this.msg);
		    }
			a=1;
			while(true) {
				byte data1[]=new byte[1024];
				int n1 = this.is.read(data1);
				this.msg = new String(data1,0,n1);
				System.out.println(this.msg);
//				if(this.msg.indexOf("퇴장")!=-1) {
//					sk.close();
//					break;
//				}
				
				System.out.println("내용을 입력하세요");
				this.cmsg = this.mid +" : "+this.sc.nextLine().intern();
				this.os.write(this.cmsg.getBytes());
				this.os.flush();
				
			}
//			if(this.so!=this.sk.accept()) {
//			sk.close();
//			
//		}
			
			
		}catch(Exception e) {
			
			
		}
		
		
		
		
		
		
	}
}