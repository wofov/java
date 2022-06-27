import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;



//이미지 읽기, 쓰기
public class file16 {

	public static void main(String[] args) throws IOException{
		//r,w,x > r:읽기(read) w:쓰기(write) x:실행(excute)
		//RandomAccessFile : 사용자가 해당 파일 속성 권한을 설정할 수 있음. 
		try {
		String files ="C:\\java5\\File_stearm\\src\\cat.jpg";
		String cp ="cat2.jpg";
		RandomAccessFile File = new RandomAccessFile(files, "r");
		RandomAccessFile File2 = new RandomAccessFile(cp, "rw");
		
		//FileChannel : IO(FileInputStream,FileOutPutStream)같은 형태 
		//getChannel() : RandomAccessFile 해당 메소드를 가져오는 역활
		FileChannel fc = File.getChannel();
		FileChannel target = File2.getChannel();
		//transferTo,transferFrom 복사 형태 
		fc.transferTo(0, fc.size(), target);//어디서부터 ,여기까지 , 거기에 
		//배열 0번, 배열 끝번호, 복사 위치 
		target.transferFrom(fc, 0, fc.size());
		//복사할 파일 명 , 배열 0번, 배열 끝번호 
		
		System.out.println(fc);
		}catch(Exception e) {
			
		}

	}

}
