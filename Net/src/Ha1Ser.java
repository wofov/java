import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ha1Ser {

	public static void main(String[] args) {
		/*
		 ���� ���α׷��� �����մϴ�.
		 ����� ���� ���� �ش� ������ �ϰ� �˴ϴ�.
		 ����Ͻ� ��Ʈ ��ȣ�� �Է��ϼ���.
		 -����)9009
		 +++++++++ä�ü��� ����++++++++++
		 
		 ��Ʈ��ȣ�� ������ ���ڸ�.
		 Ŭ���̾�Ʈ ���α׷� �����մϴ�.
		 ������ ip��ȣ�� �Է��ϼ���
		 ������ ��Ʈ ��ȣ�� �Է��ϼ���
		 
		 ���� ��������(Ŭ���̾�Ʈ���� ������ ����������)
		 ====�Խ�Ʈ ����====
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
		System.out.println("����Ͻ� ��Ʈ ��ȣ�� �Է��ϼ���");
		this.port = Integer.valueOf(sc1.nextInt());
		
		System.out.println("ä�ü�������");
		this.sk = new ServerSocket(this.port);
		//���� ���Ͽ� ��Ʈ ��ȣ ����
		this.sc = this.sk.accept();
		//�Ϲ� ���Ͽ� �������� ���� ���
		System.out.println("�Խ�Ʈ ����");
		
		}catch(Exception e) {
			System.out.println("���ڸ� �Է°����մϴ�.");
		}						
	}	
	
}