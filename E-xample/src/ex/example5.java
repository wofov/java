package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		/*
		 ���빮�� 
		 ����ڰ� ���� ���ڸ� ���� �Է� �޽��ϴ�. 
		 �� ����ڰ� ���ڸ� �Է��� ��� ���� ó���� ����Ǿ�� �մϴ�.
		 �� ���� �Է��� 7���̸�, ����ڰ� �Է��� ���ڸ� ������������ ���� �մϴ�. 
		 ���ڸ� �ϳ� �Է��ϼ���. 
		 
		 1-2
		 ¦���� Ȧ������ ���ε� �迭 �ϼ���. 
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> uu = new ArrayList<>();
		ArrayList<Integer> uu1 = new ArrayList<>();
		int user;
		int w=0;
		while(w<7) {
			try {
				System.out.println("���ڸ� �ϳ� �Է��ϼ���");
				Integer ck = Integer.valueOf(sc.next());//�̷������ε� ����ó�� ����. >>�̰� ����.
				if(ck%2==0) {					
					uu.add(ck);
				}
				else {
					uu1.add(ck);
				}
			}catch(Exception s) {
				System.out.println("���ڸ� �Է��ϼ���");
				w--;
			}
			w++;
		}
		Collections.sort(uu);
		Collections.sort(uu1);
		System.out.println(uu);
		System.out.println(uu1);
		sc.close();
	}
}
