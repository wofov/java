import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//BufferedWriter
//Buffered : read , writer �ܵ����� ������� ����. 
public class file17 {

	public static void main(String[] args)throws IOException{
		try {
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os);
		bw.write("ȫ�浿�Դϴ�");
		bw.close();
		
//		InputStreamReader is = new InputStreamReader(System.in);//���� output �̴ϱ� ����� input
//		BufferedReader br = new BufferedReader(is); // >> �̰� ���� �ڵ� �Ʒ��� ���ΰ�. 
		//�̷��� ���� ���� ���𰡸� �ۻ��� �־����. ���۴� �ӵ��� ���� �ۼ�. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//���۸� �������� ������ input�� ���� ���ų� �ٸ��� ���� �ۼ��ؾ� �Ѵ�. ���ۿ� ���� �ø��� ����. 
		String test = br.readLine();
		System.out.println(bw);
		}catch(Exception e) {
			
		}
	}
	/*
	 IO�Է�
	 = FileReader (������ 1���ھ� �д´�
	 - Files(�̰ŵ� 1���ھ�
	 - Scanner
	 - InputStream(�ֻ���) - FileinpuStream
	 -���� : BufferedReader(������ �̰Ŵ� �������� �д´�. 
	 
	 IO���
	 - FileWriter (���� �ϳ��� ����. 
	 - Scanner.nextLine()
	 -OutputStream(�ֻ���) - FileoutputStream 
	 - ���� : BufferedWrite
	 
	 �� �ܿ� ��¹�� - �迭�� ���� �� ����ϴ� ���� 
	 ArrayList
	 List
	 ArrayList(String> as = Filses.readAllLines(Paths.get('���'));
	 
	 �߿� ���� - Stream����
	 1.�ѹ� ���� �����.
	 2.Stream�� byte[] �迭�� ó������ �˴ϴ�.
	 =���� ��ü ũ�� �ٻ��
	 =���� ��ü ũ�⸦ �ɰ��� ��� 
	 
	 ����Strina a = new String(�迭�̸�,"ex)UTF-8 �����Ŷ")
	 */

	
	
	
	
	
}
