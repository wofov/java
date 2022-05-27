
public class While1 {

	public static void main(String[] args) {
		int a= 1;//while 시작값
		while(a<11) { // while 범위값,종료값
			//System.out.print(a+",");
			a++; //증가 or 감소
			
		}
		int b = 10;
		while(b>4) {
	   // System.out.print(b+",");
	    b--;
		}
		//응용문제 다음 사항을 while문으로 작성하시오
		//22부터16까지 출력하시오
		int aa=22;
		while(aa>15) {
			//System.out.print(aa+",");
			aa--;
		}
		int a1 = 1;//초기값
		int b1 = 10;//종료값
		while(a1<=b1) {//반복문범위
			//System.out.printf("%d ", a1);
			a1++;//증가
		}
		/*
		 응용문제 변수 2개를 이용하여 범위에 맞게 값을 출력하시오
		 99부터 47까지 출력
		 */
		int aaa = 99;
				int bbb = 47;
				while(aaa>=bbb) {
				System.out.printf("%d ", aaa);
				aaa--;
				}
	}

}
