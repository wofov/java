import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c;
		while(a<10) {
            c=b*a;
			//System.out.printf("%d ",c);
			a++;
		}
        /*
         응용문제 
         56,49,42,35,28,21
         */
		int a1;
		for(a1=8;a1>2;a1--) {
			//System.out.printf(a1*7+",");
		}
		int a2 = 8;
		while(a2>2) {
			//System.out.print(a2*7+",");
			a2--;
		}
		/*
		 응용문제 숙제2
		 다음 결과 값을 확인 하신 후 해당 결과값에 맞는 코드를 작성하세욧
		 4,7,10,13,16,19,22
		 */
		int c1 =1;
		int bb;
		while(c1<8) {
			bb=1+3*c1;
			//System.out.println(bb);
			c1++;
		}
		/*
		 응용문제1 조건문 코드 작성하기
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
		Scanner aa = new Scanner(System.in);
		int aaa = 100000;
		int aa3 = 0;
		System.out.println("1번 입력시 입금, 2번 입력시 출금입니다");
		String dd=aa.next();
		Scanner aa1 = new Scanner(System.in);
		int aa2;
		if(dd.equals("1번")) {
			System.out.println("해당 금액을 입력하세요");
			aa2 = aa1.nextInt();
			aa3 = aa2 + 100000;
		}
		else if(dd.equals("2번")) {
			System.out.println("해당 금액을 입력하세요");
			aa2 = aa1.nextInt();
			aa3 = 100000 - aa2;
		}
		else {
			System.out.println("다시입력하세요");
		}
		System.out.println("총 금액 "+aa3+"원 입니다");
		aa.close();
	}

}
