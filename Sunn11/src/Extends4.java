
public class Extends4 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 �� ���� ���� �ܺ� Ŭ������ �����ϴ�.
		 �ش� Ŭ�������� �� ���� ���� ����ϰ� �˴ϴ�. 
		 ��� ������ ������ ����.
		 3,10�� ������ �ΰ��� ���� ���Ѵ�.
		 ������ �ܺ� Ŭ�������� �ش� ��� ���� ����ϸ�
		 �� ���� �� ���� ¦��,Ȧ�� ������ ����ϴ� extends ����
		 */

		num2 pp =new num2();
		pp.user(3, 10);
		pp.user2();
		
	}

}
class num1{
	protected int re;
	public void user(int a1, int b1) {
		this.re = a1 + b1;
		
		
	}
}
class num2 extends num1{
	public void user2() {
		if(this.re%2==0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		
	}
}