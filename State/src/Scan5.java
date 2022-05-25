import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		/*byte a = 10;
		if(a < 10) {
			System.out.println("입력한 값은 10이상의 숫자를 입력하세요");
		}

		else if(a >= 10||a<=22) {//조건문의 범위를 설정하여 적용함
			System.out.println("당첨");
		}
		else {
			System.out.println("범위 밖의 숫자 입니다");
		}*/
		
		//응용문제
		Scanner a1 = new Scanner(System.in);
		System.out.println("1부터 45까지 숫자 하나를 입력하세요");
		int a2 = a1.nextInt();
		
		if(a2<=0) {
			System.out.println("숫자 입력이 잘못 되었습니다");
		}
		else if(a2<=45&& a2>0) {
			System.out.println(a2);
			if(a2==7 || a2==12 || a2==14) {
				System.out.println("당첨");
			}
			else {
				System.out.println("다음기회에 참여하세요");
			}
		}
		else if(a2>45) {
			System.out.println("숫자는 1부터 45까지만 입력 가능");
		}

		a1.close();

		
		
		
	}

}
