import java.util.Random;
import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		/*
		 * A��Ʈ pc���� Scanner(5��)
		 * b��Ʈ pc���� ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ��� ó��
		 * ���ٿ����
		 ��ȸ�� 5��
		1. pc�� ���ڸ� �ϳ� ���� =���� 1~10
		2. �� ��ȸ�� x�� ���ҽ��ϴ�. 1~10���� ��ȣ�� �ϳ��� ��ȣ�� �Է��ϼ���
		3.���࿡ pc�� 7�� �̾Ѵ� ����� ���ڿ� ��
		pc 7 ����� 2 > ��� up 
		4.�� ��ȸ�� x�� ���ҽ��ϴ�. 1~10���� ��ȣ�� �ϳ��� ��ȣ�� �Է��ϼ���
		5.����� �����Դϴ�. ��� ��
		��� ���μ��� ����
		System.exit
		 */
		example2 game = new example2();
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int aaa = r.nextInt(9)+1;
		int b1=5;
		String msg1 = "";
		while(b1>0) {
			System.out.println("��ȸ"+b1+"�� , 1~10���� ���� �Է��ϼ���");
			int user = sc.nextInt();
			int aa =game.user_new(user,aaa);
			if(aa==11) {
				msg1 = "�ٿ�, ��ȸ "+(b1-1);
			}
			else if(aa==22) {
				msg1 = "��, ��ȸ "+(b1-1);
			}
			
			else  {
				System.out.println("����");
				System.exit(aa);
			}
			System.out.println(msg1);
			b1--;
		}
		sc.close();
		
		
	
		
		
		
		
		
	}

}
