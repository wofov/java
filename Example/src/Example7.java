import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 ���빮��7
		 ����ڰ� ���� ������ Ȯ���Ͽ� ���� Ȯ���Ͽ� �ش� ����� �����ϴ� ���μ��� ����.
		 "ù��° �Է°� ��, 1~10���� �Է°�"
		 "�ι�° �Է°� ��, 1~10���� �Է°�"
		 "����° �Է°� ��, 1~10���� �Է°�"
		 "������ ���� �Դϴ�. �ش� ������ ���� ����
		 �����ȣ�� �����ÿ�"
		 �ش� �����ȣ�� �°� ���� �����Ͽ� �������� �����ض�
		 */
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1��° �Է°� (��, 1~10����)�� �Է��ϼ���");
		int user1=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("2��° �Է°� (��, 1~10����)�� �Է��ϼ���");
		int user2=sc2.nextInt();
	
		Scanner sc3 = new Scanner(System.in);
		System.out.println("3��° �Է°� (��, 1~10����)�� �Է��ϼ���");
		int user3=sc3.nextInt();
	
			
		Scanner sc4 = new Scanner(System.in);
		System.out.println("������ �����Դϴ�. �ش� �� ���� ���� ���� �����ȣ�� �����ÿ�");
		String user4=sc4.next();
		if(user4.equals("+")) {
			System.out.println(user1+user2+user3);
		}
		else if(user4.equals("-")) {
			System.out.println(user1-user2-user3);
		}
		else if(user4.equals("*")) {
			System.out.println(user1*user2*user3);
		}
		else if(user4.equals("/")) {
			System.out.println(user1/user2/user3);
		}
        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
	}

}
