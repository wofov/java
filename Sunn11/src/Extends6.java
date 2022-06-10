import java.util.Scanner;

public class Extends6 {

	public static void main(String[] args) {
		/*
		 응용문제 
		 상품 가격은 42000 입니다.
		 사용자가 해당 상품 갯수를 입력 하게 됩니다.
		 해당 상품 가격에 맞는 갯수 만큼 곱하여
		 최종 결제 금액을 출력시키는 extends를 제작 하시면 됩니다.
		 단, 42000은 절대 숫자가 바뀌면 안됩니다.
		 사용자가 최대 구매 할 수 있는 갯수는 5개 입니당.
		 최종 결과 값은 main method에서 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하실 상품 갯수는?");
		int user = sc.nextInt();
		if(user>5) {
			System.out.println("최대 구매 할 수 있는 갯수는 5개입니다.");
		}
		else {
			ob2 c1 = new ob2();
			c1.na1(user);
			int re = c1.na2();
			System.out.println("구매하실 총 금액은 "+re+"원 입니다");
		}
		sc.close();
	}
}
class ob1{
	final private int ff = 42000;
	protected int zero;
	public void na1(int a1) {
		this.zero = a1 *this.ff;
	}
}
class ob2 extends ob1{
	public int na2() {
		return this.zero;
	}	
}