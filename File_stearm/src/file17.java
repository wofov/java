import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//BufferedWriter
//Buffered : read , writer 단독으로 사용하지 않음. 
public class file17 {

	public static void main(String[] args)throws IOException{
		try {
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os);
		bw.write("홍길동입니다");
		bw.close();
		
//		InputStreamReader is = new InputStreamReader(System.in);//위에 output 이니까 여기는 input
//		BufferedReader br = new BufferedReader(is); // >> 이게 정식 코드 아래가 줄인거. 
		//이렇게 버퍼 전에 무언가를 작생해 주어야함. 버퍼는 속도를 위해 작성. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//버퍼만 쓰지말고 저렇게 input와 같이 쓰거나 다른걸 먼저 작성해야 한다. 버퍼에 파일 올리지 말기. 
		String test = br.readLine();
		System.out.println(bw);
		}catch(Exception e) {
			
		}
	}
	/*
	 IO입력
	 = FileReader (파일을 1글자씩 읽는다
	 - Files(이거도 1글자씩
	 - Scanner
	 - InputStream(최상위) - FileinpuStream
	 -보조 : BufferedReader(하지만 이거는 라인으로 읽는다. 
	 
	 IO출력
	 - FileWriter (문자 하나씩 저장. 
	 - Scanner.nextLine()
	 -OutputStream(최상위) - FileoutputStream 
	 - 보조 : BufferedWrite
	 
	 그 외에 출력방식 - 배열로 저장 후 출력하는 형태 
	 ArrayList
	 List
	 ArrayList(String> as = Filses.readAllLines(Paths.get('경로'));
	 
	 중요 사항 - Stream사용시
	 1.한번 사용시 종료됨.
	 2.Stream은 byte[] 배열로 처리가에 됩니다.
	 =파일 전체 크기 다사용
	 =파일 전체 크기를 쪼개서 사용 
	 
	 문자Strina a = new String(배열이름,"ex)UTF-8 언어패킷")
	 */

	
	
	
	
	
}
