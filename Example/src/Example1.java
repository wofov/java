import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		 /*
		  응용문제 
		  while문으로 코드를 작성해야 하며, 프로세서는 다음과 같습니다.
		  사용자가 상품을 전체 선택하였습니다.
		  질문은
		  "7000 결제하시겠습니까?"라고 출력되며, 숫자 1이라고 
		  입력하면 최종결제 금액에 추가 되어 집니다.
		  총 질문 횟수는 4번
		  마지막에 최종 결제 금액이 나오도록 코드 작성
		  */
		Scanner sc = new Scanner(System.in);
        int j=1;
        int b = 7000;
        int total = 0;
        int a;
		while(j<5) {
			System.out.println("7000 결제 하시겠습니까? 1번은 추가 2번은 거부");
			a = sc.nextInt();
			
			if(a==1) {
				total = total + b;			
			}
			if(a==2) {
				//total = total + 0;
			}
			j++;
		}
		System.out.println("최종 결제 금액은 "+total+" 입니다");
		
		

	}

}
