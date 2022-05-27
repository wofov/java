
public class Example4 {

	public static void main(String[] args) {
		/*
		 응용문제
		 다음 결과값에 맞춰서 코드가 출력 되도록 하세요
		 해당코드는 for문으로 작성
		 45 35 25 15 10
		 */
		int a;
		for(a=45;a>0;a--) {
			if(a==45||a==35||a==25||a==15||a==10) {
				System.out.print(a+" ");
			}
		}
		//다른방식
		int f;
		int v;
		for(f=9;f>1;f--) {
			v=f*5;
			if(f%2==1||f==2) {
				System.out.println(v +" ");
			}
		}
		
		
		
	}

}
