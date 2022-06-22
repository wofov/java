import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.Buffer;
import java.nio.charset.Charset;
/*
 공통 명령어 사항
 read()_파일 크기 확인,readline()_줄을 읽는다
 */
//BufferReader (output)
//UTF8 > 파일리더 사용한다.
public class file7 {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
//			System.out.println((char)fr.read());//용량크기 확인하면서 경로 확인하는 법. 
			//앞에 char사용해서 출력 콘솔 확인__ 만약 깨진다 하면 경로 옆에 Charset 사용하기.
			BufferedReader bf = new BufferedReader(fr);//fr랑 bf close 꼭 하기 중요함. 
			//readLine()으로 해당 값을 확인 할 수 있다. 
			//bufferReader:Temp(임시저장소)-효율적으로 파일을 보다 빠르게 가져올 수 있다. 
			
			/*
			 Buffer는 최초 값을 출력 하였을 경우 무조건 다음 라인의 값을 출력하게 됩니다.일회성. 
			 BufferedReader bf = new BufferedReader(fr);
			 BufferedReader bf2 = new BufferedReader(fr);
			 System.out.println(bf.readLine()); > bf에서 1줄 출력함.
			 System.out.println(bf2.readLine()); > null로 뜰꺼임 왜냐하면 이미 fr1번째 줄은 위에서 출력함. 
			 조건문에서도 조건을 한줄걸어도 출력된거라서 그 이후 안됨. //진짜 조건문 조심해라. 
			 따라서 초기화할수있는 재귀함수를 사용해야 한다.(다른 메소드를 계속해서 불르니)
			 */
			
//			System.out.println(bf.readLine());//readLine은 filereader에서 사용 안됨 버퍼에서는 가능. 
//			System.out.println(bf.readLine());//이렇게 2개 쓰면 자동으로 다음줄 나옴.
			//해당 임시 저장소에서 저장된 내용중 한 개당 라인으로 로드하게 됩니다. 
			
//			int w=0;
//			while(w<3) {
//				String data = bf.readLine();
//				System.out.println(data);
//				w++;
//			}
			
//			System.out.println(bf.readLine());
			/*
			 buffer는 속도가 빠른대신 사용 부분에 많은 무조건 변수 또는 배열로 
			 받은 후 사용 하는것을 권장 합니다. 
			 */
			String line="";//String으로 받아서 
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			//LineNumberReader:파일 전체 라인 갯수를 확인하는 클래스 입니다. 
			//데이터 문서의 라인갯수를 확인 하기.
			FileReader fr2 = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
			LineNumberReader li = new LineNumberReader(fr2);
			int ea=0;
			while(li.readLine()!=null) {
				ea=li.getLineNumber();
			}
			System.out.println(ea);
		}catch(Exception z) {
			System.out.println(z);
		}

	}

}
