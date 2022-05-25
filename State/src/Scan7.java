import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		int z = 220524;
		Scanner d = new Scanner(System.in);
		System.out.println("인증받은 번호를 입력하세요");
		int b = d.nextInt();
		if(z==b) {
			System.out.println("인증확인 되셨습니다");
		}
		else {
			System.out.println("인증번호가 틀립니다");
		}
		d.close();
        //스캐너 d 종료하기 
	}/*
	1.스캐너를 import사용
	2.문구출력(사용자가 어떤 값을 입력하는지에 대한 문구)
	3.해당 사용자가 입력한 값을 받는 변수를 지정
	*/
	/*응용문제
	사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
	첫번째 숫자 값을 입력하세요
	두번째 숫자 값을 입력하세요
	첫번째 숫자 * 두번째 숫자에 대한 결과값을 출력하십시오
	단, 해당 결과값이 100이하일 경우 
	출력메세지 "100이하의 결과값입니다"라고 설정하시고
	100이상일 경우 "해당 값은 100이상 결과값 입니다" 라고 출력합니다
	*/

}
