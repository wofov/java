
public class Class3 {

	public static void main(String[] args) {
		//�ڷ���(��������) ��ȯ
		double a =1.37;
		int b =(int)a;
		//double > int ��ȯ
		
		int c=35;
		double d=c; //double d=(double)c;  int > double ��ȯ
		System.out.println(d);
		

		//long���� Long.parseLong ���
		//String > int  �̰Ŵ� �ȵ�
		String x = "35";
		String x2 = "156";
//		int z= Integer.parseInt(x); //parseInt int���� ����ϴ� ������� �����
		int z= Integer.valueOf(x);//valueOf > parseInt // valueOf �޼ҵ�(�޼ҵ��Լ�) 
		int total = Integer.parseInt(x) + Integer.parseInt(x2);//�������� ���������� ��ȯ�Ͽ� �������� ó����
		System.out.println(z);
		
		String j = "9123456789";
		String j2 = "99123456789";
		//int total2 = Integer.parseInt(j)+Integer.parseInt(j2); �ڡ�int�� int�� / long�� long��
		long total2 = Long.parseLong(j) + Long.parseLong(j2);//
		System.out.println(total2);
		
		//����(char) > ����(String) �⺻ ���ĸ� ���
		char part = 'a';//char ���� ����ǥ ����ؾ��� �� �ܾ ����
		String f = String.valueOf(part); // ���� > ���� valueOf���
        System.out.println(f);
	}

}
