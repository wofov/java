import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutputStream(output) - �ֻ���
//FileOutputStream(����), ObjectOutputStream
public class file10 {
//�̰� �ʹ� ���� ���� �𸣰ٴ�. 
	public static void main(String[] args) {
//		String a= "ȫ�浿"; ����
		String a="123456";
		byte[] b= a.getBytes(); //getBytes("�����Ŷ")�޼ҵ�
		//byte[] :���ڿ��� ASCII ������ �迭�� ������ �� ���
		System.out.println(Arrays.toString(b));
		OutputStream os = System.out;//��¸� ��� ==System.out.println();���� ��Ȱ
		
		
		try {
			os.write(b,0,b.length);//(byte �迭�̸�, �迭 ��ȣ _ 0���� �����Ѵ� , �迭ũ��)
			//os.flush();//�����Ʈ
			
		}catch(Exception z) {
			
		}
			
	}
}

	

