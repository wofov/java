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
		//���� Stream�� close�� ���� �ʴ´�. �ֳ��� 
		//��� Stream�� ���ϰ� ������ �Ǿ� �����Ƿ� close�� ���ϵ� �Բ� ����
		int a = 0;
		try {
			//socket�� �����Ͱ� �� �����Ͱ� ������ �̷������ ������ �������� ������ �߻� �� �� �ִ�. 
			this.sk = new Socket(this.ip,this.port);
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �����ϼ���.");
			this.mid = sc.nextLine();
			
			this.os=this.sk.getOutputStream();
			this.is=this.sk.getInputStream();
			
			if(a==0) {
			this.msg = this.mid +"�� ����";
			this.os.write(this.msg.getBytes());
			}
			a=1;
			
			while(true) {
			
				System.out.println("������ �Է��ϼ���.");
				this.msg = this.mid +" : "+this.sc.nextLine().intern();
				if(this.msg.indexOf("exit")!=-1) {
					//id�� exit�� ����� ����� �ֱ� ������ �ٸ� ���� �����ؼ� ���ϱ�.
					//String(�ʵ忡 �ø���) u = this.sc.nextLine().intern(); �̷������� 
					this.msg = this.mid +"���� �����߽��ϴ�.";
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