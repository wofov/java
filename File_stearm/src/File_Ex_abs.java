import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class File_Ex_abs {

	FileReader fr=null;
	ArrayList<String> ea_name = null;
	protected final int money = 87000000;//회사 총 잔고 금액 
	public abstract void start();
    abstract void db()throws IOException;
	//abstract void db2() throws IOException;//public을 빼야 예외 처리 할 수 있다. 
	//public써도 할 수 있지만 public 빼주는게 더 좋다. 
	public abstract int[] check();
//	public void st(String a) {//오버로딩★★★★
//		//이렇게 사용하면 이 abstract클래스(?)에서만 사용할 수 있다
//		//메인 클래스에 안넘겨줘도 된다. 
//	}
		
//	public  void start1() {
//		abstract 를 사용안하면 이렇게 괄호 사용해도 된다. 
//	}
}
