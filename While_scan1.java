import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/*
	    응용문제 총 2번의 질문을 하게 됩니다
	    사용자가 숫자를 입력하여 두 수의 합을 구하는
	    scanner를 제작 하시오
		 */
		Scanner a = new Scanner(System.in);
		int b=1;
		int total = 0;
		int c;
		while(b<3) {
		    System.out.println("합계를 구할"+b+"번째 숫자를 입력하세요");
			c = a.nextInt();
			total += c;
			b++;
		}
		System.out.println("두 수의 합은 "+total);
		a.close();

	}

}
