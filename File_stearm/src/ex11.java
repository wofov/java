import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex11 {
//메모리 적게 운용하는 법
	public static void main(String[] args)throws IOException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 > 개봉예정 // 2 > 개봉예정");
			int user =sc.nextInt();
			if(user==1) {
				movie m = new movie("movie.txt");
			}
			else if(user==2) {
				System.out.println("아직 미완료");
			}
			sc.close();
		}catch(Exception k ) {
			if(k.getMessage()!=null) {
				System.out.println("현재 접속 오류");
			}
		}
	}
}
class movie{
	private String path = "C:\\java5\\File_stearm\\src\\";
	private BufferedReader bf = null;
	private FileReader fr = null;
	private ArrayList<String> list = null;
	private Scanner sc=null;
	public movie(String filename)throws IOException {
		try {
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.coustom();
			this.fr.close();
			this.bf.close();
			this.search();
		}catch(Exception a) {
			System.out.println(a);
		}
	}
	public void coustom() throws IOException {
		this.bf=new BufferedReader(this.fr);
		//System.out.println(this.bf.readLine()); 커스텀 메소드 옆에 throws IOE 꼭 확인하기. 
		String datas=this.bf.readLine();//★★
		this.list=new ArrayList<>();
		do {
			this.list.add(datas);//do while문은 이 내용 먼저 실행★★
		}while((datas=this.bf.readLine())!=null) ;{//do while문이 더빠르니께 슬슬 do while생각하자 
	    }
	}
	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("검색할 영화제목은?");
		String subject = this.sc.next().intern();
		boolean ok =false;
		for(String sb : this.list) {
			if(sb.indexOf(subject)!=-1) {
				System.out.println(sb);
				ok=true;
				sc.close();
				System.exit(0);
			}
//			if(sb.contains(subject)) {
//				System.out.println(sb);
//			}>이것도 인덱스 오브랑 같은 기능. 
		}
		if(ok==false) {
			System.out.println("내용없음 다시 ㄱㄱ");
			this.search();//>이건 재귀함수 
		}
	}
}