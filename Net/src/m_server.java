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
class chatroom{//�⺻���� > �� ���� ���� thread�� ���� 
	ServerSocket server = null;
	static final int port = 9009;//Thread���� �������� ����ϱ� ����.
	Socket sk = null;
	
	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("****��Ƽä�ý���*****");
		
		while(true) {
			try {
				this.sk=this.server.accept();//Ŭ���̾�Ʈ ���� �㰡 
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
	//�迭�� �޸𸮿� ����Ŵ ���� .. ���� ������
	//������ �߻��� �����尡 ���Ӱ� �����Ǹ� static�� �ø��� ������
	//�������� ��� �ʱ�ȭ �Ǿ���� 
	static ArrayList<Socket> user = new ArrayList<>();//������
	public chat_thread(Socket s) {
		sc = new Scanner(System.in);
		System.out.println("���̵��Է��ϼ���");
		String uu1 = sc.nextLine();
		this.sk = s;
		this.user.add(s);
		nn nn = new nn(s);
		nn.a2(uu1);
		Thread t1 = new Thread(nn);
		t1.start();
		try {
		//	System.out.println("ä�ÿ� ���� �Ͽ����ϴ�.");
		//	System.out.println(this.sk);
			this.is=this.sk.getInputStream();
			this.os=this.sk.getOutputStream();
			
		}catch(Exception e3) {
			System.out.println("Ŭ���̾�Ʈ ���� ���� ����");
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
//				System.out.println("���� �޼��� �Է�");
//				this.result = sc.nextLine();
				//�迭�� �ִ� ��Ʈ�� ���� ������ ���� �� ��ŭ �ݺ��� �մϴ�. 
				for(int j=0;j<this.user.size();j++) {
					OutputStream all = this.user.get(j).getOutputStream();
					all.write(this.message.getBytes());
					all.flush();
				}
			}
		}catch(Exception e4) {
			System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ����ϴ�.");
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
	static ArrayList<Socket> user1 = new ArrayList<>();//������
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

