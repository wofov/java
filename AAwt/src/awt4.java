import java.awt.*;
import java.awt.event.*;
public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java연결 
	    decorate de = new decorate();
	    de.view();
	}

}
class decorate extends awt4_class{
	String msg="";
	public void btn_push(int c1) {

		int w=1;;
//		while(w<10) {
//			this.msg = c1+" * " +w+" = "+(c1*w) + "\n";<< 역슬래시 라벨에 띄우기. 
//			w++;
//		}
//		
		msg = "아아";
	}
	public String call() {
		return this.msg;
	}
	
	
}
