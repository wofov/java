import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutputStream(output) - 최상위
//FileOutputStream(하위), ObjectOutputStream
public class file10 {
//이건 너무 뭐가 뭔지 모르겟다. 
	public static void main(String[] args) {
//		String a= "홍길동"; 문자
		String a="123456";
		byte[] b= a.getBytes(); //getBytes("언어패킷")메소드
		//byte[] :문자열을 ASCII 형태의 배열로 변경할 때 사용
		System.out.println(Arrays.toString(b));
		OutputStream os = System.out;//출력만 사용 ==System.out.println();같은 역활
		
		
		try {
			os.write(b,0,b.length);//(byte 배열이름, 배열 번호 _ 0부터 시작한다 , 배열크기)
			//os.flush();//출력파트
			
		}catch(Exception z) {
			
		}
			
	}
}

	

