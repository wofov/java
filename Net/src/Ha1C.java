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
		System.out.println("������ IP��ȣ �Է��ϼ���");
		this.ip1 = sc.nextLine();
		
		System.out.println("������ port��ȣ�� �Է��ϼ���");
		this.port = Integer.valueOf(sc.nextInt());
		
		this.sk= new Socket(this.ip1,this.port);
		//Ŭ���̾�Ʈ�� ���� �ʿ���� �׳� ���Ͽ� ip,port���� 
		
		}catch(Exception e) {
			System.out.println("��Ʈ�� ���ڸ� �Է� �����մϴ�.");
		}
				
		
	}
}