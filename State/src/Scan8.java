import java.util.Scanner;

public class Scan8 {

	public static void main(String[] args) {
		/*���빮��
		����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
		ù��° ���� ���� �Է��ϼ���
		�ι�° ���� ���� �Է��ϼ���
		ù��° ���� * �ι�° ���ڿ� ���� ������� ����Ͻʽÿ�
		��, �ش� ������� 100������ ��� 
		��¸޼��� "100������ ������Դϴ�"��� �����Ͻð�
		100�̻��� ��� "�ش� ���� 100�̻� ����� �Դϴ�" ��� ����մϴ�
		*/
		Scanner a = new Scanner(System.in);
		System.out.println("ù��° ���� ���� �Է��ϼ���");
		int a1 = a.nextInt();
		Scanner b = new Scanner(System.in);
		int b1 = b.nextInt();
		int c = a1* b1;
		if(c<100) {
			System.out.println("100 �Ʒ�");
		}
		else if(c>100) {
			System.out.println("100 ��");
		}
		else {
			System.out.println("100");
		}
		a.close();
		b.close();
		/*
		 ���빮�� ���ǹ� �ڵ� �ۼ��ϱ�
		 ���� �ڽ��� ���忡�� ��, ����� �ϴ� ���μ����� ���� �ؾ� �մϴ�.
		 ���� �⺻ �ڻ�ݾ� : 100,000��
		 "1�� �Է½� �Ա� . 2�� �Է½� ��� �Դϴ�."��� �޼����� ���� ����
		 ���� �Ǿ�� �մϴ�.
		 1���� �Է½� "�ش� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ�ݾ��� ����Ͻø�˴ϴ�.
		 2���� �Է½� "��� �� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� - �⺻ �ڻ� �ݾ��� ����Ͽ�
		 �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�.
		 */

		/*Scanner a2 = new Scanner(System.in);
		System.out.println("dd");
		int aaa = a2.nextInt();
		int bbb = aaa * 4 ;
		System.out.println(bbb);*/
	}

}
