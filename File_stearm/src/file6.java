import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Scanner �� �̿��� ���� ���� ����
public class file6 {

	public static void main(String[] args)throws IOException {
		try {
		FileWriter fw = new FileWriter("C:\\java5\\File_stearm\\src\\db.txt");
		Scanner sc = new Scanner(System.in);//����� ���� �Է�
		System.out.println("������ �Է����ּ���:");
		for(int a=0;a<3;a++) {//3�� �ݺ� 
			String notice = sc.nextLine()+"\n";
			fw.write(notice);//�ش� �Է»����� db.txt�� ���� ��Ŵ. 
			
		}
		sc.close();
		fw.close();
		}catch(Exception z) {
			System.out.println(z);
		}
	}

}
