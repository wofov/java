
public class app {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;	
		int c;
		
		//��Ģ�����ȣ : + , - , * , /
		
		//c = a + b;
		//c = a - b;
		//c = a * b;
		c = a / b;
		System.out.println(c);
		
		String a1 = "ȫ�浿";
		String b1 = "ȯ���մϴ�.";
		String c1;
		c1 = a1 + b1;  //���������϶� +�� ���� + ���ڿ��� ǥ���� �� �ֽ��ϴ�
		System.out.println(c1);
		
		/* ���빮��
		  ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�.
		  ȫ�浿�� �������� 50000 �Դϴ�.
		  ��, ȫ�浿�� 50000�� ���� ���������� ��ȭ�� �� �ֽ��ϴ�.
		 */
		
		String j = "ȫ�浿";
		int k = 50000;
		String i = (j+"�� ��������" +k+"�Դϴ�.");
		System.out.println(i);
		
		/* ���빮��
		   �Ƹ��� ����Ʈ���� ��ǰ�� ���� �߽��ϴ�.
		   ��ٱ��� ���� ��ǰ ������ ��� ���ؼ� �� ���� �ݾ���
		   ��µǵ��� �Ͻÿ�. �� $ ȯ���� ��� �Ǿ�� �մϴ�.
		   8.25
		   4.02
		   3.71
		   ��� ���� ������ ���� ����ϼ���.
		   �� �����ݾ� $    �Դϴ�.
		 */
		
		double o = 8.25;
		double p = 4.02;
		double q = 3.71;
		String r = ("�� �����ݾ��� $"+(o + p + q)+"�Դϴ�.");
		System.out.println(r);
		
		int k1 = 3;
		int j1 = 9;
		double aw = (double)k1 / j1;  //���������� �ڷ��� ���� �ִ� �ڵ�
		//double ���̸� �Ʒ� �Ҽ��� Ȯ�� ����
		System.out.println(aw);
		
		
		
	}

}
