import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//file7 에 대한 추가 설명 butterReader+array __output > input > output
public class buffer {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> ar = new ArrayList<>();
		String word="";
		while((word=br.readLine())!=null) {
			ar.add(word);
		}
		br.close();
		System.out.println(ar);
		System.out.println(ar.size());

	}

}
