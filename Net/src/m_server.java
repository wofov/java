import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {
		chatroom cr = new chatroom();

	}

}
class chatroom{//기본사항 > 각 접속 마다 thread를 분할 
	ServerSocket server = null;
	static final int port = 9009;//Thread에서 공용으로 사용하기 위함.
	Socket sk = null;
	
	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("****멀티채팅시작*****");
		
		while(true) {
			try {
				this.sk=this.server.accept();//클라이어트 접속 허가 
				chat_thread ct = new chat_thread(this.sk);
				Thread t = new Thread(ct);
				t.start();
			}catch(Exception e2) {
				
			}
		}
	}
}
class chat_thread implements Runnable{
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc = null;
	//배열을 메모리에 기억시킴 이유 .. 누적 때문에
	//접속자 발생시 쓰레드가 새롭게 생성되모르 static에 올리지 않으면
	//누적없이 계속 초기화 되어버림 
	static ArrayList<Socket> user = new ArrayList<>();//접속자
	public chat_thread(Socket s) {
		sc = new Scanner(System.in);
		System.out.println("아이디입력하세요");
		String uu1 = sc.nextLine();
		this.sk = s;
		this.user.add(s);
		nn nn = new nn(s);
		nn.a2(uu1);
		Thread t1 = new Thread(nn);
		t1.start();
		try {
		//	System.out.println("채팅에 참여 하였습니다.");
		//	System.out.println(this.sk);
			this.is=this.sk.getInputStream();
			this.os=this.sk.getOutputStream();
			
		}catch(Exception e3) {
			System.out.println("클라이언트 접속 정보 오류");
		}
	}
	@Override
	public void run() {
	
		try {
			
			while(true) {
				//System.out.println(this.user.size());
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.message = new String(data,0,n);
				System.out.println(this.message);
				
//				Scanner sc = new Scanner(System.in);
//				System.out.println("보낼 메세지 입력");
//				this.result = sc.nextLine();
				//배열에 있는 포트에 대한 정보를 담은 수 만큼 반복을 합니다. 
				for(int j=0;j<this.user.size();j++) {
					OutputStream all = this.user.get(j).getOutputStream();
					all.write(this.message.getBytes());
					all.flush();
				}
			}
		}catch(Exception e4) {
			System.out.println("클라이언트가 종료 되었습니다.");
		}
		finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
			}catch(Exception e5) {
				
			}
		}
	}
}
class nn extends Thread{
	//OutputStream os2 = null;
	Socket sk = null;
	Scanner sc = null;
	String abc=null;
	String a1=null;
	static String a3=null;
	static ArrayList<Socket> user1 = new ArrayList<>();//접속자
	public nn(Socket a) {
		this.sk = a;
		this.user1.add(a);
	}
	public void a2(String cc) {
		this.a3=cc;
	}
	@Override
	public void run() {
		
		try {
			
			while(true) {
				this.sc = new Scanner(System.in);
			this.abc= this.a3+" : " +sc.nextLine();
		 
			for(int j=0;j<this.user1.size();j++) {
			OutputStream all = this.user1.get(j).getOutputStream();
			all.write(this.abc.getBytes());
			all.flush();
			}
		}
		}catch(Exception aa) {
			
		}
	}
}

