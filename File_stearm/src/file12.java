import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


//FileOutputStream
public class file12 {

	public static void main(String[] args)throws IOException {
		String test = "연습";
		OutputStream os = new FileOutputStream("C:\\java5\\File_stearm\\src\\array.txt",true);
		byte[] data = test.getBytes();//test 연습 _을 아스키 코드로 변환 
		os.write(data);
		os.flush();//Stream에 저장된 모든 값이 메모리에 있게 됩니다.
		//flush() 메모리 값을 모두 비우는 작업을 하게 됩니다. 

	}

}
