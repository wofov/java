import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
	/*
	 Server(접속공간)+ Client(접속자)
	 P2P
	 온라인 채팅 : Client > Server접속 > 채팅
	 1:1채팅 P2P
	 IP:네트워크 주소 
	 -IPv4 0~255까지 정수 4파트 - 0.0.0.0 > abc.co.kr(DNS)
	 -IPv6 128bit단위로 설정. 0:0:0:0:0:0:0:0>무족건 4자리 
	  192.168.0.1 Gateway (x) // - 192.168.0.255 - 보안접속 페이지 
	 */
	//UnknownHostException : Host 정보가 확인 되지 않을 경우 
	public static void main(String[] args)throws UnknownHostException {
		//InetAddress : IP net work Address
		//getByName : 접속할 도메인 주소명을 말합니다. 
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);//둘다 나옴 
		//System.out.println(ia.getHostName());//naver.com이게 나옴 //도메인 명
		//System.out.println(ia.getHostAddress());//ip주소 나옴 //DNS에 연결된 IP
		
		//getAllByName : 도메인에 IP정보 확인 
		InetAddress ia2[] = InetAddress.getAllByName("naver.com");//All이기 때문에 배열
		System.out.println(ia2[0].getHostAddress());//네이버 ip 1번째꺼
//		System.out.println(ia2[1].getHostAddress());//네이버 ip 2번째꺼
		System.out.println(ia2.length);//해당 DNS에 ip갯수
		
		int w = 0 ;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
		
	}

}
