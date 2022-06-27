import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

//전송 형태의 프로토콜 
//TCP(연걸 프로토콜) -전송 속도가 빠름 ,
//UDP(사용자 데이터 프로토콜) -전송 속도가 느림 (1:1일 경우는 굉장히 빠름)
/*PORT(TCP)
 80:WEB(http://)
 21:FTP(파일전송시 사용)
 22:SSH-Linux,Unix(파일전송,서버외부접속)
 23:TELET-Window(서버외부접속)
 443:WEB(https://)
 25:SMTP(메일서버)-메일 보내기 
 110:POP3(메일받기)-문자,파일 받기 (비동기화)
 143:IMAP(메일받기)-문자,파일 받기 (서버와 동기화)
 */
/*
 SNMP:UDP(문자발송시스템),VPN(가상 IP) -UDP
 */
public class net2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해주세요.");
		String url = sc.next();
		URL u=new URL(url);//URL(클래스 있음)  : 네트워크 경로를 말합니다. 
		URLConnection con = u.openConnection();//해당 경로를 연결 
	//	System.out.println(con);
		int imgsize = con.getContentLength();//indexOf기능 -1없음, 그 외에는 파일 확인. 
		System.out.println(imgsize);//여기서 값이 -1이면 주소가 잘못된것 
		//https://encrypted-tbn0.gstatic.com:443/images?q=tbn:ANd9GcTnnnObTCNg1QJoEd9Krwl3kSUnPYTZrxb5Ig&usqp=CAU
		//com뒤에 맞는 포트 443 작성하면 제대로 출력. 그리고 80같은 다른 포트 입력하면 -1 출력 
		String imgtype = con.getContentType();//파일 속성을 확인하는 부분
		System.out.println(imgtype);//이미지 파일 형식 출력 
		long date = con.getDate();//파일 로드 날짜 
		System.out.println(date);
		
		
		//openStream() : URL에서만 사용.
		InputStream is = u.openStream();//URL에서 파일을 읽어올 때 사용함. 
		BufferedInputStream bi = new BufferedInputStream(is);//URL에서 읽은 파일을 임시저장. 
		FileOutputStream fo=new FileOutputStream("copy.mp4");//저장방식
		byte data[]= new byte[1024];//1024=1KB 해당 파일을 조각냄
//		fo.write(bi.read(data)); 휘발성이라 사라지는 느낌인듯. 
		
		int imgdata=0;
		int cnt = 0;//반복값
		while((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata);//조각난 파일을 붙여넣기 하는 상태 
			cnt += imgdata;//1024++
			System.out.println("다운로드 중..."+(cnt*100/imgsize)+"%");
		}
		System.out.println("다운로드 완료");
		fo.flush();
		fo.close();
		

	}

}
