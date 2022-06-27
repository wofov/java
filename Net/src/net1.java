import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
	/*
	 Server(���Ӱ���)+ Client(������)
	 P2P
	 �¶��� ä�� : Client > Server���� > ä��
	 1:1ä�� P2P
	 IP:��Ʈ��ũ �ּ� 
	 -IPv4 0~255���� ���� 4��Ʈ - 0.0.0.0 > abc.co.kr(DNS)
	 -IPv6 128bit������ ����. 0:0:0:0:0:0:0:0>������ 4�ڸ� 
	  192.168.0.1 Gateway (x) // - 192.168.0.255 - �������� ������ 
	 */
	//UnknownHostException : Host ������ Ȯ�� ���� ���� ��� 
	public static void main(String[] args)throws UnknownHostException {
		//InetAddress : IP net work Address
		//getByName : ������ ������ �ּҸ��� ���մϴ�. 
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);//�Ѵ� ���� 
		//System.out.println(ia.getHostName());//naver.com�̰� ���� //������ ��
		//System.out.println(ia.getHostAddress());//ip�ּ� ���� //DNS�� ����� IP
		
		//getAllByName : �����ο� IP���� Ȯ�� 
		InetAddress ia2[] = InetAddress.getAllByName("naver.com");//All�̱� ������ �迭
		System.out.println(ia2[0].getHostAddress());//���̹� ip 1��°��
//		System.out.println(ia2[1].getHostAddress());//���̹� ip 2��°��
		System.out.println(ia2.length);//�ش� DNS�� ip����
		
		int w = 0 ;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
		
	}

}
