package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*
		 응용문제
		 사용자가 숫자 금액을 입력합니다.
		 해당 숫자 금액 횟수는 총 8번 입니다. 
		 0~n 까지 입력 ..해당 입력이 모두 끝나면
		 최종 합계를 입력하세요
		 예시;; 입금할 금액을 적어주셈
		 */

		LinkedList<Integer> po = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int w =0;
		while(true) {
			System.out.println("입금할 금액 입력");
			String user =sc.next();
			try {
				int addm = Integer.parseInt(user);
				po.add(addm);
				
				int ea = po.size();
				w +=addm;
				System.out.println(po);
				if(ea>8) {
					break;
				}
				
			}catch(Exception a) {
				System.out.println("숫자만 입력하셈");
				break;
			}
//			w++;
		}
		System.out.println(w);
	}

}
