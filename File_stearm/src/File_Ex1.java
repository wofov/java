import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Ex1 {

	public static void main(String[] args) {
		payroll py = new payroll();
		py.start();
		int result[] = py.check();
		System.out.println("총 이체한 금액은 "+result[0]+"이며, 총 잔고 금액은 "+result[1]+"입니다.");

	}

}
class payroll extends File_Ex_abs {
	String filename =null;
	int total=0;
	int all_mo;
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int c = 0;//반복문 사용.
		int mm;//재무과 사용자가 입력하는 급여
		this.all_mo=this.money;
		while(c<this.ea_name.size()) {
			System.out.println("이체를 시작합니다."+this.ea_name.get(c)+"님 에게 이체하실 금액을 입력하세요 ");
			mm=sc.nextInt();
			this.total+=mm;
			this.all_mo-=mm;
			c++;
		}
		sc.close();
	}
	@Override
	public void start() {
		try {
			this.filename="C:\\java5\\File_stearm\\src\\emp.txt";
			this.db();
			this.input_sc();
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
	@Override
	void db() throws IOException {
		this.ea_name = new ArrayList<>();//빈 배열
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
		//System.out.println(this.fr.read());//파일 크기 확인하는거 알지?
		//System.out.println(this.fr.getEncoding());//UTF8 출력됨 실무때 확인하면 좋을듯. 
		
		BufferedReader br = new BufferedReader(fr);
		//System.out.println(br.readLine());
		String data = br.readLine();
		String da[]=data.split(",");
		int w=0;
		while(w<da.length) {
			this.ea_name.add(da[w]);
			w++;
		}
		br.close();
		fr.close();
	}
	@Override
	public int[] check() {
		
		return new int[] {this.total,this.all_mo};
	}
	
}