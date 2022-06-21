import java.io.FileWriter;
import java.io.IOException;

//���� ���� write
public class file4 {

	public static void main(String[] args)throws IOException {
		//IO>�б� read�϶� ������ write�� IO���ε�
		try {
			//fileWriter : 문자 데이터를 파일에 쓰는 class
			String user[]= {"a","b","c","d"};
			FileWriter fw = new FileWriter("C:\\java5\\File_stearm\\src\\array.txt");
//			FileWriter fw = new FileWriter("C:\\java5\\File_stearm\\src\\array.txt",true);
			//true 있으면 기존파일에 있던 내용 뒤에 추가됨
			//없으면 기존파일 지우고 내용 추가됨.
//		    fw.write("test");
			for(int f=0;f<user.length;f++) {
				System.out.println(user[f]);
				fw.write(user[f]);//write 문자,배열 데이터 값을 파일에 적용 합니다. 
			}
			fw.close();//이거 진짜 중요함 이거 없으면 안들어감. 
			//파일 오픈 사항을 종료하여 적용.
		}catch(Exception e) {
			System.out.println("t1");
		}

	}

}
