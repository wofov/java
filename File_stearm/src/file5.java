import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner �� �̿��� ���� �ε� ����
public class file5 {

	public static void main(String[] args) throws IOException{
		//system.in : input (IO)
		//system.out : output (IO)
		try {
//			FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\db.txt");
//			Scanner sc = new Scanner(fr);
			//system.in ����ڰ� ���� �Է�, fileReader ������ �ε�
			Scanner sc = new Scanner(new FileReader("C:\\java5\\File_stearm\\src\\db.txt",Charset.forName("UTF8")));
			
//			for(;;) {//loop�� ����ó���� ���� �� ����. 
//				String result = sc.nextLine();//���� �ε�� �Է°��� result�� ����
//				//���� �ҷ��ö� nextLine�� �⺻������ ���� �Ǿ�����. 
//				if(result!=null) {
//					System.out.println(result);
//				}
//				else {
//					sc.close();
//					break;
//				}	
//			}
				
			int count = 0;
			while(sc.hasNext()) {//hasNext �о�� ��Ұ� �����ִ��� ������ Ȯ�� ������ true �ƴϸ� false
				//�� while �ݺ��� ���ư��� false�� ���ѹݺ����� �ƴ϶� �ݺ��� �����.
				
				sc.nextLine();
				count ++;
				
			}
			System.out.println(count);
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
