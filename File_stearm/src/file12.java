import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


//FileOutputStream
public class file12 {

	public static void main(String[] args)throws IOException {
		String test = "����";
		OutputStream os = new FileOutputStream("C:\\java5\\File_stearm\\src\\array.txt",true);
		byte[] data = test.getBytes();//test ���� _�� �ƽ�Ű �ڵ�� ��ȯ 
		os.write(data);
		os.flush();//Stream�� ����� ��� ���� �޸𸮿� �ְ� �˴ϴ�.
		//flush() �޸� ���� ��� ���� �۾��� �ϰ� �˴ϴ�. 

	}

}
