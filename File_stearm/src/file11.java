import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;

//Stream �̿��� ���Ϸε�
public class file11 {

	public static void main(String[] args)throws IOException {
		try {
		InputStream fs = new FileInputStream("C:\\java5\\File_stearm\\src\\list.txt");
//		FileInputStream fs = new FileInputStream("C:\\java5\\File_stearm\\src\\list.txt");
		//���� = new ���� /// ���� = new ����// �Ѵ� �����ϴ�. 
		System.out.println(fs.available());//available ���� ��ü ũ��
		byte[] temp = new byte[fs.available()];//���� ������ �뷮 �迭 ����(���� ũ�⿡  ���� �������ְ� ����. 
		int ea = fs.read(temp);
		String data = new String(temp,"UTF-8"); 
		System.out.println(data);//>�̰� �� ��õ�� ������ �� ���ذ���. 
		
		/*//���� �д°�
		byte[] temp = new byte[1024*16];//���� > ����Ʈ ũ�� 1024*16
		int ea = fs.read(temp);//ASCII�ڵ�� ��ü�� �о ea�� �޵��� ��. 
//		String data = new String(temp,0,ea);
		String data = new String(temp,"UTF-8");//list ������ utf-8�϶� ���� ������ ���� ������Ѵ�. 
		System.out.println(data);
		*/
		}catch(Exception e) {
			
		}
	

	}

}
