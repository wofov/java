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
		this.sk = s;
		this.user.add(s);
		try {
			System.out.println("ä�ÿ� ���� �Ͽ����ϴ�.");
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

				Scanner sc = new Scanner(System.in);
				System.out.println("���� �޼��� �Է�");
				this.result = sc.nextLine();
				//�迭�� �ִ� ��Ʈ�� ���� ������ ���� �� ��ŭ �ݺ��� �մϴ�. 
				for(int j=0;j<this.user.size();j++) {
					OutputStream all = this.user.get(j).getOutputStream();
					all.write(this.result.getBytes());
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