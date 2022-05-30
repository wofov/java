import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int date[] = {5, 10, 15, 20, 25, 30, 35};
		/*
		for each문을 사용할 때에는 인덱스 번호가 필요없이 사용할 경우★★
		for ~ do ~ while 를 사용할 때에는 인덱스 번호가 필요할 경우★★
		[0][1][2] : 인덱스 번호
		 */
		for(int f:date) {//int f가 순차적으로 date값을 순차적으로 받아서 저장.
			if(f%2==0) {
			//	System.out.println(f);
				
			}
		}
		/*
		String pay[] = {"무통장 입금", "신용카드", "휴대폰", "상품권", "쿠폰"};
		Scanner sc = new Scanner(System.in);
		System.out.println("결제하고자 하는 형태를 선택해주세요");
		String pm = sc.next();
		for(String z : pay) {//배열 데이터가 문자 이므로 받는 변수형태 또한 문자형을 사용해야함
			if(pm.equals(z)) {
				//System.out.println(pm+"로 결제 진행 합니다");
				if(z.equals("휴대폰")) {
					System.out.println("현재 점검으로 결제 불가");
				}
				else {
					System.out.println(pm+"로 결제 진행 합니다");
				}
			}
		
		}
		sc.close();*/
		
		/*
		응용문제 {"햄버거","피자","치킨","커피"}
		주문하고자 하는 음식을 선택하세요 < 질문
		해당 질문을 총 4번 물어봅니다
		단, "주문종료"라고 입력시 즉시 주문 종료되며,
		주문내역을 출력.
		 */
		String menu[] = {"햄버거","피자","치킨","커피"};
		Scanner sc; 
		String aa;
		int b;
		String odd = "";
		for(String a :menu) {
			System.out.println("주문하고자 하는 메뉴?");
			sc = new Scanner(System.in);
			aa = sc.next();
				if(aa.equals("햄버거")||aa.equals("피자")||aa.equals("치킨")||aa.equals("커피")) {
		            odd +=" "+aa;
				}
				else if(aa.equals("주문종료")) {
					break;
			}
		}
		System.out.println(odd);
		
		

	}

}
