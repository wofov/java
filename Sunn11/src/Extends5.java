import java.util.Scanner;

public class Extends5 {

	public static void main(String[] args) {
		/*
		 extends를 사용하여 다음 결과에 대한 코드를 작성하세요
		 숫자 두개를 입력합니다.
		 두 개의 숫자를 확인하여 다음과 같이 체크 합니다. 
		 첫번째 숫자가 두번째 숫자보다 작을 경우
		  첫번째 숫자가 두번째 숫자보다 클 경우
		   첫번째 숫자가 두번째 숫자 동일
		   
		   
		   작을 경우 : 해당 두개의 값을 합친 결과 출력
		   클 경우 : 해당 범위 만큼 숫자를 모두 더한 결과 값을 출력
		   같은 경우 : 해당 값이 같다
		 */
		Scanner sc  = new Scanner(System.in);
		q2 num = new q2();
		System.out.println("첫번째 숫자는?");
		int a = sc.nextInt();
		System.out.println("두벗째 숫자는?");
		int b = sc.nextInt();
		num.point1(a,b);
		num.point2();
		sc.close();
	}
}
class q1{
	protected String re;
	protected int aa,bb;
	protected int total = 0;
	public void point1(int a1, int b1) {
		this.aa = a1;
		this.bb = b1;
		if(this.aa<this.bb) {
			this.re = "1번";
		}
		else if (this.aa>this.bb){
			while(this.aa>=this.bb) {
				this.total +=this.aa;
				this.aa --;
			}
			this.re = "2번";
		}
		else {
			this.re = "3번";
		}
	}
}
class q2 extends q1{
	public void point2() {
		if(this.re=="1번") {
			System.out.println(this.aa+this.bb);
		}
		else if(this.re=="2번") {
			System.out.println(this.total);
		}
		else {
			System.out.println("같다");
		}
	}
}