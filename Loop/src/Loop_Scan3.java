import java.util.Scanner;

public class Loop_Scan3 {

	public static void main(String[] args) {
		//��ĳ�ʸ� �̿��� do while
		Scanner a = new Scanner(System.in);
		System.out.println("���ϴ� �������� ���ڸ� �Է�");
		int b = a.nextInt();
		int c = 1;
		int j;
		do {
			j= c*b;
			System.out.printf("%d ",j);
			c++;
		}while(c<10);

		a.close();
	}

}
