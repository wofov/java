import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ha1Ser {

	public static void main(String[] args) {
		/*
		 서버 프로그램을 실행합니다.
		 실행시 가장 먼저 해당 질문을 하게 됩니다.
		 사용하실 포트 번호를 입력하세요.
		 -예시)9009
		 +++++++++채팅서버 오픈++++++++++
		 
		 포트번호는 무조건 숫자만.
		 클라이언트 프로그램 실행합니다.
		 접속할 ip번호를 입력하세요
		 접속할 포트 번호를 입력하세요
		 
		 이제 서버에서(클라이언트에서 승인이 떨어졌으니)
		 ====게스트 참여====
		 */
		ff f = new ff();
	}
}
class ff{
	ServerSocket sk = null;
	Socket sc = null;
	//InputStream is = null;
	//OutputStream os = null;
	Scanner sc1 = null;
	int port;
	public ff() {
		try {
			
		this.sc1 = new Scanner(System.in);
		System.out.println("사용하실 포트 번호를 입력하세요");
		this.port = Integer.valueOf(sc1.nextInt());
		
		System.out.println("채팅서버오픈");
		this.sk = new ServerSocket(this.port);
		//서버 소켓에 포트 번호 대입
		this.sc = this.sk.accept();
		//일반 소켓에 서버소켓 접속 허용
		System.out.println("게스트 참여");
		
		}catch(Exception e) {
			System.out.println("숫자만 입력가능합니다.");
		}						
	}	
	
}