import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//files�� �ش� ��� ������ �迭�� ���� ��Ű�� ���. 

public class file8 {

	public static void main(String[] args)throws IOException {
	     List<String> data=Files.readAllLines(Paths.get("C:\\java5\\File_stearm\\src\\buffer.txt"));
	     System.out.println(data);

	     System.out.println(data.get(0));
	    
	     //List�� �ֻ��� �迭 Ŭ����
	     //Files �ű� IOŬ���� �Դϴ�. readAllLines ��ü ������ �ѹ��� ��� �д´�
	     //Files + Paths.get("���")
	     
	     //���� �޸� �Ҵ��� ������ �ѱ� ��� ��Ŷ�� ���� �� �ؾ���
	     byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_stearm\\src\\buffer.txt"));
	     System.out.println(new String(data2));
	}

}
