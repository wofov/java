import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/*
	    ���빮�� �� 2���� ������ �ϰ� �˴ϴ�
	    ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ�
	    scanner�� ���� �Ͻÿ�
		 */
		Scanner a = new Scanner(System.in);
		int b=1;
		int total = 0;
		int c;
		while(b<3) {
		    System.out.println("�հ踦 ����"+b+"��° ���ڸ� �Է��ϼ���");
			c = a.nextInt();
			total += c;
			b++;
		}
		System.out.println("�� ���� ���� "+total);
		a.close();

	}

}
