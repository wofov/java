import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

//���� ������ �������� 
//TCP(���� ��������) -���� �ӵ��� ���� ,
//UDP(����� ������ ��������) -���� �ӵ��� ���� (1:1�� ���� ������ ����)
/*PORT(TCP)
 80:WEB(http://)
 21:FTP(�������۽� ���)
 22:SSH-Linux,Unix(��������,�����ܺ�����)
 23:TELET-Window(�����ܺ�����)
 443:WEB(https://)
 25:SMTP(���ϼ���)-���� ������ 
 110:POP3(���Ϲޱ�)-����,���� �ޱ� (�񵿱�ȭ)
 143:IMAP(���Ϲޱ�)-����,���� �ޱ� (������ ����ȭ)
 */
/*
 SNMP:UDP(���ڹ߼۽ý���),VPN(���� IP) -UDP
 */
public class net2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է����ּ���.");
		String url = sc.next();
		URL u=new URL(url);//URL(Ŭ���� ����)  : ��Ʈ��ũ ��θ� ���մϴ�. 
		URLConnection con = u.openConnection();//�ش� ��θ� ���� 
	//	System.out.println(con);
		int imgsize = con.getContentLength();//indexOf��� -1����, �� �ܿ��� ���� Ȯ��. 
		System.out.println(imgsize);//���⼭ ���� -1�̸� �ּҰ� �߸��Ȱ� 
		//https://encrypted-tbn0.gstatic.com:443/images?q=tbn:ANd9GcTnnnObTCNg1QJoEd9Krwl3kSUnPYTZrxb5Ig&usqp=CAU
		//com�ڿ� �´� ��Ʈ 443 �ۼ��ϸ� ����� ���. �׸��� 80���� �ٸ� ��Ʈ �Է��ϸ� -1 ��� 
		String imgtype = con.getContentType();//���� �Ӽ��� Ȯ���ϴ� �κ�
		System.out.println(imgtype);//�̹��� ���� ���� ��� 
		long date = con.getDate();//���� �ε� ��¥ 
		System.out.println(date);
		
		
		//openStream() : URL������ ���.
		InputStream is = u.openStream();//URL���� ������ �о�� �� �����. 
		BufferedInputStream bi = new BufferedInputStream(is);//URL���� ���� ������ �ӽ�����. 
		FileOutputStream fo=new FileOutputStream("copy.mp4");//������
		byte data[]= new byte[1024];//1024=1KB �ش� ������ ������
//		fo.write(bi.read(data)); �ֹ߼��̶� ������� �����ε�. 
		
		int imgdata=0;
		int cnt = 0;//�ݺ���
		while((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata);//������ ������ �ٿ��ֱ� �ϴ� ���� 
			cnt += imgdata;//1024++
			System.out.println("�ٿ�ε� ��..."+(cnt*100/imgsize)+"%");
		}
		System.out.println("�ٿ�ε� �Ϸ�");
		fo.flush();
		fo.close();
		

	}

}
