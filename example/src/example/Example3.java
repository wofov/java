package example;

public class Example3 {

	public static void main(String[] args) {
		/*
		 배열 기본 클래스 문제
		 a1 = {수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고}
		 a2 = {35000,8000,4000,5500,3800,4400,11000,18900}
		 장바구니에 해당 상품을 모두 담았다
		 단, 그 중 사과와 바나나는 제외하고 결제 금액
		 */
		String a1[]= {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
		int a2[]= {35000,8000,4000,5500,3800,4400,11000,18900};
		

		point(a1,a2);
		
		
	}
	public static void point(String b1[],int b2[]) {
//		int bb = b1.length;
//		int c=0;
//		int total = 0;
//		
//		for(String abc : b1) {
//			if(!abc.equals("사과")&&!abc.equals("바나나")) {
//				total += b2[c];
//				System.out.println(b1[c]);
//				//c++;
//			}
//	      
//			c++;
//		}
//		System.out.printf("총 결제 금액은 %d입니다",total);
		
		int ea = b1.length;
		int w = 0 ;
		int total2 = 0 ;
		while(w<ea) {
			if(!b1[w].equals("사과") && !b1[w].equals("바나나")) {
				total2 += b2[w];
			}
			
			w++;
		}
		System.out.println(total2);
	}

}
