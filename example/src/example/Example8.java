package example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 ���� ����ڰ� ���� ���� ���α׷��� ��û�߽��ϴ�.
		 ����ڰ� �� 5���� ���ڸ� �Է��մϴ�.
		 "1~46 �� ���̿� ���ڸ� �Է��ϼ���"
		 5�� ���ڸ� �迭�� ����(main���� ó��)
		 
		 �ܺ� class�� �̿��Ͽ� pc�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 pc�� ���� 5���� ���ڸ� �迭�� �����մϴ�(�ܺ� Ŭ����)
		 
		 ������ ��� �޼ҵ带 �ϳ� �� �����Ͽ�
		 ����ڰ� �Է��� 5���� �迭 �����Ϳ� pc�� ���� �迭 �����͸�
		 �ش� �޼ҵ�� �����Ͽ�, ����ϼ���.
		 
		 �� ��� �ݺ����� do while��
		 */
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int a1;
		int pp[] = new int[5];
		do {
			System.out.println("1~46�� ���̿� ���ڸ� �Է��ϼ���");
			a1 = sc.nextInt();
            pp[a]=a1;
			a++;
		}while(a<5);
		A11.bb1(pp);
		sc.close();
	}
}
class A11{
	public static void bb1(int rr[]) {
		Random r = new Random(); 
		int pp1[]= new int[5];
		int ww=0;
		do {
            pp1[ww]=r.nextInt(45)+1;       	
			ww++;
		}while(ww<5);
		bb2(rr,pp1);
	}
	public static void bb2(int rr1[],int pp12[]) {
		System.out.println(Arrays.toString(rr1) + " " + Arrays.toString(pp12));
	}
}