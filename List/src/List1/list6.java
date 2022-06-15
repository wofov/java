package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		//문자와 숫자 배열 사용
		Scanner sc = new Scanner(System.in);

		ArrayList list = new ArrayList();//자료형이 없는 배열
		int w=0;
		while(w<5) {
			System.out.println("데이터를 입력해주세요");
			String user = sc.next();
			list.add(user);
			w++;
		}
		System.out.println(list);
		//숫자 입력값만 모두 더할꺼임 
		int ww=0;
		int total2=0;
		do {
			try {
				Object k = list.get(ww);
				//배열 자료가 숫자 문자 형태로 구성이 되어 있을 경우는 오브젝트 매게 타입으로 설정합니다.
				
				int numbers = Integer.parseInt(k.toString());
				//해당 매게타입을 문자화 하여 pareInt를 다시 검증함.
				total2 +=numbers;
				
			}catch(Exception a1) {//배열의 매게 타입이 숫자가 아닐 경우 예외상황 발생 
//				System.out.println("뀨");
			}
			
			ww++;
		}while(ww<list.size());
		Object a = list.get(2);
		System.out.println(a);
		System.out.println(total2);
	}

}
