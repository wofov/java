import java.net.Socket;
import java.util.Scanner;

public class Ha1C {

	public static void main(String[] args) {
		ff1 f1 = new ff1();
	}
}
class ff1{
	Scanner sc = null;
	String ip1 = null;
	int port;
	Socket sk = null;
	public ff1() {
		try {
		
		this.sc = new Scanner(System.in);
		System.out.println("접속할 IP번호 입력하세요");
		this.ip1 = sc.nextLine();
		
		System.out.println("접속할 port번호를 입력하세요");
		this.port = Integer.valueOf(sc.nextInt());
		
		this.sk= new Socket(this.ip1,this.port);
		//클라이언트는 서버 필요없음 그냔 소켓에 ip,port대입 
		
		}catch(Exception e) {
			System.out.println("포트는 숫자만 입력 가능합니다.");
		}
				
		
	}
}