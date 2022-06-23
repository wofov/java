import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
public class file2 {

	public static void main(String[] args)throws IOException {
		try {
			
//			FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\list.txt"); 이건 8 버젼
			FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\list.txt",Charset.forName("EUCKR"));
			//Charset.forName : java12 > EUCKR(ANSI), UTF8,UTF-16//파일 깨질때 여러번 하기
			//System.out.println(fr.getEncoding());//인코더 형식 확인을 확인. FileReader
//			System.out.println(fr.read());//파일 용량크기
//			System.out.println(m);//만약 -1이 출력이 되면 내용이 없음(더 이상의 문자가 없음)
//			int w = 0;
					while(true) {//loop를 활용하여 해당 파일에 문자를 모두 가져옵니다. 
						int m =fr.read();//홍길동님 반갑 이 메모파일안에 있음
						System.out.print((char)m);//길 이라고 출력됨. >홍길동님 반갑 
						if(m==-1) {//더 이상 가져올 문자가 없을 경우 루프 탈출
							break;
						}
//						w++;
					}//  println >>  \n 홍 \n 길 \n동 이런식으로 출력
//			System.out.println((char)m);//길 이라고 출력됨. 
//			fr.close();
		}catch(IOException e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
			
		}

	}

}
