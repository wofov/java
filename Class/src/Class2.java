
public class Class2 {
//class3�� ���� package�� ������� ���� (default��)
	public static void main(String[] args) {
		//������ Ŭ���� ���� �� �Լ��� �̿��Ͽ� ���� ���� �ޱ�
	
		//inject a = new inject(); << �ּ� ó�� �ص� ���ص� �Ѵ� ����
		
		//inject.oksign("ȫ�浿");//���� �⺻�� �Ǵ� �Լ� ��, static void�� ���� 
		//inject.test();
		members.user("�̼���");//��ȣ �ȿ� �ִ� (���ڰ�)
		members.cal(5,10);//members Ŭ���� �ȿ� cal��� �Ϲ��Լ��� 5�� 10 ���ڰ��� ����
	}

}

class inject{
	//public static void : ���� �⺻�� �Ǵ� �Ϲ� �Լ��� ����.
	public static void oksign(String adata) {
		System.out.println(adata);
		
	}
	public static void test() {
		int aa = 1;
		int vv = 3;
		int cc = aa+vv;
		System.out.println(cc);
		
	}
}
class members{
	public static void user(String names) {
		String msg = names + "�� ȯ���մϴ�.";
		System.out.println(msg);
	}
	public static void cal(int a, int b) {//(�ڷ��� �̸�, �ڷ��� �̸�) : ���ڰ� 2���� ����
		int ccc = a*b;
		System.out.println(ccc);
		
	}
	
	
	
}