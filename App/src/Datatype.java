
public class Datatype {

	public static void main(String[] args) {
		//String : ���� "" ������ ���
		String a = "1234";
		System.out.println(a);
		
		/* ������ */
		byte b = 127;   //byte : -128~127
		System.out.println(b);
		
		short c = 32767;   //short : -32,768 ~32,767
		System.out.println(c);
		
		int d = 1000000;   //int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 99999999999999L;    //long : -2^63 ~ (2^63-1)  �⺻ �޸� �Ҵ翡�� 
		//�߰������ ���ɹ����� �þ
		//long ���� ���� L ����ؾ���
		System.out.println(f);
		/* ������ ��*/
		
		/* �Ǽ��� */
		float e = 3.5f;  //..402480000000+38  (f�� ������ ��� �ؾ���)
		System.out.println(e);
		
		double g = 55.5d;  //1.784+308  (d�� ��/�� ��� ��)
		System.out.println(g);
		/* �Ǽ��� �� */
		
	}

}
