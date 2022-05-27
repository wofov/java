
public class While_plus {

	public static void main(String[] args) {
		/*
		 5~10까지 더한 합계를 출력하세요
		 */
		int w =5;
		int total = 0;//산술 합계치를 누적시키는 변수값
		while(w<11) { // += -= *= %= /=
			total = total +w;
			w++;
		}
		System.out.println(total);
		
	    /*
	     3~8까지 곱한 총 합계를 출력하세요
	     */
		int a = 3;
		int total1 = 1;//곱하기 합계를 설정시 1 기본값으로 설정
	    while(a<9) {
	    	total1 = total1*a;
	    	a++;
	    }
	    System.out.println("총 합계는"+total1+"입니다");
	
	}

}
