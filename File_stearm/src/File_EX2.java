import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

public class File_EX2 {

	public static void main(String[] args)throws IOException {
		/*
		 ����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� �����׷� �Դϴ�. 
		 ���μ��� ���۽� "���ڸ� �Է��� �ּ���" 
		 �� 6���� ���ڸ� �Է¹ް� �ȴ�. �׸��� lotto.txt. �����
		 ���� ������ �ε��Ͽ� ����ڰ� �Է��� ����
		 ����� ���Ͽ� ��� �­������� �����ϴ� ���α׷� �ڵ带 �ۼ��ϼ���.
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
		try {//���� �ε��ϸ� try catch�� �ۼ��ؾ��ϴµ� �˾ƺ���. 
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
		System.out.println("���� ���⺻"+this.list);
		lo2();
	}
	public void lo2() {
		Scanner sc = new Scanner(System.in);
		int user, ct=0;
		int ww=0;
		String re="";
		while(ww<this.list.size()) {
			System.out.println("���ڸ� �Է��ϼ���");
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
		System.out.println("�� "+ct+"�� ����");
		
		
	}
}