import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket : Server, Client : �޼��� ���� �ۼ��� ��� (�����)

//HTTP ��� : Image, ������, ���� �����(��û) ����(����)�� �ۼ��� ���(�� ����)
public class net5 {
//net 6�� ����
	//Server //���μ��� ���̴¹� cmd// PID ���� ��
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 8080; // ������ ��Ʈ ��ȣ�� ������(��, ���� �ߺ��� ��Ʈ�� ����ϸ� �ȵ�. 
		String msg = "Success Connect!!";
		
		try {
			ServerSocket ss = new ServerSocket(port);//ServerSocket:���½�ų ��Ʈ�� ���� 
			//������ ���������ϱ� ���ؼ��� ���������� ���� ��ε带 �ؼ��� �ȵ˴ϴ�. 
		while(true) {
		System.out.println("���� ��� ��...");
		Socket sc = ss.accept();//accept() : Ŭ���̾�Ʈ�� ������ ���� ����ϴ� ��Ȱ�� �ϰ� ��. 
		System.out.println("ȣ��Ʈ:��� ���� ����");
	
		//Server���� client �� �޴� ���
		InputStream is = sc.getInputStream();//Ŭ���̾�Ʈ���� ������ ���� �о����. 
		
		//client�� ������ ���
		OutputStream os = sc.getOutputStream();//Client�� ���� ���� 
		byte data[]=new byte[1024];//Client���� �޴� ���� byte�� ���� 
		int n = is.read(data);//�ش� ���� �о����.
		
		String msgclient = new String(data,0,n);//�ش� ���� �迭�� Ȯ���Ͽ� ������ �̰� 
		System.out.println(msgclient);//�̰��� ���� ��½�Ű�� �� 
		
		String aws = "�ݰ����ϴ�";//�������� ������ �޼���
		os.write(aws.getBytes());//Ŭ���̾�Ʈ�� ������ ���� �޸� ����
		os.flush();
		
		is.close();
		os.close();
		sc.close();
		}
		}catch(Exception e){
			System.out.println("���� ���� ��Ʈ�� �ߺ��Ǿ� ������ ���� �����մϴ�.");
		}
	}

}
