import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c;
		while(a<10) {
            c=b*a;
			//System.out.printf("%d ",c);
			a++;
		}
        /*
         ���빮�� 
         56,49,42,35,28,21
         */
		int a1;
		for(a1=8;a1>2;a1--) {
			//System.out.printf(a1*7+",");
		}
		int a2 = 8;
		while(a2>2) {
			//System.out.print(a2*7+",");
			a2--;
		}
		/*
		 ���빮�� ����2
		 ���� ��� ���� Ȯ�� �Ͻ� �� �ش� ������� �´� �ڵ带 �ۼ��ϼ���
		 4,7,10,13,16,19,22
		 */
		int c1 =1;
		int bb;
		while(c1<8) {
			bb=1+3*c1;
			//System.out.println(bb);
			c1++;
		}
		/*
		 ���빮��1 ���ǹ� �ڵ� �ۼ��ϱ�
		 ���� �ڽ��� ���忡�� ��, ����� �ϴ� ���μ����� ���� �ؾ� �մϴ�.
		 ���� �⺻ �ڻ�ݾ� : 100,000��
		 "1�� �Է½� �Ա� . 2�� �Է½� ��� �Դϴ�."��� �޼����� ���� ����
		 ���� �Ǿ�� �մϴ�.
		 1���� �Է½� "�ش� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ�ݾ��� ����Ͻø�˴ϴ�.
		 2���� �Է½� "��� �� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� - �⺻ �ڻ� �ݾ��� ����Ͽ�
		 �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�.
		 */
		Scanner aa = new Scanner(System.in);
		int aaa = 100000;
		int aa3 = 0;
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�");
		String dd=aa.next();
		Scanner aa1 = new Scanner(System.in);
		int aa2;
		if(dd.equals("1��")) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���");
			aa2 = aa1.nextInt();
			aa3 = aa2 + 100000;
		}
		else if(dd.equals("2��")) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���");
			aa2 = aa1.nextInt();
			aa3 = 100000 - aa2;
		}
		else {
			System.out.println("�ٽ��Է��ϼ���");
		}
		System.out.println("�� �ݾ� "+aa3+"�� �Դϴ�");
		aa.close();
	}

}
