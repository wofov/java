
public class Method3 {

	public static void main(String[] args) {
		/*
		 ���빮�� 
		 �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 ���� ��� ���� �޾Ƽ� ����� ����ϼ���
		 157, 45
		 157*45 
		 ���� ��� �� ��� :
		 */
 
		add cc = new add();
		//System.out.println(cc.a11(157, 45)); << �̰͵� ����
		int abc = cc.a11(157, 45);
		System.out.println(abc);
		cc.m2();
		cc.a11();
	}

}
class add{
	public int a11(int a1, int a2) {
		//a11 �ȿ� �μ����� �ִٸ� �Ʒ��� �ִ� a11�� �μ����� ���� ������ ���� �ٸ��ɷ� �ν���
		int b1 = a1*a2;
		return b1;
	}
	public void a11() {
		System.out.println("�����Դϴ�.");
	}
	public void m2() {
		int z=a11(100,200);
		System.out.println(z);
	}
}
