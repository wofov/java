import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		/*byte a = 10;
		if(a < 10) {
			System.out.println("�Է��� ���� 10�̻��� ���ڸ� �Է��ϼ���");
		}

		else if(a >= 10||a<=22) {//���ǹ��� ������ �����Ͽ� ������
			System.out.println("��÷");
		}
		else {
			System.out.println("���� ���� ���� �Դϴ�");
		}*/
		
		//���빮��
		Scanner a1 = new Scanner(System.in);
		System.out.println("1���� 45���� ���� �ϳ��� �Է��ϼ���");
		int a2 = a1.nextInt();
		
		if(a2<=0) {
			System.out.println("���� �Է��� �߸� �Ǿ����ϴ�");
		}
		else if(a2<=45&& a2>0) {
			System.out.println(a2);
			if(a2==7 || a2==12 || a2==14) {
				System.out.println("��÷");
			}
			else {
				System.out.println("������ȸ�� �����ϼ���");
			}
		}
		else if(a2>45) {
			System.out.println("���ڴ� 1���� 45������ �Է� ����");
		}

		a1.close();

		
		
		
	}

}
