
public class opp5 {
    //���� �⺻ ���� �μ������� �߻� �޼ҵ�� ���� �ѱ�.
	public static void main(String[] args) {
		load1 id1 = new load1();
		id1.datain(20, 30);
		id1.call();
		load2 id2 = new load2();
		id2.datain(20, 30);
		id2.call();
	}
}
abstract class abcclass{
	int data1,data2;
	public void datain(int d1, int d2) {
		//�⺻ �߻� �޼ҵ� �̸�, ��� ������ �μ��� �޾Ƽ� this ó��
		//��, �ܺ� Ŭ�������� �������� ����.
		this.data1 = d1;
		this.data2 = d2;
	}
	public abstract void plus();
	//������ class �⺻���� plus �޼ҵ�� ������ ������
	public void call() {
		this.plus();
	}
}
class load2 extends abcclass{
//	public void call() {
//		this.avg();
//	}//>>������� �ع����� �ٷ� �Ʒ� ���ϱ� sum plus���� �ȵ� 
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg();
	}
	public void avg() {
		System.out.println("dd");
	}
}
class load1 extends abcclass{
	@Override
	public void plus() {
		int sum = this.data1+this.data2;
		System.out.println(sum);
	}
}