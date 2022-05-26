
public class If_do_while1 {

	public static void main(String[] args) {
		/*
		 응용문제 구구단 6단 중에서 35이상 결과 숫자만 출력하시오
		 */
		
		int b=1;
		int total;
		do {
			total = b * 6;
			if(total>=35) {
				//System.out.println(total +" ");
			}
				b++;
		}while(b<10);
		/*
		 응용문제 14~27까지 숫자 중 짝수값만 모두 더하여 결과값을 출력하시오
		 */

		int total1 = 0;
		int a = 14;
		do {
			if(a%2==0) {
				total1 += a;
			}
			a++;
		}while(a<28);
		System.out.println(total1);
			

	}
	

}
