import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 ���빮��10
		 ���� �̿����� ���� ���� ���α׷��� ����
		 ���� �׸��� ��ü 3����
		 ��� true�� ���� �Ǿ�߸� ���� ���μ����� ����
		 ����ڿ��� ���� �Ǵ� ������ ������ ����
		 "���� �׸� ���� �Ͻðڽ��ϱ�?" ��� �޼��� ���
		 ������(1), ���Ǿ���(2)
		 ���� �Ѹ� �� �Ѱ����� �������� ���� ��� " ��� ���� �ϼž߸� ����" ���
		 ��� ���� ������ "ȸ������ �Ϸ�" ��� ���
		 */
		/*Scanner sc = new Scanner(System.in);
		int a=1;
		int b=1;
		int aa;
		while(a<4) {
			System.out.println("���� �Ͻðڽ��ϱ�? ������(1), ���Ǿ���(2)");
			aa = sc.nextInt();
			if(aa==1) {
				b++;
			}
			else {
				System.out.println("��� ���� �ϼž߸� ���డ��");
				b--;
				break;
			}
			a++;
		}
		if(a==b) {
			System.out.println("ȸ������ �Ϸ�");
		}*/
		Scanner sc = new Scanner(System.in);
		int w =1 ;
		int argee;
		boolean all_agree = false;
		do {
			System.out.println("���� �׸� �����Ͻðڽ��ϱ�? ������(1), ������(2)");
			argee = sc.nextInt();
			if(argee==1) {
				all_agree = true;
			}
			else {
				all_agree = false;
				break;
			}
			w++;
		}while(w<=3);
		if(all_agree==false) {
			System.out.println("��� ���� �ϼž߸� ���� �˴ϴ�");
		}
		else {
			System.out.println("ȸ������ �Ϸ�");
		}
		
		
		
		
		

	}

}
