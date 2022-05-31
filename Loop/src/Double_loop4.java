
public class Double_loop4 {

	public static void main(String[] args) {
		/*
		 응용문제 복합 반복문 for, do while //나중에 한번풀고 급할때는 넘겨 
		 */
		int f;
		for(f=2;f<4;f++) {
			int w=1;
					do {
						//System.out.println(f+"*"+w+"="+(f*w));
						w++;
					}while(w<10);
		}
		/*
		 응용문제 구구단 7~9단
		 단,각 구구단 곱셈 값은 5까지만
		 밖 do while 
		 안 while
		 *///
		int a=7;
		
		do {
			int b=1;
			while(b<6) {
				//System.out.println(a+"*"+b+"="+(a*b));
			//System.out.println(" %d * %d = %d ",a,b, total); ★이거 버릇들이기
				b++;
			}
			a++;
		}while(a<10);
		/* 이 문제는 꼭 해보기
		 응용문제 for-while문 코드 제작 
		 1*1
		 2*2
		 3*3..9*9 코드 출력 
		 */
		int aa;
		for(aa=1;aa<10;aa++) {
			//int bb=aa;
			//while(bb<=aa) <<이게 맞는 코드.
			while(aa<10) { // << 이건 때려맞춘 코드.
				System.out.println(aa+"*"+aa+"="+(aa*aa));
				aa++;
			}
		}
		/*
		 집에서 응용문제
		 더블 반복문 이용하기
		 밖 while
		 안 do while
		 1+1=2
		 2+1=3
		 2+2
		 3+1
		 3+2
		 3+3
		 4+1
		 4+2
		 4+3
		 4+4
		 */
		
		

	}

}
