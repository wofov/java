import java.util.Scanner;

public class Loop_Scan3 {

	public static void main(String[] args) {
		//스캐너를 이용한 do while
		Scanner a = new Scanner(System.in);
		System.out.println("원하는 구구단의 숫자를 입력");
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
