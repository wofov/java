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
//�޸� ���� ����ϴ� ��
	public static void main(String[] args)throws IOException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 > �������� // 2 > ��������");
			int user =sc.nextInt();
			if(user==1) {
				movie m = new movie("movie.txt");
			}
			else if(user==2) {
				System.out.println("���� �̿Ϸ�");
			}
			sc.close();
		}catch(Exception k ) {
			if(k.getMessage()!=null) {
				System.out.println("���� ���� ����");
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
		//System.out.println(this.bf.readLine()); Ŀ���� �޼ҵ� ���� throws IOE �� Ȯ���ϱ�. 
		String datas=this.bf.readLine();//�ڡ�
		this.list=new ArrayList<>();
		do {
			this.list.add(datas);//do while���� �� ���� ���� ����ڡ�
		}while((datas=this.bf.readLine())!=null) ;{//do while���� �������ϲ� ���� do while�������� 
	    }
	}
	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ������?");
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
//			}>�̰͵� �ε��� ����� ���� ���. 
		}
		if(ok==false) {
			System.out.println("������� �ٽ� ����");
			this.search();//>�̰� ����Լ� 
		}
	}
}