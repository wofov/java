
public class oop4 {

	//�߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();
	}

}
abstract class ab_1{//�߻� Ŭ���� : �ܺο��� �ε尡 ���� �ȵ�, ��ü ���൵ �ȵ�
	public void ab_a() {//�μ��� ���� �߻� �޼ҵ� 
		System.out.println("�θ� Ŭ���� �Դϴ�");
		
	}
	public void ab_a(int ww) {//�μ��� �޴� �߻� �޼ҵ�
		
	}
	public abstract int b(); // free ���� , �߻� �޼ҵ� - ��ü ���� �ȵ�
    public abstract int c(); //�ڽ�Ŭ�������� ���
}
class ab_2 extends ab_1{
	@Override // > �߻� abstract ��� �ϸ� �� �������̵� ���;
	public int b() {//���� �޼ҵ� + �߻� �޼ҵ�
		return 55;
	}
    @Override
	public int c() {
		return 52;
	}
}