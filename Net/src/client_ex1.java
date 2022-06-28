import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client_ex1 {

	final static String ip = "157.5.5.0";//예시임
	final static int port = 9090;
	static Scanner sc = null;
	static String myid = null;
	
	public static void main(String[] args) {
		try {
			sc= new Scanner(System.in);
			System.out.println("채팅에 사용하실 아이디를 입력해주세요");
			myid=sc.next();
			
			Socket sk = new Socket(ip,port);
			OutputStream os = sk.getOutputStream();
			String message = myid + "님이 입장했습니다";
			os.write(message.getBytes());
			os.flush();
			int c=0;
			while(true) {
				InputStream is =sk.getInputStream();
				byte data[] = new byte[1024];
				int no = is.read(data);
				String msg = new String(data,0,no);
				
				sc = new Scanner(System.in);
				System.out.println("내용일 입력해주세요");
				String message1 = myid +" : " +sc.nextLine();
				//서버가 값을 받을때 split로 받아서 처리 가능. 
				os.write(message1.getBytes());
				
				
				os.flush();
				//os.close();
				//is-.close();
				
				c++;
			}
			
			
			
		}catch(Exception z) {
			
		}
	}

}
