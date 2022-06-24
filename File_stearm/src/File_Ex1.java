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
		System.out.println("�� ��ü�� �ݾ��� "+result[0]+"�̸�, �� �ܰ� �ݾ��� "+result[1]+"�Դϴ�.");

	}

}
class payroll extends File_Ex_abs {
	String filename =null;
	int total=0;
	int all_mo;
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int c = 0;//�ݺ��� ���.
		int mm;//�繫�� ����ڰ� �Է��ϴ� �޿�
		this.all_mo=this.money;
		while(c<this.ea_name.size()) {
			System.out.println("��ü�� �����մϴ�."+this.ea_name.get(c)+"�� ���� ��ü�Ͻ� �ݾ��� �Է��ϼ��� ");
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
		this.ea_name = new ArrayList<>();//�� �迭
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
		//System.out.println(this.fr.read());//���� ũ�� Ȯ���ϴ°� ����?
		//System.out.println(this.fr.getEncoding());//UTF8 ��µ� �ǹ��� Ȯ���ϸ� ������. 
		
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