
public class Method1 {

	public static void main(String[] args) {
		
		tests t = new tests();
		t.a1 ++;
		t.a2 ++;
		t.name1();
		t.b1 += "������";
		t.b2 += "������";
		t.name2();
		tests tt = new tests();
		tt.a1 ++;
		tt.a2 ++;
		tt.name1();
		tt.b1 += "������";
		tt.b2 += "������";
		tt.name2();
	}

}
class tests{
	int a1=1;//���ο� ��ü ���� �� class�� ȣ��� 1�̶�� ���ڸ� �ٽ� ������ �˴ϴ�./��������
	public static int a2 = 1;//���� ����
	//���ο� ��ü ���� �� class��   ȣ���ϴ��� 1�̶�� ���ڰ� �ƴ� �޸𸮿� ��ϵ�
	//�������� ���������� ������ �˴ϴ�.
	String b1="�̼���";
	public static String b2="ȫ�浿";
	public void name1() {
		//System.out.println(a1);
		//System.out.println(a2);
	}
	public void name2() {
		System.out.println(b1);
		System.out.println(b2);
	}
}
