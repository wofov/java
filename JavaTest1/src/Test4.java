import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �ϳ� �Է��ϼ���");
		int user = sc.nextInt();
		int a=1;
		if(user<10 && user>0) {
			do {
				System.out.printf("%d*%d=%d\n",user,a,user*a);
				a++;
			}while(a<10);
		}
		else {
			System.out.println("���� �� 10 �̻��� ���ڴ� �������� �̿��� �� �����ϴ�.");
		}
		sc.close();
	}

}
