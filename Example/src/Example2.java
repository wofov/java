import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ� 
		������ ����� ����Ͽ� ¦�� ���� Ȧ�� ���� ����ϼ���
		"�����ܿ� ���� ���ڸ� �Է��ϼ���"��� �޼����� ��µǸ�
		���� ���� ���� ¦�� ���� Ȧ�������� ����ϼ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("� �������� ������ Ȧ,¦���� �˷��帱���?");
		int b=1;
		int z = sc.nextInt();
		int c;
		int total = 0;
		if(z<10) {
			while(b<10) {
				c=z*b;
				total = total +c;
			b++;
			}
		}
		if(total%2==0) {
			System.out.println("¦");
		}
		if(total%2==1) {
			System.out.println("Ȧ");
		}
		

	}

}
