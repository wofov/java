
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
//Reader(�ֻ���)-(����) BufferReader,FileReader,CharArrayReader--reader ��� �ϴ°� �������� �̴�. 
//���� inputStreamReader - �̹��� , ������, ����� 
//inputStream �Է��ϴ�
public class file9 {

	public static void main(String[] args)/*throws IOException*/ {
		//Stream :�̹���,������,����� ���� ������ �ε��ϱ� ���ؼ�. (���̳ʸ�)
		//InputStream :��� �Է� ��ġ�� ���� ���� �޴� Ŭ�����Դϴ�. �⺻(int)-ASCII
		//InputStream :�ֻ��� �Է���ġ 
		//-FileInputStream, AudioInputStream, ObjectInputSteram > ���� Ŭ���� 
		InputStream is = new InputStream() {//�⺻ Ŭ������ �ε��Ͽ� �������̵� �޼ҵ� 
			@Override
			public int read() throws IOException {//byte 1~2
				int a= 15;
				return a;
			}
//			public String read2() throws IOException{
//				return null;
//			}>>InputStream �̰� �ϳ��� ���ϰ� �ϳ��� �ۿ� �߰� �ȵ�. �����Ұ� �ڡ�
		};
		//InputStreamReader (�����Ŷ ����)
		InputStreamReader ir = new InputStreamReader(is);
//		InputStreamReader ir = new InputStreamReader(is,Charset.forName("URF8")); >> input�̶� ����. 
		//is �� inputStream
		//InputStreamReader ir = new InputStreamReader("�����ּ�","�����Ŷ"_UTF8,EUCKR ���);
		try {
			System.out.println(is.read());
//			System.out.println(is.read2()); �ڡ�
		}catch(Exception z) {
			
		}
		//Ű���� �� �ε�
		InputStream user = System.in;//>Ű���� �Է¹���. 
		try{
			int code = user.read();//Ű���� �Է� �ƽ�Ű ASCII (< �޸��忡 ��Ʈ ������ key(��ȣ)������ ��) �ڴ� ���� ��ȯ
			System.out.println(code);
			if(code==13) {//�ƽ�Ű�ڵ�
				System.out.println("����Ű�� ����Ҽ� ����");
			}
		}catch(Exception z) {
			
		}

	}

}
