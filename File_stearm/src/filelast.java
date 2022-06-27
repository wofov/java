import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
/*
 BufferedReader - close()메모리 종료 꼭 할 것, 
 BufferedWriter - close()
 flush() 메모리를 초기화 후 close()
 */
public class filelast {
	//InputStream > inputStreamreader > BufferedReader 맞음
	//InputStream > BufferedReader 틀림
	//InputStream > BufferedInputStream 맞음
	//inputStreamreader > BufferedReader 맞음

	public static void main(String[] args) throws IOException{
		try {
		String url="src\\movie2.txt";
		
		FileInputStream fs = new FileInputStream(url);
//		byte a[] = new byte[10000];
		BufferedInputStream bs = new BufferedInputStream(fs);
//		System.out.println(bs.read());
		
		InputStreamReader ir = new InputStreamReader(fs,"UTF8");
		BufferedReader br=new BufferedReader(ir);
		System.out.println(br.readLine());
		fs.close();
		
		}catch(Exception e) {
			
		}

	}

}
