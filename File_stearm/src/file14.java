import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.imageio.stream.FileImageInputStream;

//이미지(binary) (영상) 파일 생성 byte단위 (fileReader x)
//FileInputStream _ Stream을 꼭 이용해야함. read()만 사용 해야함. 
public class file14 {

	public static void main(String[] args)throws IOException {
		try {
		InputStream is = new FileInputStream("C:\\java5\\File_stearm\\src\\cat.jpg");
		//FileInputStream fs = new FileInputStream(""); 이것도 가능. 
		//System.out.println(is.read());//색 관련된 수치 __ Stream 이것도 버퍼 개념. 한번 읽으면 안됨. 
		//메모리에서 지워짐. read를 사용하는 순간 해당 메모리에서 비워지는 사항이 발생합니다. 
		//byte b[]=new byte[is.available()];//>이미지 로드된 크기 만큼 배열 만들기.
		//System.out.println(is.read(b));//전체 크기 용량 확인 
		
		byte b[]=new byte[1024];//1024 = 1KB
		//byte b[]=new byte[is.available()/100];
		//읽어들이는 배열의 크기를 강제로 조절함. 
		
		FileOutputStream fo = new FileOutputStream("img_test.jpg");//output은 복사 개념 
//		int img = is.read(b);
//		fo.write(b);
		
		int i = 0;//읽는 바이트 수
		int ck = 0;//읽는 횟수 
//		while((i=is.read(b))!=-1) {
//			//fo.write(b); 얘도 이미지 복사 가능한데 반복문을 사용하지 않음. 
//			ck+=i;
//			System.out.println(ck+"%");
//			fo.write(b,0,i);//다운로드 %를 표시할때 사용하기 위함. 
//		}
		//다운로드시 로드를 출력이나, progress를 이용하여 보여줄 때 .
		while(true) {
			i=is.read(b);//해당 파일을 읽어서 바이트 변수로 넘김 
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
