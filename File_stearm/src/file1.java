import java.io.FileReader;
import java.io.IOException;

public class file1 {
/*
 I/O inputStream, outputStream
 입력스트림:프로그램으로 들어오는 스트림 (inputStream : 키보드 마우스 하드디스크)
 출력스트림:프로그램에서 밖으로 나가는 부분 (outputStream : 모니터, HDD,프린터)
 Stream:input,output사용자 처리
 JAVA.io (API)
 file,fileREader 일반 > StreamAPI ( FileinputStream)
 fileWriter>StreamAPI(fileoutpuStStream)
 */
	public static void main(String[] args)throws IOException,Exception {
		//IO가 있으면 아래 test()메소드에 인셉셥만 있어도 사용가능 두개다도 사용가능 
		/*
		 FileReader:
		 -문자 데이터를 파일로부터 읽는 클래스 
		 -파일 이름을 생성자 인수값(파라미터)으로 사용해서 FileReader 객체를 생성합니다. 
		 */
		try {
			FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\list.txt");
			String a= "a1";
			test(a);
			 
			}catch(IOException z) {//IO인셉션에 대한 예외 처리
				System.out.println(z.getMessage());
			}catch(Exception z1){//일반 인셉션에 대한 예외 처리 
				System.out.println(z1.getMessage());
			}

	}
	static public void test(String data) throws IOException,Exception{//IO 대장 느낌 포괄식 아래로 가능. 
		int k = Integer.parseInt(data);
		IOException ex = new IOException();
		throw ex;
	}

}
