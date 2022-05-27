import java.util.Scanner;

public class Dowhile_plus {

	public static void main(String[] args) {
		/*
		 응용문제 
		 사용자가 총 3번의 숫자를 입력합니다.
		 3개의 숫자를 모두 곱하여 총 합계를 출력하세요
		 123456789*123456789*123456789
		 */
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int user;
		long total = 1;//long입력시 결과에서 -음수 발생함.
		do {
			System.out.println("곱할 "+a+"번째 숫자를 입력하세요");
			user = sc.nextInt();
			total = total * user;
			a++;
		}while(a<4);
		System.out.println("총 합계는 "+total);

		sc.close();
	}

}
