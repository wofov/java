import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class File_S {

	public static void main(String[] args) {
		files_server fs = new files_server();
		fs.data();
	}

}
class files_server{
	ServerSocket server = null;
	Socket sk = null;
	int port = 8005;
	InputStream is = null;
	OutputStream os= null;
	
	public void data() {
		try {
			this.server = new ServerSocket(this.port);
			this.sk = this.server.accept();
			System.out.println("*서버_가동*");
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			byte data[] = new byte[1024*16];
			int n = this.is.read(data);
			String f = new String(data,0,n);
			
			String url = "C:\\java6\\Net\\src\\copy.jpg";
			/*
			 * 
			 파일로 클라이언트가 전송을 하므로 서버에서 byte로 값을 받게 됩니다.
			 getInputStream () > FileOutputStream
			 */
			FileOutputStream fs = new FileOutputStream(url);
		//	System.out.println(f);
			fs.write(data,0,n);//해당 url 자료형으로 저장 되도록 함
			fs.flush();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}