import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.imageio.stream.FileImageInputStream;

//�̹���(binary) (����) ���� ���� byte���� (fileReader x)
//FileInputStream _ Stream�� �� �̿��ؾ���. read()�� ��� �ؾ���. 
public class file14 {

	public static void main(String[] args)throws IOException {
		try {
		InputStream is = new FileInputStream("C:\\java5\\File_stearm\\src\\cat.jpg");
		//FileInputStream fs = new FileInputStream(""); �̰͵� ����. 
		//System.out.println(is.read());//�� ���õ� ��ġ __ Stream �̰͵� ���� ����. �ѹ� ������ �ȵ�. 
		//�޸𸮿��� ������. read�� ����ϴ� ���� �ش� �޸𸮿��� ������� ������ �߻��մϴ�. 
		//byte b[]=new byte[is.available()];//>�̹��� �ε�� ũ�� ��ŭ �迭 �����.
		//System.out.println(is.read(b));//��ü ũ�� �뷮 Ȯ�� 
		
		byte b[]=new byte[1024];//1024 = 1KB
		//byte b[]=new byte[is.available()/100];
		//�о���̴� �迭�� ũ�⸦ ������ ������. 
		
		FileOutputStream fo = new FileOutputStream("img_test.jpg");//output�� ���� ���� 
//		int img = is.read(b);
//		fo.write(b);
		
		int i = 0;//�д� ����Ʈ ��
		int ck = 0;//�д� Ƚ�� 
//		while((i=is.read(b))!=-1) {
//			//fo.write(b); �굵 �̹��� ���� �����ѵ� �ݺ����� ������� ����. 
//			ck+=i;
//			System.out.println(ck+"%");
//			fo.write(b,0,i);//�ٿ�ε� %�� ǥ���Ҷ� ����ϱ� ����. 
//		}
		//�ٿ�ε�� �ε带 ����̳�, progress�� �̿��Ͽ� ������ �� .
		while(true) {
			i=is.read(b);//�ش� ������ �о ����Ʈ ������ �ѱ� 
			if(i==-1) {
				break;
			}
			else {
				fo.write(b,0,i);				
			}
			ck++;
			System.out.println(ck+"%");
		}
		
		
		
		}catch(IOException i) {
			
		}
	}

}
