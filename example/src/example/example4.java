package example;

import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/*
		 �迭 ���� +�⺻(Ŭ����)�޼ҵ� ����
		 ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�.
		 �б� �л� �̸��� �Է��ϼ���
		 ������, �� �迭 �����ʹ� 5���� �����˴ϴ�.
		 ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� �迭�� ���� �Ͽ�
		 ����ϼ���
		 ����) qqw 23 we23 �Է��ϸ�
		 [qqw 23 we23] �̷��� ���
		 */
		//String a1 []= new String[5];
		Scanner sc = new Scanner(System.in);
		String aa = "";
		int f=0;
		String nn;
		while(f<5) {
			System.out.println("�б� �л� �̸��� �Է�");
			nn=sc.next();
			aa +=(nn+" ");
			
			f++;
		}
		name1(aa);
		
	}
	public static void name1(String a) {
	
		
		String userin[] = a.split(" ");//split ���ڿ� �Ǵ� ���ڿ��� �迭�� ���� �� �ִ� ����
		System.out.println(Arrays.toString(userin));
		
		
		
		
		
	}
	
	}
