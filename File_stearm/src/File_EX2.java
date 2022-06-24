import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

public class File_EX2 {

	public static void main(String[] args)throws IOException {
		/*
		 »ç¿ëÀÚ°¡ 6°³ÀÇ ¼ıÀÚ¸¦ ÀÔ·ÂÇÏ´Â ·Î¶Ç ÇÁ·¡±×·¥ ÀÔ´Ï´Ù. 
		 ÇÁ·Î¼¼¼­ ½ÃÀÛ½Ã "¼ıÀÚ¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä" 
		 ÃÑ 6¹øÀÇ ¼ıÀÚ¸¦ ÀÔ·Â¹Ş°Ô µÈ´Ù. ±×¸®°í lotto.txt. °á°ú¸¦
		 °¡Áø ÆÄÀÏÀ» ·ÎµåÇÏ¿© »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ °ª°ú
		 °á°ú¸¦ ºñ±³ÇÏ¿© ¸î°³¸¦ ¸Â­Ÿ´ÂÁö¸¦ °ËÅäÇÏ´Â ÇÁ·Î±×·¥ ÄÚµå¸¦ ÀÛ¼ºÇÏ¼¼¿ä.
		 */

		lo l = new lo();
		l.lo1();
	}

}
class lo{
	ArrayList<String> list=null;
	FileReader fr = null;
	public void lo1() throws IOException {
		this.list = new ArrayList<>();
		try {//ÆÄÀÏ ·ÎµåÇÏ¸é try catch¹® ÀÛ¼ºÇØ¾ßÇÏ´Âµ¥ ¾Ë¾Æº¸±â. 
		this.fr=new FileReader("C:\\java5\\File_stearm\\src\\lotto.txt");
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
		BufferedReader br = new BufferedReader(this.fr);
		int w=0;
		while(true){
			this.list.add(br.readLine());
			if(this.list.get(w)==null) {
				this.list.remove(w);
				break;
			}
			w++;
		}
		System.out.println("Á¤´ä À¯Ãâº»"+this.list);
		lo2();
	}
	public void lo2() {
		Scanner sc = new Scanner(System.in);
		int user, ct=0;
		int ww=0;
		String re="";
		while(ww<this.list.size()) {
			System.out.println("¼ıÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
			user = sc.nextInt();
			re = Integer.toString(user);
			int ww2=0;
			while(ww2<this.list.size()) {
				if(re.equals(this.list.get(ww))) {
					ct++;
					break;
				}
				ww2++;
			}
			ww++;
		}
		System.out.println("ÃÑ "+ct+"°³ Á¤´ä");
		
		
	}
}