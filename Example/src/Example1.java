import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		 /*
		  ���빮�� 
		  while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�.
		  ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
		  ������
		  "7000 �����Ͻðڽ��ϱ�?"��� ��µǸ�, ���� 1�̶�� 
		  �Է��ϸ� �������� �ݾ׿� �߰� �Ǿ� ���ϴ�.
		  �� ���� Ƚ���� 4��
		  �������� ���� ���� �ݾ��� �������� �ڵ� �ۼ�
		  */
		Scanner sc = new Scanner(System.in);
        int j=1;
        int b = 7000;
        int total = 0;
        int a;
		while(j<5) {
			System.out.println("7000 ���� �Ͻðڽ��ϱ�? 1���� �߰� 2���� �ź�");
			a = sc.nextInt();
			
			if(a==1) {
				total = total + b;			
			}
			if(a==2) {
				//total = total + 0;
			}
			j++;
		}
		System.out.println("���� ���� �ݾ��� "+total+" �Դϴ�");
		
		

	}

}
