import java.util.Scanner;

public class Dowhile_plus {

	public static void main(String[] args) {
		/*
		 ���빮�� 
		 ����ڰ� �� 3���� ���ڸ� �Է��մϴ�.
		 3���� ���ڸ� ��� ���Ͽ� �� �հ踦 ����ϼ���
		 123456789*123456789*123456789
		 */
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int user;
		long total = 1;//long�Է½� ������� -���� �߻���.
		do {
			System.out.println("���� "+a+"��° ���ڸ� �Է��ϼ���");
			user = sc.nextInt();
			total = total * user;
			a++;
		}while(a<4);
		System.out.println("�� �հ�� "+total);

		sc.close();
	}

}
