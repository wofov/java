
public class Double_loop3 {

	public static void main(String[] args) {
		/*
		 응용문제
		 다음 결과 값이 출력 되도록 for문 작성.
		 5+2=7
		 5+3=8
		 5+4=9
		 5+5=10
		 6+2=8
		 6+3=9
		 6+4=10
		 6+5=11
		 7+2=9
		 7+3=10
		 7+4=11
		 7+5=12
		 ...9+5=14
		 */
		int a,b,c;//★★★코드 줄이기 이것만 보고 풀지마셈
		
		for(a=5;a<10;a++) {
			for(b=2;b<6;b++) {
				c=a+b;
			//	System.out.println(a+" + "+b+" = "+c);
			}
		}
		/*
		 응용문제 더블 while작성
		 */
		int aa=9;
		while(aa>6) {
			int bb=7;
			
					while(bb>4) {
						int cc=aa*bb;//★★계산 수식 안에 넣기 이것만 보고 안풀어도 됨
						//★★더블 while은 조건 꼭 안에 넣기 이것만 보고 안풀어도 됨
						//System.out.println(aa+" * "+bb+" = "+cc);
						bb--;
					}
			aa--;
		}
		/*
		 응용문제
		 결과값을 보고 do while문으로 제작하시오
		 
		 */
		int x =5;
		do {
			int y=4;
			do {
				System.out.println(x+"+"+y+"="+(x+y));
				y++;
			}while(y<8);
			x--;
		}while(x>2);
		
		
		

	}

}
