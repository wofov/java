import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int date[] = {5, 10, 15, 20, 25, 30, 35};
		/*
		for each���� ����� ������ �ε��� ��ȣ�� �ʿ���� ����� ���ڡ�
		for ~ do ~ while �� ����� ������ �ε��� ��ȣ�� �ʿ��� ���ڡ�
		[0][1][2] : �ε��� ��ȣ
		 */
		for(int f:date) {//int f�� ���������� date���� ���������� �޾Ƽ� ����.
			if(f%2==0) {
			//	System.out.println(f);
				
			}
		}
		/*
		String pay[] = {"������ �Ա�", "�ſ�ī��", "�޴���", "��ǰ��", "����"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ��� �ϴ� ���¸� �������ּ���");
		String pm = sc.next();
		for(String z : pay) {//�迭 �����Ͱ� ���� �̹Ƿ� �޴� �������� ���� �������� ����ؾ���
			if(pm.equals(z)) {
				//System.out.println(pm+"�� ���� ���� �մϴ�");
				if(z.equals("�޴���")) {
					System.out.println("���� �������� ���� �Ұ�");
				}
				else {
					System.out.println(pm+"�� ���� ���� �մϴ�");
				}
			}
		
		}
		sc.close();*/
		
		/*
		���빮�� {"�ܹ���","����","ġŲ","Ŀ��"}
		�ֹ��ϰ��� �ϴ� ������ �����ϼ��� < ����
		�ش� ������ �� 4�� ����ϴ�
		��, "�ֹ�����"��� �Է½� ��� �ֹ� ����Ǹ�,
		�ֹ������� ���.
		 */
		String menu[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		Scanner sc; 
		String aa;
		int b;
		String odd = "";
		for(String a :menu) {
			System.out.println("�ֹ��ϰ��� �ϴ� �޴�?");
			sc = new Scanner(System.in);
			aa = sc.next();
				if(aa.equals("�ܹ���")||aa.equals("����")||aa.equals("ġŲ")||aa.equals("Ŀ��")) {
		            odd +=" "+aa;
				}
				else if(aa.equals("�ֹ�����")) {
					break;
			}
		}
		System.out.println(odd);
		
		

	}

}