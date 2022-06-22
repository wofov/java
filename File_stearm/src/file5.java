import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner 를 이용한 파일 로드 사용법
public class file5 {

	public static void main(String[] args) throws IOException{
		//system.in : input (IO)
		//system.out : output (IO)
		try {
//			FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\db.txt");
//			Scanner sc = new Scanner(fr);
			//system.in 사용자가 직업 입력, fileReader 파일을 로드
			Scanner sc = new Scanner(new FileReader("C:\\java5\\File_stearm\\src\\db.txt",Charset.forName("UTF8")));
			
//			for(;;) {//loop시 예외처리로 빠질 수 잇음. 
//				String result = sc.nextLine();//파일 로드된 입력값을 result에 전달
//				//파일 불러올때 nextLine이 기본적으로 형성 되어있음. 
//				if(result!=null) {
//					System.out.println(result);
//				}
//				else {
//					sc.close();
//					break;
//				}	
//			}
				
			int count = 0;
			while(sc.hasNext()) {//hasNext 읽어올 요소가 남아있는지 없는지 확인 있으면 true 아니면 false
				//즉 while 반복문 돌아간다 false면 무한반복문이 아니라서 반복문 종료됨.
				
				sc.nextLine();
				count ++;
				
			}
			System.out.println(count);
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
