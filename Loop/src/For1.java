
public class For1 {

	public static void main(String[] args) {
		//반복문 : 데이터를 일괄적으로 입, 출력을 할 수 있도록 하는 문법
		for(int a=0; a<10; a++) {//for(초기값; 범위값; 증가or감소) {} 마지막 조건에는 세미콜론x
			//System.out.println(a);
		}
		int z = 1;
		// z++; 출력 후 1증가, z--; 1감소
		// ++z; 이미 1증가 그 다음 출력
	//	System.out.println(z);
		
		int b;
		for(b=5;b<11;b++) {
			//System.out.println(b);
		}
		int c;
		for(c=10;c>3;c--) {//주의사항 0 ~ 음수 까지 적어버리는 상황 조심
		//System.out.println(c);
		}
		int d;
		for(d=20;d<28;d++) {
			//System.out.println(d);
		}
		//39~21
		int a1;
		for(a1=39;a1>20;a1--) {
			//System.out.print(a1);
		}
		//1~10까지 숫자 출력
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
		//	System.out.println(aa);
		}
	    //변수2개를 이용하여 다음페이지 출력
		//55~4 까지 출력
		int aa1;
		int bb1 = 4;
				for(aa1=55;aa1>=bb1;aa1--) {
					System.out.print(aa1);
				}
	}
}

