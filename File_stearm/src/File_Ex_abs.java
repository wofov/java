import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class File_Ex_abs {

	FileReader fr=null;
	ArrayList<String> ea_name = null;
	protected final int money = 87000000;//ȸ�� �� �ܰ� �ݾ� 
	public abstract void start();
    abstract void db()throws IOException;
	//abstract void db2() throws IOException;//public�� ���� ���� ó�� �� �� �ִ�. 
	//public�ᵵ �� �� ������ public ���ִ°� �� ����. 
	public abstract int[] check();
//	public void st(String a) {//�����ε��ڡڡڡ�
//		//�̷��� ����ϸ� �� abstractŬ����(?)������ ����� �� �ִ�
//		//���� Ŭ������ �ȳѰ��൵ �ȴ�. 
//	}
		
//	public  void start1() {
//		abstract �� �����ϸ� �̷��� ��ȣ ����ص� �ȴ�. 
//	}
}
