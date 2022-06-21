import java.io.FileReader;
import java.io.IOException;

//IOException + exception
public class file3 {

	public static void main(String[] args) throws Exception{
	     filein f = new filein();	

	}

}
class filein  {
	FileReader fr = null;
	public filein() throws IOException,Exception{
		try {
			this.fr = new FileReader("C:\\java5\\File_stearm\\src\\data.dat");		
			this.word();
		}catch(IOException k) {
			if(k.getMessage()!=null) {
				System.out.println(k);
			}
		}
	}
	public void word() throws IOException,Exception{//filein에서 IOE니까 여기서도 IOE
		try {
			int w=0;
			while(true) {
				w=this.fr.read();
				if(w==-1) {
					break;
				}
				System.out.print((char)w);
			}
			this.fr.close();//file 종료
		}catch(Exception j) {
			if(j.getMessage()!=null) {
				System.exit(0);
				
			}
		}
	}
}