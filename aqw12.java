import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class aqw12 {
        //������� �ٷ� ���� 
     	public String nn(int a2) throws Exception{//�ڡڸ��� �ڷ����� String�̴��� �μ��� int �൵ �ȴ�.
		
		//int ck = (int)call[1];>�����϶� ���� ���� _������Ʈ
		//String ck = (String)call[1];>�����϶� ���� ���� _������Ʈ
		
		try {//�ش� �迭�� �ε�� (�ڷ���) ��ȯ�� �ϴ� ������ Object�迭 �̹Ƿ� �����Ͽ���. 
			String ck = String.valueOf((String)call[w]);
			//try���̶� call�̶�� �迭�� ���� ���� ������ �׳� �ٷ� ����ó��
		}
		FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\list.txt",Charset.forName("EUCKR"));
		//Charset.forName : java12 > EUCKR(ANSI), UTF8,UTF-16//���� ������ ������ �ϱ�
		//System.out.println(fr.getEncoding());//���ڴ� ���� Ȯ���� Ȯ��. FileReader
		while(true) {//loop�� Ȱ���Ͽ� �ش� ���Ͽ� ���ڸ� ��� �����ɴϴ�. 
			int m =fr.read();//ȫ�浿�� �ݰ� �� �޸����Ͼȿ� ����
			System.out.print((char)m);//�� �̶�� ��µ�. >ȫ�浿�� �ݰ� �� �̻� ������ -1
			if(m==-1) {//�� �̻� ������ ���ڰ� ���� ��� ���� Ż��
				break;
			}
		FileWriter fw = new FileWriter("C:\\java5\\File_stearm\\src\\array.txt",true);
		//true ������ �������Ͽ� �ִ� ���� �ڿ� �߰���
		 fw.write("test");
		 fw.write(user[f]);//write ����,�迭 ������ ���� ���Ͽ� ���� �մϴ�. 
		 fw.close();//�̰� ��¥ �߿��� �̰� ������ �ȵ�.
		
		 Scanner sc = new Scanner(new FileReader("C:\\java\\as.txt",Charset.forName("UTF8")));
		 //�׳� ������ �о���°�
		 
		 while(sc.hasNext()) {//hasNext �о�� ��Ұ� �����ִ��� ������ Ȯ�� ������ true �ƴϸ� false
				//�� while �ݺ��� ���ư��� false�� ���ѹݺ����� �ƴ϶� �ݺ��� �����.
				sc.nextLine();
			}
		 
		 FileWriter fw = new FileWriter("C:\\java5\\File_stearm\\src\\db.txt");
			Scanner sc = new Scanner(System.in);//����� ���� �Է�
			System.out.println("������ �Է����ּ���:");
			for(int a=0;a<3;a++) {//3�� �ݺ� 
				String notice = sc.nextLine()+"\n";
				fw.write(notice);//�ش� �Է»����� db.txt�� ���� ��Ŵ. 
		
		
			try {//���� ���� ����ҋ� �� try����ϱ�
				FileReader fr = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
//				System.out.println((char)fr.read());//�뷮ũ�� Ȯ���ϸ鼭 ��� Ȯ���ϴ� ��. 
				//�տ� char����ؼ� ��� �ܼ� Ȯ��__ ���� ������ �ϸ� ��� ���� Charset ����ϱ�.
				BufferedReader bf = new BufferedReader(fr);//fr�� bf close �� �ϱ� �߿���. 
				//readLine()���� �ش� ���� Ȯ�� �� �� �ִ�. 
			    //bufferReader:Temp(�ӽ������)-ȿ�������� ������ ���� ������ ������ �� �ִ�.
}}}
		System.out.println(bf.readLine());//readLine�� filereader���� ��� �ȵ� ���ۿ����� ����. 
		
		FileReader fr2 = new FileReader("C:\\java5\\File_stearm\\src\\buffer.txt",Charset.forName("UTF8"));
		LineNumberReader li = new LineNumberReader(fr2);
		int ea=0;
		while(li.readLine()!=null) {
			ea=li.getLineNumber();//�̰� ��Ż += �ϼ�������. �����ϱ� 
		}
		System.out.println(ea);//�� ���� �ľ�.
				
		//files�� �ش� ��� ������ �迭�� ���� ��Ű�� ���. �̹����� ������ ��������(����?)
		List<String> data=Files.readAllLines(Paths.get("C:\\java5\\File_stearm\\src\\buffer.txt"));
	     System.out.println(data);
	     System.out.println(data.get(0));
	     //List�� �ֻ��� �迭 Ŭ����
	     //Files �ű� IOŬ���� �Դϴ�. readAllLines ��ü ������ �ѹ��� ��� �д´�
	     //Files + Paths.get("���")
				
	   //InputStream :��� �Է� ��ġ�� ���� ���� �޴� Ŭ�����Դϴ�. �⺻(int)-ASCII
			//InputStream :�ֻ��� �Է���ġ 
			//-FileInputStream, AudioInputStream, ObjectInputSteram > ���� Ŭ���� 
	     
	     InputStream user = System.in;//>Ű���� �Է¹���. //�̰� �׳� �ѹ��� ���� ������ ������.
			try{
				int code = user.read();//Ű���� �Է� �ƽ�Ű ASCII (< �޸��忡 ��Ʈ ������ key(��ȣ)������ ��) �ڴ� ���� ��ȯ
				System.out.println(code);
				if(code==13) {//�ƽ�Ű�ڵ�
					System.out.println("����Ű�� ����Ҽ� ����");
				}}}
     	
     	byte[] b= a.getBytes(); //getBytes("�����Ŷ")�޼ҵ�
		//byte[] :���ڿ��� ASCII ������ �迭�� ������ �� ���
     	os.write(b,0,b.length);//(byte �迭�̸�, �迭 ��ȣ _ 0���� �����Ѵ� , �迭ũ��)
		os.flush();//�����Ʈ
		
		//���� ������
		FileInputStream fs = new FileInputStream("C:\\java5\\File_stearm\\src\\list.txt");
		byte[] temp = new byte[fs.available()];//���� ������ �뷮 �迭 ����(���� ũ�⿡  ���� �������ְ� ����. 
		int ea = fs.read(temp);
		String data = new String(temp,"UTF-8");//�̰� ���� ���� �ٸ���
		//String data = new String(temp,0,ea);
		System.out.println(data);
		
		try {//createDirectories : �ű� ���丮 ���� 
			//�ű� ���丮 ���� 
			//Files.createDirectories(Paths.get("C:\\java5\\File_stearm\\src\\test"));
			
			//���� ����
//			Path data1 = Paths.get("C:\\java5\\File_stearm\\src\\movie.txt");
//			Path data2 = Paths.get("C:\\java5\\File_stearm\\src\\movie2.txt");
//			Files.copy(data1, data2);
			
			//�ش� ������ �ٸ� ���丮�� �̵� 
//			Path data3 = Paths.get("C:\\java5\\File_stearm\\src\\movie.txt");
//			Path directory = Paths.get("C:\\java5\\movie.txt");
//			Files.move(data3, directory,StandardCopyOption.REPLACE_EXISTING);
			
			//�ش� ���� ����� 
//			Path data3 = Paths.get("C:\\java5\\Swing\\src\\swing1\\image.jpg");
//			Files.delete(data3);
			
			//�ش� ���� ���� 
			Path data4 = Paths.get("C:\\java5\\File_stearm\\src\\movie3.txt");
			Files.createFile(data4);
		}
		
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		InputStream is = new FileInputStream(file);
		byte filesize[] = new byte[is.available()];
		int total = is.read(filesize);
		
		//file 14�̻� ���� ������ �ϰ� ���� 
		/*PORT(TCP)
		 80:WEB(http://)
		 21:FTP(�������۽� ���)
		 22:SSH-Linux,Unix(��������,�����ܺ�����)
		 23:TELET-Window(�����ܺ�����)
		 443:WEB(https://)
		 25:SMTP(���ϼ���)-���� ������ 
		 110:POP3(���Ϲޱ�)-����,���� �ޱ� (�񵿱�ȭ)
		 143:IMAP(���Ϲޱ�)-����,���� �ޱ� (������ ����ȭ)
		 */
		
		
		
		
			
				
				
				
				
				
	}
}
