
public class Extends4 {

	public static void main(String[] args) {
		/*
		 응용문제
		 두 개의 값을 외부 클래스로 보냅니다.
		 해당 클래스에서 두 개의 값을 계산하게 됩니다. 
		 계산 형식을 다음과 같다.
		 3,10을 보내면 두개의 값을 합한다.
		 나머지 외부 클래스에서 해당 결과 값을 출력하면
		 두 개의 합 값이 짝수,홀수 인지를 출력하는 extends 구현
		 */

		num2 pp =new num2();
		pp.user(3, 10);
		pp.user2();
		
	}

}
class num1{
	protected int re;
	public void user(int a1, int b1) {
		this.re = a1 + b1;
		
		
	}
}
class num2 extends num1{
	public void user2() {
		if(this.re%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}
}