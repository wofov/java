package example;

import java.util.Arrays;
import java.util.Scanner;

public class example44 {

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
		String a1 []= new String[5];
		
		name1(a1);
		}
		
	
	
	public static void name1(String aa[]) {
		Scanner sc = new Scanner(System.in);
		int z=0;
		int z1=aa.length;
		String name;
		while(z<z1) {
			System.out.println("�б� �л� �̸��� �Է�");
			name = sc.next();
			aa[z]=name;
			z++;
		}
		System.out.println(Arrays.toString(aa));
	}

	


	}


