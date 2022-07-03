import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class aqw12 {
        //여기부터 바로 보기 
     	public String nn(int a2) throws Exception{//★★리턴 자료형이 String이더라도 인수값 int 줘도 된다.
		
		//int ck = (int)call[1];>문자일때 오류 나옴 _오브젝트
		//String ck = (String)call[1];>숫자일때 오류 나옴 _오브젝트
		
		try {//해당 배열을 로드시 (자료형) 변환을 하는 이유는 Object배열 이므로 선언하였음. 
			String ck = String.valueOf((String)call[w]);
			//try문이라 call이라는 배열이 숫자 값이 나오면 그냥 바로 예외처리
		}
		FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\list.txt",Charset.forName("EUCKR"));
		//Charset.forName : java12 > EUCKR(ANSI), UTF8,UTF-16//파일 깨질때 여러번 하기
		//System.out.println(fr.getEncoding());//인코더 형식 확인을 확인. FileReader
		while(true) {//loop를 활용하여 해당 파일에 문자를 모두 가져옵니다. 
			int m =fr.read();//홍길동님 반갑 이 메모파일안에 있음
			System.out.print((char)m);//길 이라고 출력됨. >홍길동님 반갑 더 이상 없을때 -1
			if(m==-1) {//더 이상 가져올 문자가 없을 경우 루프 탈출
				break;
			}
		FileWriter fw = new FileWriter("C:\\java5\\File_stearm\\src\\array.txt",true);
		//true 있으면 기존파일에 있던 내용 뒤에 추가됨
		 fw.write("test");
		 fw.write(user[f]);//write 문자,배열 데이터 값을 파일에 적용 합니다. 
		 fw.close();//이거 진짜 중요함 이거 없으면 안들어감.
		
		 Scanner sc = new Scanner(new FileReader("C:\\java\\as.txt",Charset.forName("UTF8")));
		 //그냥 파일을 읽어오는것
		 
		 while(sc.hasNext()) {//hasNext 읽어올 요소가 남아있는지 없는지 확인 있으면 true 아니면 false
				//즉 while 반복문 돌아간다 false면 무한반복문이 아니라서 반복문 종료됨.
				sc.nextLine();
			}
		 
		 FileWriter fw = new FileWriter("C:\\java5\\File_stearm\\src\\db.txt");
			Scanner sc = new Scanner(System.in);//사용자 직업 입력
			System.out.println("내용을 입력해주세요:");
			for(int a=0;a<3;a++) {//3번 반복 
				String notice = sc.nextLine()+"\n";
				fw.write(notice);//해당 입력사항을 db.txt에 저장 시킴. 
		
		
			try {//파일 관련 사용할떄 꼮 try사용하기
				FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
//				System.out.println((char)fr.read());//용량크기 확인하면서 경로 확인하는 법. 
				//앞에 char사용해서 출력 콘솔 확인__ 만약 깨진다 하면 경로 옆에 Charset 사용하기.
				BufferedReader bf = new BufferedReader(fr);//fr랑 bf close 꼭 하기 중요함. 
				//readLine()으로 해당 값을 확인 할 수 있다. 
			    //bufferReader:Temp(임시저장소)-효율적으로 파일을 보다 빠르게 가져올 수 있다.
}}}
		System.out.println(bf.readLine());//readLine은 filereader에서 사용 안됨 버퍼에서는 가능. 
		
		FileReader fr2 = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
		LineNumberReader li = new LineNumberReader(fr2);
		int ea=0;
		while(li.readLine()!=null) {
			ea=li.getLineNumber();//이거 토탈 += 일수도있음. 생각하기 
		}
		System.out.println(ea);//줄 갯수 파악.
				
		//files로 해당 모든 내용을 배열로 전송 시키는 방법. 이미지나 동영상도 가능할할(저장?)
		List<String> data=Files.readAllLines(Paths.get("C:\\java5\\File_stearm\\src\\buffer.txt"));
	     System.out.println(data);
	     System.out.println(data.get(0));
	     //List는 최상위 배열 클래스
	     //Files 신규 IO클래스 입니다. readAllLines 전체 내용을 한번에 모두 읽는다
	     //Files + Paths.get("경로")
				
	   //InputStream :모든 입력 장치에 대한 값을 받는 클래스입니다. 기본(int)-ASCII
			//InputStream :최상위 입력장치 
			//-FileInputStream, AudioInputStream, ObjectInputSteram > 하위 클래스 
	     
	     InputStream user = System.in;//>키보드 입력받음. //이건 그냥 한번씩 봐도 나쁘지 않을듯.
			try{
				int code = user.read();//키보드 입력 아스키 ASCII (< 메모장에 알트 누르고 key(번호)누르는 거) 코다 값을 변환
				System.out.println(code);
				if(code==13) {//아스키코드
					System.out.println("엔터키는 사용할수 없다");
				}}}
     	
     	byte[] b= a.getBytes(); //getBytes("언어패킷")메소드
		//byte[] :문자열을 ASCII 형태의 배열로 변경할 때 사용
     	os.write(b,0,b.length);//(byte 배열이름, 배열 번호 _ 0부터 시작한다 , 배열크기)
		os.flush();//출력파트
		
		//파일 읽을때
		FileInputStream fs = new FileInputStream("C:\\java5\\File_stearm\\src\\list.txt");
		byte[] temp = new byte[fs.available()];//거의 무제한 용량 배열 파일(파일 크기에  따라 유동성있게 변함. 
		int ea = fs.read(temp);
		String data = new String(temp,"UTF-8");//이건 파일 형식 다를때
		//String data = new String(temp,0,ea);
		System.out.println(data);
		
		try {//createDirectories : 신규 디렉토리 생성 
			//신규 디렉토리 생성 
			//Files.createDirectories(Paths.get("C:\\java5\\File_stearm\\src\\test"));
			
			//파일 복사
//			Path data1 = Paths.get("C:\\java5\\File_stearm\\src\\movie.txt");
//			Path data2 = Paths.get("C:\\java5\\File_stearm\\src\\movie2.txt");
//			Files.copy(data1, data2);
			
			//해당 파일을 다른 디렉토리로 이동 
//			Path data3 = Paths.get("C:\\java5\\File_stearm\\src\\movie.txt");
//			Path directory = Paths.get("C:\\java5\\movie.txt");
//			Files.move(data3, directory,StandardCopyOption.REPLACE_EXISTING);
			
			//해당 파일 지우기 
//			Path data3 = Paths.get("C:\\java5\\Swing\\src\\swing1\\image.jpg");
//			Files.delete(data3);
			
			//해당 파일 생성 
			Path data4 = Paths.get("C:\\java5\\File_stearm\\src\\movie3.txt");
			Files.createFile(data4);
		}
		
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		InputStream is = new FileInputStream(file);
		byte filesize[] = new byte[is.available()];
		int total = is.read(filesize);
		
		//file 14이상 부터 공부좀 하고 보기 
		/*PORT(TCP)
		 80:WEB(http://)
		 21:FTP(파일전송시 사용)
		 22:SSH-Linux,Unix(파일전송,서버외부접속)
		 23:TELET-Window(서버외부접속)
		 443:WEB(https://)
		 25:SMTP(메일서버)-메일 보내기 
		 110:POP3(메일받기)-문자,파일 받기 (비동기화)
		 143:IMAP(메일받기)-문자,파일 받기 (서버와 동기화)
		 */
		
		
		
		
			
				
				
				
				
				
	}
}
