import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//files로 해당 모든 내용을 배열로 전송 시키는 방법. 

public class file8 {

	public static void main(String[] args)throws IOException {
	     List<String> data=Files.readAllLines(Paths.get("C:\\java5\\File_stearm\\src\\buffer.txt"));
	     System.out.println(data);

	     System.out.println(data.get(0));
	    
	     //List는 최상위 배열 클래스
	     //Files 신규 IO클래스 입니다. readAllLines 전체 내용을 한번에 모두 읽는다
	     //Files + Paths.get("경로")
	     
	     //단점 메모리 할당이 많아짐 한금 언어 패킷을 조저 ㅇ 해야함
	     byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_stearm\\src\\buffer.txt"));
	     System.out.println(new String(data2));
	}

}
