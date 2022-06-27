import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

public class File_EX2 {

	public static void main(String[] args)throws IOException {
		/*
		 사용자가 6개의 숫자를 입력하는 로또 프래그램 입니다. 
		 프로세서 시작시 "숫자를 입력해 주세요" 
		 총 6번의 숫자를 입력받게 된다. 그리고 lotto.txt. 결과를
		 가진 파일을 로드하여 사용자가 입력한 값과
		 결과를 비교하여 몇개를 맞췃는지를 검토하는 프로그램 코드를 작성하세요.
		 */

		lo l = new lo();
		l.lo1();
	}

}
class lo{
	ArrayList<String> list=null;
	FileReader fr = null;
	public void lo1() throws IOException {
		this.list = new ArrayList<>();
		try {//파일 로드하면 try catch문 작성해야하는데 알아보기. 
		this.fr=new FileReader("C:\\java5\\File_stearm\\src\\lotto.txt");
		
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
		BufferedReader br = new BufferedReader(this.fr);
		int w=0;
		while(true){
			this.list.add(br.readLine());
			if(this.list.get(w)==null) {
				this.list.remove(w);
				break;
			}
			w++;
		}
		System.out.println("정답 유출본"+this.list);
		lo2();
	}
	public void lo2() {
		Scanner sc = new Scanner(System.in);
		int user, ct=0;
		int ww=0;
		String re="";
		while(ww<this.list.size()) {
			System.out.println("숫자를 입력하세요");
			user = sc.nextInt();
			re = Integer.toString(user);
			int ww2=0;
			while(ww2<this.list.size()) {
				if(re.equals(this.list.get(ww))) {
					ct++;
					break;
				}
				ww2++;
			}
			ww++;
		}
		System.out.println("총 "+ct+"개 정답");
		
		
	}
}