import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2.lists2();//�ڡڡ�static�� ���� // �޸𸮿��� �ε�
		Member2 mb2 =new Member2();//�ڡڡ�static�� ����//Static�� ���� �Լ� �̹Ƿ� ��ü �� �ν��Ͻ��� ����
		mb2.lists();//�ڡڡ�static�� ���� // �ν��Ͻ���(�޸�)��  �ִ� �޼ҵ带 �ε��ϰ� ��.

		Member2.list3("������",12);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �Ͻ� ������ ���ڸ� �Է��ϼ���");
		int aa2 =sc.nextInt();
		Member2.for_in(aa2);
		sc.close();
	}
	/*
	 ���빮�� for_in ��� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�.
	 ���α׷� ����� ������ ���� ������ �մϴ�.
	 "��� �Ͻ� ������ ���ڸ� �ϳ� �Է��ϼ���"
	 [���] �ش� �޼ҵ忡�� ����� ����ؾ���.
	 ���� ����� 3 �Է½�
	 3*1=3 ....... 3*9=27 ��� �ؾ���
	 for�� ����ϱ�
	 */

}
class Member2{
	public void lists() {//�޸� �Ҵ� x > �̰� �ε� �ؾ����� ��� // �޸� ���� �Ҵ� ���� �޼ҵ� �Լ��� ����
		String a="ȫ�浿";
		System.out.println(a);
		
	}
	public static void lists2() {//�޿��� �÷����� ������� �ε� 
		
		String a="�̼���";
		System.out.println(a);
		
	}
	
	public static void list3(String nm,int pw) {
		//nm�� �޼ҵ忡�� ���� �޴� ���� �ٷ� ����� ��� nm.equals("������")
		String user_name = nm;
		int user_pw=pw;
		//�޼ҵ忡 ��ü ���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���� �޴� ����
		//int user_point;
	    if(nm.equals("������")&& user_pw==12) {
	    	System.out.println("ȸ��Ȯ��");
	    }
				
		System.out.println(nm);
		
	}
	  public static void for_in(int aa) {
			
			int aa3;
			
			for(aa3=1;aa3<10;aa3++) {
				
				System.out.printf("%d * %d = %d ",aa,aa3,(aa*aa3));
			}
		}
}