import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.Buffer;
import java.nio.charset.Charset;
/*
 ���� ��ɾ� ����
 read()_���� ũ�� Ȯ��,readline()_���� �д´�
 */
//BufferReader (output)
//UTF8 > ���ϸ��� ����Ѵ�.
public class file7 {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
//			System.out.println((char)fr.read());//�뷮ũ�� Ȯ���ϸ鼭 ��� Ȯ���ϴ� ��. 
			//�տ� char����ؼ� ��� �ܼ� Ȯ��__ ���� ������ �ϸ� ��� ���� Charset ����ϱ�.
			BufferedReader bf = new BufferedReader(fr);//fr�� bf close �� �ϱ� �߿���. 
			//readLine()���� �ش� ���� Ȯ�� �� �� �ִ�. 
			//bufferReader:Temp(�ӽ������)-ȿ�������� ������ ���� ������ ������ �� �ִ�. 
			
			/*
			 Buffer�� ���� ���� ��� �Ͽ��� ��� ������ ���� ������ ���� ����ϰ� �˴ϴ�.��ȸ��. 
			 BufferedReader bf = new BufferedReader(fr);
			 BufferedReader bf2 = new BufferedReader(fr);
			 System.out.println(bf.readLine()); > bf���� 1�� �����.
			 System.out.println(bf2.readLine()); > null�� �㲨�� �ֳ��ϸ� �̹� fr1��° ���� ������ �����. 
			 ���ǹ������� ������ ���ٰɾ ��µȰŶ� �� ���� �ȵ�. //��¥ ���ǹ� �����ض�. 
			 ���� �ʱ�ȭ�Ҽ��ִ� ����Լ��� ����ؾ� �Ѵ�.(�ٸ� �޼ҵ带 ����ؼ� �Ҹ���)
			 */
			
//			System.out.println(bf.readLine());//readLine�� filereader���� ��� �ȵ� ���ۿ����� ����. 
//			System.out.println(bf.readLine());//�̷��� 2�� ���� �ڵ����� ������ ����.
			//�ش� �ӽ� ����ҿ��� ����� ������ �� ���� �������� �ε��ϰ� �˴ϴ�. 
			
//			int w=0;
//			while(w<3) {
//				String data = bf.readLine();
//				System.out.println(data);
//				w++;
//			}
			
//			System.out.println(bf.readLine());
			/*
			 buffer�� �ӵ��� ������� ��� �κп� ���� ������ ���� �Ǵ� �迭�� 
			 ���� �� ��� �ϴ°��� ���� �մϴ�. 
			 */
			String line="";//String���� �޾Ƽ� 
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			//LineNumberReader:���� ��ü ���� ������ Ȯ���ϴ� Ŭ���� �Դϴ�. 
			//������ ������ ���ΰ����� Ȯ�� �ϱ�.
			FileReader fr2 = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
			LineNumberReader li = new LineNumberReader(fr2);
			int ea=0;
			while(li.readLine()!=null) {
				ea=li.getLineNumber();
			}
			System.out.println(ea);
		}catch(Exception z) {
			System.out.println(z);
		}

	}

}
