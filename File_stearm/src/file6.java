import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Scanner 를 이용한 파일 쓰기 사용법
public class file6 {

	public static void main(String[] args)throws IOException {
		try {
		FileWriter fw = new FileWriter("C:\\java5\\File_stearm\\src\\db.txt");
		Scanner sc = new Scanner(System.in);//사용자 직업 입력
		System.out.println("내용을 입력해주세요:");
		for(int a=0;a<3;a++) {//3번 반복 
			String notice = sc.nextLine()+"\n";
			fw.write(notice);//해당 입력사항을 db.txt에 저장 시킴. 
			
		}
		sc.close();
		fw.close();
		}catch(Exception z) {
			System.out.println(z);
		}
	}

}
