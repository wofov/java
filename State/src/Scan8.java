import java.util.Scanner;

public class Scan8 {

	public static void main(String[] args) {
		/*응용문제
		사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
		첫번째 숫자 값을 입력하세요
		두번째 숫자 값을 입력하세요
		첫번째 숫자 * 두번째 숫자에 대한 결과값을 출력하십시오
		단, 해당 결과값이 100이하일 경우 
		출력메세지 "100이하의 결과값입니다"라고 설정하시고
		100이상일 경우 "해당 값은 100이상 결과값 입니다" 라고 출력합니다
		*/
		Scanner a = new Scanner(System.in);
		System.out.println("첫번째 숫자 값을 입력하세요");
		int a1 = a.nextInt();
		Scanner b = new Scanner(System.in);
		int b1 = b.nextInt();
		int c = a1* b1;
		if(c<100) {
			System.out.println("100 아래");
		}
		else if(c>100) {
			System.out.println("100 위");
		}
		else {
			System.out.println("100");
		}
		a.close();
		b.close();
		/*
		 응용문제 조건문 코드 작성하기
		 고객이 자신의 통장에서 입, 출금을 하는 프로세서를 제작 해야 합니다.
		 고객의 기본 자산금액 : 100,000원
		 "1번 입력시 입금 . 2번 입력시 출금 입니다."라는 메세지가 제일 먼저
		 실행 되어야 합니다.
		 1번을 입력시 "해당 금액을 입력하세요"
		 사용자가 입력한 금액 + 기본 자산 금액을 합한 총 자산금액을 출력하시면됩니다.
		 2번을 입력시 "출금 할 금액을 입력하세여"
		 사용자가 입력한 금액 - 기본 자산 금액을 계산하여
		 총 자산금액을 출력하시면 됩니다.
		 */

		/*Scanner a2 = new Scanner(System.in);
		System.out.println("dd");
		int aaa = a2.nextInt();
		int bbb = aaa * 4 ;
		System.out.println(bbb);*/
	}

}
