package swing1;

public class swing1 {

	public static void main(String[] args) {
		//wrapper class(box����)
		/*
		 float,char,byte,long,short(�⺻Ÿ��)
		 wrapper class : Byte, Integer, Long, Double
		 */
		//int a=20;//��ڽ� > ��� ����
		Integer a=new Integer(20);
		Integer b=new Integer(20);//new integer (�ڽ�) > ���� �����ȣ ��� �ȵ� //��ȣ �ȿ� 20 �� ���� �ڽ� ���¶���.
		//���� ���� �ڽ� ���� ����Ҷ� equals���
		if(a.equals(b)) {
			System.out.println(a+b);
		}
		Integer bo1 = 20;//��ڽ�
		Integer no = new Integer(99);//�ڽ�
		//int aa= no ��ڽ�
		Integer bb= no.intValue();//��ڽ�
		System.out.println(bb);
	
		/*
		 �ڽ̰� ��ڽ� ���� ���� equals�� ��� �ؾ߸� �񱳰� �̷����. 
		 */

	}

}
