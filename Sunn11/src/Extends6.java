import java.util.Scanner;

public class Extends6 {

	public static void main(String[] args) {
		/*
		 ���빮�� 
		 ��ǰ ������ 42000 �Դϴ�.
		 ����ڰ� �ش� ��ǰ ������ �Է� �ϰ� �˴ϴ�.
		 �ش� ��ǰ ���ݿ� �´� ���� ��ŭ ���Ͽ�
		 ���� ���� �ݾ��� ��½�Ű�� extends�� ���� �Ͻø� �˴ϴ�.
		 ��, 42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
		 ����ڰ� �ִ� ���� �� �� �ִ� ������ 5�� �Դϴ�.
		 ���� ��� ���� main method���� ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻ� ��ǰ ������?");
		int user = sc.nextInt();
		if(user>5) {
			System.out.println("�ִ� ���� �� �� �ִ� ������ 5���Դϴ�.");
		}
		else {
			ob2 c1 = new ob2();
			c1.na1(user);
			int re = c1.na2();
			System.out.println("�����Ͻ� �� �ݾ��� "+re+"�� �Դϴ�");
		}
		sc.close();
	}
}
class ob1{
	final private int ff = 42000;
	protected int zero;
	public void na1(int a1) {
		this.zero = a1 *this.ff;
	}
}
class ob2 extends ob1{
	public int na2() {
		return this.zero;
	}	
}