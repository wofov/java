import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 응용문제3
		 사용자가 해당 값을 입력합니다.
		 단, 사용자가 두 개의 숫자를 입력하되 첫번째 숫자가 두번째 숫자 
		 범위 안에 있는 모든 숫자를 더해서 결과값이 나오도록 하세요
		 단, 해당코드는 do while로 작성해라
		 예시) 첫번째 범위 숫자는? 5
		 두번째 범위 숫자는? 10
		 범위 숫자 모든 합계는 45입니다
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 범위 숫자는?");
		int user = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 범위 숫자는?");
		int user2 = sc2.nextInt();
		int total = 0;
		if(user<user2) {
			do {
				total += user;
				user++;
			}while(user<=user2);
			System.out.println(total);
		}
		else {
			System.out.println("두번째 숫자가 첫번째 숫자보다 높아야합니다.");
		}
		sc.close();
		sc2.close();
	}

}
