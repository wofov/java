import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server_ex1 {

	static String mid = null;
	public static void main(String[] args) {
		/*
		 * 9090포트
		 서버에서 사용하실 아이디를 입력해주세요.
		 대기중....
		 */
		ServerSocket ss = null;
		Scanner sc = null;
		Socket s1=null;
		InputStream is=null;
		OutputStream os=null;
		int port =9091;
		try {//통신 관련 예외처리문 필요. 
			ss = new ServerSocket(port);
			System.out.println("서버에서 사용하실 아이디를 입력해주세요.");
			sc = new Scanner(System.in);
			String msg2 = sc.nextLine();
			
	//		sc.close();//나중에 재로드하니까 지금은 종료
			
			System.out.println("대기중.....");
			s1 = ss.accept();
			is = s1.getInputStream();
			os = s1.getOutputStream();
			
			for(;;) {
			byte data[]= new byte[1024];
			int n = is.read(data);
			
			String msg = new String(data,0,n);
			System.out.println(msg);
//			if(msg.indexOf("exit")!=-1) {
//				System.out.println("상대방이 퇴장");
//			}
		
	//		sc = new Scanner(System.in);
			System.out.println("내용을 입력해주세요.");
			
			String msg1 = msg2+" : "+sc.nextLine();
			os.write(msg1.getBytes());
			
			os.flush();
			}
	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
