import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;



//�̹��� �б�, ����
public class file16 {

	public static void main(String[] args) throws IOException{
		//r,w,x > r:�б�(read) w:����(write) x:����(excute)
		//RandomAccessFile : ����ڰ� �ش� ���� �Ӽ� ������ ������ �� ����. 
		try {
		String files ="C:\\java5\\File_stearm\\src\\cat.jpg";
		String cp ="cat2.jpg";
		RandomAccessFile File = new RandomAccessFile(files, "r");
		RandomAccessFile File2 = new RandomAccessFile(cp, "rw");
		
		//FileChannel : IO(FileInputStream,FileOutPutStream)���� ���� 
		//getChannel() : RandomAccessFile �ش� �޼ҵ带 �������� ��Ȱ
		FileChannel fc = File.getChannel();
		FileChannel target = File2.getChannel();
		//transferTo,transferFrom ���� ���� 
		fc.transferTo(0, fc.size(), target);//��𼭺��� ,������� , �ű⿡ 
		//�迭 0��, �迭 ����ȣ, ���� ��ġ 
		target.transferFrom(fc, 0, fc.size());
		//������ ���� �� , �迭 0��, �迭 ����ȣ 
		
		System.out.println(fc);
		}catch(Exception e) {
			
		}

	}

}
