import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class File_C {

	public static void main(String[] args) {
		f_client fc = new f_client();
		fc.files();
		
		
	}

}
class f_client{
	Socket sk = null;
	String ip ="127.0.0.1";
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void files() {
		try {
			this.sk = new Socket(this.ip,this.port);
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			String url = "C:\\java6\\Net\\src\\c.jpg";
			//클라이언트에서 보낼 이미지,동영상,음악,문서 다 보낸 형식 
			FileInputStream fs = new FileInputStream(url);
			BufferedInputStream bs = new BufferedInputStream(fs);
			/*
			첨부 파일 전송 형태
			 */
			
			byte img[] = new byte[bs.available()];
			//System.out.println(bs.read(img));
			//this.os.write(url.getBytes());
			int fordata = 0;
			while((fordata=bs.read(img))!=-1){
				this.os.write(img,0,fordata);
			}
			
		}catch(Exception e) {
			
		}
		
		
	}
	
}