package example;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 2���迭�̸�, �����ʹ� ������ ����
		 {"ȫ�浿","�̼���","������","������","�������","������","����屺"}
		 {3000,1000,25000,19800,5750,3630,0}
		 ���α׷� ���۰� ���ÿ� 
		 "����Ʈ�� �˻��� ������ �Է��ϼ���"
		 �Է��� ���� ������ Ŭ������ ���� �Ͽ� �ش� �޼ҵ� ������ �ŰԺ����� �̿��Ͽ�
		 ���� �� �ش� ��� ���� ����ϼ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ���� �Է�");
		String zz = sc.next();
		users aa = new users();
		aa.pp(zz);
		sc.close();
		aa=null;//�� �ʱ�ȭ ������ �����ϴ� ��
	}
}
class users{
	public static void pp(String a) {
		String bb[][]= {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"3000","1000","25000","19800","5750","3630","0"}
		};
	 
		int a11 = bb.length;
		int a22 = bb[0].length;
	    int po = 0;
	    while(po<a22) {
	    	if(a.equals(bb[0][po])) {
	    		System.out.println(bb[1][po]);
	    	}
	    	po++;
	    }
	}
}