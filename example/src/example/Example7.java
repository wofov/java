package example;

public class Example7 {

	public static void main(String[] args) {
		/*
		 ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ��� 
		 [data]
		 "ȫ�浿","�հ�"
		 "�̼���","�հ�"
		 "������","���հ�"
		 "������","�հ�"
		 "������","���հ�"
		 "�庸��","���հ�"
		 
		 ������ �迭 �����̸�, �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		 �� �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 ��� : ȫ�浿,�̼���,������
		 */

		//point na = new point();
		point.name();
	}

}
class point{
	public static void name() {
		String a[][] = {
				{ "ȫ�浿","�հ�"},
				{ "�̼���","�հ�"},
				{ "������","���հ�"},
				{ "������","�հ�"},
				{ "������","���հ�"},
				{ "�庸��","���հ�"}
		};
		int a1=a.length;
		int b = 0;
		while(b<a1) {
			if(a[b][1]=="�հ�") {
				System.out.println(a[b][0]);
				
			}
			
			b++;
		}
				
		
		
		
		
		
		
	}
	
	
}