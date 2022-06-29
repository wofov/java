import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client_ex1 {
    //  http://naver.me/xA3SAcrt
	//  j705705
	
	public static void main(String[] args) {
		try{
		client_chat cc = new client_chat();
		cc.chat();
		}catch(Exception a) {
			if(a.getMessage()!=null) {
				System.out.println(a);
			}
		}
	}

}
class client_chat{
	private final String ip = "127.0.0.1";
	final int port = 8009;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = null;
	Socket sk = null;
	String msg = null;
	String smsg = null;
	public void chat() {
		//각종 Stream을 close를 하지 않는다. 왜나면 
		//모든 Stream이 소켓과 연결이 되어 있으므로 close시 소켓도 함께 종료
		int a = 0;
		try {
			//socket은 데이터가 본 데이터가 변경이 이루어지면 접속이 끊어지는 현상이 발생 할 수 있다. 
			this.sk = new Socket(this.ip,this.port);
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성하세요.");
			this.mid = sc.nextLine();
			
			this.os=this.sk.getOutputStream();
			this.is=this.sk.getInputStream();
			
			if(a==0) {
			this.msg = this.mid +"님 입장";
			this.os.write(this.msg.getBytes());
			}
			a=1;
			
			while(true) {
			
				System.out.println("내용을 입력하세요.");
				this.msg = this.mid +" : "+this.sc.nextLine().intern();
				if(this.msg.indexOf("exit")!=-1) {
					//id를 exit로 만드는 사람도 있기 때문에 다른 변수 생성해서 비교하기.
					//String(필드에 올릴것) u = this.sc.nextLine().intern(); 이런식으로 
					this.msg = this.mid +"님이 퇴장했습니다.";
					this.os.write(this.msg.getBytes());
//					this.os.flush();
//					this.os.close();
//					this.is.close();
					this.sk.close();
				}
				this.os.write(this.msg.getBytes());
				this.os.flush();
				
				byte data[]=new byte[1024];
				int n =this.is.read(data);
				this.smsg = new String(data,0,n);
				System.out.println(this.smsg);
				
			}
			
			
		}catch(Exception a1) {
			
		}
		
		
		
	}
	
	
}