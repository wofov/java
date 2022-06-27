import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//이미지 파일 읽고, 쓰기, 용량 제한 
public class file15 {

	public static void main(String[] args)throws IOException {
		String file = "C:\\java5\\File_stearm\\src\\cat.jpg";
     	//FileInputStream을 buffer로 사용하게 되면 , 더 이상 FileInputStream을 사용하지 못함
		//그래서 아래와 같은 방식을 사용함.
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		InputStream is = new FileInputStream(file);
		byte filesize[] = new byte[is.available()];
		int total = is.read(filesize);
		//System.out.println(is.read(is.read(filesize)));
		if(total>92160) {
			System.out.println("이미지 제한 용량은 90kb까지 입니다. ");
		}
		else {
			System.out.println("정상적으로 등록 되었습니다. ");
		}

	}

}
