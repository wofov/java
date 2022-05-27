
public class Do_plus {

	public static void main(String[] args) {
		/*
		 do-while
		 30부터 35까지 합계치 출력하시요
		 */
		int a = 30;
		int total = 0;
		do {
			total = total + a;
			a++;
		}while(a<36);

		//System.out.println(total);
	
		
		/*
		 응용문제
		 합계 숫자 189가 있다 
		 단 1~10까지 합계치와 현재 189를 뺀 총 합계를 구하세요
		 */
		int aa =2;
		int to = 0;
		do {
			to += aa;
			aa++;
		}while(aa<20);
			System.out.println(to);
			int aa1 =1;
			int to1 = 0;
			do {
				to1 += aa1;
				aa1++;
			}while(aa1<11);
				System.out.println(to1);
				
				System.out.println(to-to1);
				
				int a3 =1;
				int t3 = 189;
				do {
					t3 -= a3;
					a3++;
				}while(a3<11);
					System.out.println(t3);
	}

}
