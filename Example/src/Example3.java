import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 ���빮��3
		 ����ڰ� �ش� ���� �Է��մϴ�.
		 ��, ����ڰ� �� ���� ���ڸ� �Է��ϵ� ù��° ���ڰ� �ι�° ���� 
		 ���� �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �ϼ���
		 ��, �ش��ڵ�� do while�� �ۼ��ض�
		 ����) ù��° ���� ���ڴ�? 5
		 �ι�° ���� ���ڴ�? 10
		 ���� ���� ��� �հ�� 45�Դϴ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� ���ڴ�?");
		int user = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("�ι�° ���� ���ڴ�?");
		int user2 = sc2.nextInt();
		int total = 0;
		if(user<user2) {
			do {
				total += user;
				user++;
			}while(user<=user2);
			System.out.println(total);
		}
		else {
			System.out.println("�ι�° ���ڰ� ù��° ���ں��� ���ƾ��մϴ�.");
		}
		sc.close();
		sc2.close();
	}

}
