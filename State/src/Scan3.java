import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		//Q.����ڰ� ���ϴ� ���ڸ� �Է��ϼ���
        //��.¦��, Ȧ�� �Դϴ� 
		
		Scanner a = new Scanner(System.in);
		System.out.println("����ڰ� ���ϴ� ���ڸ� �Է��ϼ���");
		int b = a.nextInt();
		if (b%2==0) {
			// %�� ���� �����鼭 ������ ���� Ȯ���ϴ� ���ı�
			System.out.println("¦���Դϴ�");
		
		}
		else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		
	}

}
