import java.util.Scanner;

public class Extends5 {

	public static void main(String[] args) {
		/*
		 extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ��ϼ���
		 ���� �ΰ��� �Է��մϴ�.
		 �� ���� ���ڸ� Ȯ���Ͽ� ������ ���� üũ �մϴ�. 
		 ù��° ���ڰ� �ι�° ���ں��� ���� ���
		  ù��° ���ڰ� �ι�° ���ں��� Ŭ ���
		   ù��° ���ڰ� �ι�° ���� ����
		   
		   
		   ���� ��� : �ش� �ΰ��� ���� ��ģ ��� ���
		   Ŭ ��� : �ش� ���� ��ŭ ���ڸ� ��� ���� ��� ���� ���
		   ���� ��� : �ش� ���� ����
		 */
		Scanner sc  = new Scanner(System.in);
		q2 num = new q2();
		System.out.println("ù��° ���ڴ�?");
		int a = sc.nextInt();
		System.out.println("�ι�° ���ڴ�?");
		int b = sc.nextInt();
		num.point1(a,b);
		num.point2();
		sc.close();
	}
}
class q1{
	protected String re;
	protected int aa,bb;
	protected int total = 0;
	public void point1(int a1, int b1) {
		this.aa = a1;
		this.bb = b1;
		if(this.aa<this.bb) {
			this.re = "1��";
		}
		else if (this.aa>this.bb){
			while(this.aa>=this.bb) {
				this.total +=this.aa;
				this.aa --;
			}
			this.re = "2��";
		}
		else {
			this.re = "3��";
		}
	}
}
class q2 extends q1{
	public void point2() {
		if(this.re=="1��") {
			System.out.println(this.aa+this.bb);
		}
		else if(this.re=="2��") {
			System.out.println(this.total);
		}
		else {
			System.out.println("����");
		}
	}
}