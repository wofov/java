package example;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		 배열+기본(클래스)메소드 문제
		 product : 수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고
		 중에 참외, 배, 키위를 삭제
		 해당 삭제 후 배열을 다시 리스트 출력하세요
		 단, 해당 처리사항은 모두 별도 메소드에서 처리
		 반복문 자유
		 */
		String lists1[] = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
		
        ppl(lists1);
	}
	public static void ppl(String a[]) {
		int aa = a.length;
		String lists2[] = new String[aa];
		int idx = 0;
		for(String p : a) {
			if(!p.equals("참외")&&!p.equals("배")&&!p.equals("키위")) {
                lists2[idx]=p;

			
				idx++;
			}
			
		}
	
		System.out.println(Arrays.toString(lists2));
		
	}

}
