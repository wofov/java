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
		//Math.random �� ���� double ����
		// int xx = (int)(Matr.random()*3+1); > �̷��� �ϸ� ����
		int aaa = r.nextInt(9)+1;
		System.out.println(aaa);
		int b1=5;
		int user;
		while(b1>0) {
			System.out.println("��ȸ"+b1+"�� , 1~10���� ���� �Է��ϼ���");
			user = sc.nextInt();
			game.user_new(user,aaa);
//			String out = game.user2();
//			int check =out.indexOf("����");//-1�� ������ ���� , 0�� ������ �ִ�.
//			if(check == 0) {//�ڡڡ�
//				break;//�ڡڡڡڡ�
//			}
			if(game.user2().equals("����")){
				System.out.println(game.user2());
				System.exit(b1);
			}
			else {
				System.out.println(game.user2());
			}
			b1--;
		}
		sc.close();
		
		
	
		
		
		
		
		
	}

}