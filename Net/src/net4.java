import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class net4 {
//크롤링 2번 
	public static void main(String[] args) throws Exception{
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url = new URL(page);
		/*
		 Stream을 사용하면 read만 사용 가능(byte 이용) int 취급 
		 Reader라고 있으면 readLine 사용 가능(String)
		 flush() 사용 형태 BufferedOutputStream 
		 */
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is);//배열 byte[]
		byte html[]=new byte[1024];
		
		//BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html")); 
		//이것도 가능하며 좀 더 빠르다고 한다. 이거 사용하면 아래 fs.flush작성 해야한다. 
		
		FileOutputStream fs=new FileOutputStream("game.html");//새로 입력하는 주소? _ 배열 값 로드해서 저장 
		//FileWriter로 받아도 된다. 
		int s = 0;
		while((s=bs.read(html))!=-1) {
			//System.out.println(s); 아스키 코드 출력
			fs.write(html,0,s);
		}
		//fs.flush();
		bs.close();
		fs.close();

	}

}
