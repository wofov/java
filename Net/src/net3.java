import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class net3 {
//상대방 파일 긁어오기 > 크롤링 이라고 함. crawling
	public static void main(String[] args) throws IOException{
		String url ="https://www.lookpin.co.kr/login.html";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		long size = con.getContentLengthLong();
		System.out.println(size);
		System.out.println(urls.getProtocol());//https //프로토콜
		System.out.println(urls.getPort());//443 //포트번호
		System.out.println(urls.getFile());// __ /login (마지막) //접속 파일명 
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fs = new FileWriter("login.html");
		byte html[]=new byte[1024];
		//System.out.println(br.readLine());
//		FileOutputStream fs = new FileOutputStream("login.html");
		String str="";
		while((str=br.readLine())!=null) {
			fs.write(str);
		}
		br.close();
		fs.flush();
		fs.close();

	}

}
