import java.util.Random;
import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		/*
		 * A파트 pc랜덤 Scanner(5번)
		 * b파트 pc에서 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과 처리
		 * 업다운게임
		 기회는 5번
		1. pc가 숫자를 하나 고른다 =랜덤 1~10
		2. 총 기회는 x번 남았습니다. 1~10까지 번호중 하나의 번호를 입력하세요
		3.만약에 pc가 7을 뽑앗다 사용자 숫자와 비교
		pc 7 사용자 2 > 결과 up 
		4.총 기회는 x번 남았습니다. 1~10까지 번호중 하나의 번호를 입력하세요
		5.정답시 정답입니다. 출력 후
		모든 프로세서 정지
		System.exit
		 */
		example2 game = new example2();
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int aaa = r.nextInt(9)+1;
		int b1=5;
		String msg1 = "";
		while(b1>0) {
			System.out.println("기회"+b1+"번 , 1~10까지 숫자 입력하세요");
			int user = sc.nextInt();
			int aa =game.user_new(user,aaa);
			if(aa==11) {
				msg1 = "다운, 기회 "+(b1-1);
			}
			else if(aa==22) {
				msg1 = "업, 기회 "+(b1-1);
			}
			
			else  {
				System.out.println("정답");
				System.exit(aa);
			}
			System.out.println(msg1);
			b1--;
		}
		sc.close();
		
		
	
		
		
		
		
		
	}

}
