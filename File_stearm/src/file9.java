
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
//Reader(최상위)-(하위) BufferReader,FileReader,CharArrayReader--reader 사용 하는것 문서파일 이다. 
//하위 inputStreamReader - 이미지 , 동영상, 오디오 
//inputStream 입력하는
public class file9 {

	public static void main(String[] args)/*throws IOException*/ {
		//Stream :이미지,동영상,오디오 같은 파일을 로드하기 위해서. (바이너리)
		//InputStream :모든 입력 장치에 대한 값을 받는 클래스입니다. 기본(int)-ASCII
		//InputStream :최상위 입력장치 
		//-FileInputStream, AudioInputStream, ObjectInputSteram > 하위 클래스 
		InputStream is = new InputStream() {//기본 클래스를 로드하여 오버라이드 메소드 
			@Override
			public int read() throws IOException {//byte 1~2
				int a= 15;
				return a;
			}
//			public String read2() throws IOException{
//				return null;
//			}>>InputStream 이거 하나당 리턴값 하나씩 밖에 추가 안됨. 참고할것 ★★
		};
		//InputStreamReader (언어패킷 변경)
		InputStreamReader ir = new InputStreamReader(is);
//		InputStreamReader ir = new InputStreamReader(is,Charset.forName("URF8")); >> input이라 가능. 
		//is 가 inputStream
		//InputStreamReader ir = new InputStreamReader("파일주소","언어패킷"_UTF8,EUCKR 등등);
		try {
			System.out.println(is.read());
//			System.out.println(is.read2()); ★★
		}catch(Exception z) {
			
		}
		//키보드 값 로드
		InputStream user = System.in;//>키보드 입력받음. 
		try{
			int code = user.read();//키보드 입력 아스키 ASCII (< 메모장에 알트 누르고 key(번호)누르는 거) 코다 값을 변환
			System.out.println(code);
			if(code==13) {//아스키코드
				System.out.println("엔터키는 사용할수 없다");
			}
		}catch(Exception z) {
			
		}

	}

}
