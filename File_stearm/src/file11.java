import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;

//Stream 이용한 파일로드
public class file11 {

	public static void main(String[] args)throws IOException {
		try {
		InputStream fs = new FileInputStream("C:\\java5\\File_stearm\\src\\list.txt");
//		FileInputStream fs = new FileInputStream("C:\\java5\\File_stearm\\src\\list.txt");
		//하위 = new 하위 /// 상위 = new 하위// 둘다 가능하다. 
		System.out.println(fs.available());//available 파일 전체 크기
		byte[] temp = new byte[fs.available()];//거의 무제한 용량 배열 파일(파일 크기에  따라 유동성있게 변함. 
		int ea = fs.read(temp);
		String data = new String(temp,"UTF-8"); 
		System.out.println(data);//>이걸 더 추천함 이제야 좀 이해간다. 
		
		/*//파일 읽는거
		byte[] temp = new byte[1024*16];//숫자 > 바이트 크기 1024*16
		int ea = fs.read(temp);//ASCII코드로 전체를 읽어서 ea가 받도록 함. 
//		String data = new String(temp,0,ea);
		String data = new String(temp,"UTF-8");//list 파일이 utf-8일때 파일 형식을 같에 해줘야한다. 
		System.out.println(data);
		*/
		}catch(Exception e) {
			
		}
	

	}

}
