
public class Method2 {

	public static void main(String[] args) {
		/*//default package�� ���� �ش� class���� ȣ�� �ϸ� ��
		 * �� package�� ���� �ִ� ���� ���� ��ܿ� package�� ���� �ؾ���.
		 tests ts = new tests();
		 ts.a2++;
		 System.out.println(ts.a2);
		 */

		info i = new info();
		//����
	    //System.out.println(i.data1(20););
		//System.out.println(i.data2(20););

		//����
	    System.out.println(i.data3(20));

		//i.data4("ȫ�浿");
		//System.out.println();
		String result =i.data4("ȫ�浿");
		//data4 �޼ҵ� return���� result ������ �޾Ƽ� ó��
		System.out.println(result);
	}

}
class info{
	/*
	 static �Ǵ� void �޼ҵ忡�� return�̶�� ��� ������� ����
	 */
	public static void data1(int abc) {
		int z = abc +20;
		//System.out.println(z);
		
	}
	public void data2(int abc) {
		int z = abc + 20;
		//System.out.println(z);
	}
	public int data3(int abc) {//�ڷ��� �޼ҵ��� ���ϸ�, ������ return ��� �ؾ��մϴ�.
		//���� sysout�� ������� ����.
		int z = abc +20;
		return z;
		
	}
	public String data4(String abc) {
		String z = abc + "�� ȯ���մϴ�.";
		return z;
	}
}