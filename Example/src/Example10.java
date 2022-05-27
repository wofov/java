import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 응용문제10
		 다음 이용약관에 대한 동의 프로그램을 제작
		 동의 항목은 전체 3가지
		 모두 true가 적용 되어야만 다음 프로세서로 진행
		 사용자에게 질문 되는 사항은 다음과 같다
		 "동의 항목에 동의 하시겠습니까?" 라는 메세지 출력
		 동의함(1), 동의안함(2)
		 동의 한목 중 한가지라도 동의하지 않을 경우 " 모두 동의 하셔야만 진행" 출력
		 모두 동의 햇을때 "회원가입 완료" 라고 출력
		 */
		/*Scanner sc = new Scanner(System.in);
		int a=1;
		int b=1;
		int aa;
		while(a<4) {
			System.out.println("동의 하시겠습니까? 동의함(1), 동의안함(2)");
			aa = sc.nextInt();
			if(aa==1) {
				b++;
			}
			else {
				System.out.println("모두 동의 하셔야만 진행가능");
				b--;
				break;
			}
			a++;
		}
		if(a==b) {
			System.out.println("회원가입 완료");
		}*/
		Scanner sc = new Scanner(System.in);
		int w =1 ;
		int argee;
		boolean all_agree = false;
		do {
			System.out.println("동의 항목에 동의하시겠습니까? 동의함(1), 동의함(2)");
			argee = sc.nextInt();
			if(argee==1) {
				all_agree = true;
			}
			else {
				all_agree = false;
				break;
			}
			w++;
		}while(w<=3);
		if(all_agree==false) {
			System.out.println("모두 동의 하셔야만 진행 됩니다");
		}
		else {
			System.out.println("회원가입 완료");
		}
		
		
		
		
		

	}

}
