import java.util.Arrays;
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		//Ŭ����,�޼ҵ�,�迭
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������?");
		String users[]= {"ȫ�浿","�̼���","������"};
		String pm = sc.next();
		arrays.lists(users,pm);

		
		/*
		 ���빮�� ����ڰ� �ڽ��� �̸��� �Է��մϴ�
		 ����� �̸��� �ش� class�� ������ ��ϵ� ����� ����
		 �� ������ ����� ���� Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�
		 ��ϵ� ����ڸ� ������ �Ǿ��ֽ��ϴ�
		 �̵���ڸ� �̰����� �Դϴ�
		 */

	}

}
class arrays{
	public static void lists(String a[], String data) {
		int ea = a.length;
		int b;
		String msg="";
		//String msg = null;//��//�޼ҵ�� �ش� ���� ���� �Ҷ��� ����ִ� ���� ��Ȯ�ϰ� �����ϼž� �մϴ�.
		//String "" or null int 0���� ǥ��
		//int datas = 0;
		boolean ck = false;
		for(b=0;b<ea;b++) {
			if(data.equals(a[b])) {
				msg="���Ե� �����";
				ck=true;
			}
			
		}
		if(ck==false) {
			msg="�̰�����";
		}
		arrays ar = new arrays();
	    ar.messger(msg);
		
		
	}
	public void messger(String m) {
		System.out.println(m);
	}
	
}
