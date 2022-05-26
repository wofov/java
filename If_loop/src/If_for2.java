
public class If_for2 {

	public static void main(String[] args) {
		//1~100까지 숫자 중 80이상의 숫자만 출력
		int f;
		for(f=1;f<101;f++) {
			if(f>79) {
				//System.out.print(f+" ");
			}
		}
		//200~300 숫자 중 240 이하의 숫자만 출력하시오
		int a;
		for(a=200;a<301;a++) {
			if(a<241) {
				//System.out.print(a+" ");
			}
	
		}
		final int b=3;
		int w;
		for(w=1;w<11;w++) {
			if(w%b == 0) {
				//System.out.printf("%d ", w);
			}//
			
		}
		//응용문제 구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10 이상 숫자를 출력하시오
		final int aa = 2;
		int bb;
		int cc;
		for(bb=1;bb<10;bb++) {
			cc = aa*bb;
			if(cc>9) {
				//System.out.println(cc);
			}
	  
		}
		/*
		 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오
		 18, 36, 54, 72
		 */
		final int a1 = 9;
		int b1;
		int c1;
		for(b1=1;b1<10;b1++) {
			c1= b1 * a1;
			if(c1%18==0) {
				//System.out.print(c1+" ");
			}
		}
		/*
		 응용문제 다음 결과값을 보고 해당 값이 출력되도록 코드를 입력하세요
		 1~20 사이의 숫자 입니다
		 6 14 17 19
		 */
		int z;
		for(z=1;z<21;z++) {
			if(z==6||z==14||z==17||z==19) {
				System.out.print(z+" ");
			}
		}
		

	}

}
