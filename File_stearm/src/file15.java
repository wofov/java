import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//�̹��� ���� �а�, ����, �뷮 ���� 
public class file15 {

	public static void main(String[] args)throws IOException {
		String file = "C:\\java5\\File_stearm\\src\\cat.jpg";
     	//FileInputStream�� buffer�� ����ϰ� �Ǹ� , �� �̻� FileInputStream�� ������� ����
		//�׷��� �Ʒ��� ���� ����� �����.
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		InputStream is = new FileInputStream(file);
		byte filesize[] = new byte[is.available()];
		int total = is.read(filesize);
		//System.out.println(is.read(is.read(filesize)));
		if(total>92160) {
			System.out.println("�̹��� ���� �뷮�� 90kb���� �Դϴ�. ");
		}
		else {
			System.out.println("���������� ��� �Ǿ����ϴ�. ");
		}

	}

}
