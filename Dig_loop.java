import java.math.BigInteger;

public class Dig_loop {

	public static void main(String[] args) {
		/*int a;
		int total = 0;
		for(a=1;a<101;a++) {
			total+=a;
		}
        System.out.println(total);*/
		
		/*1부터 100까지 곱한 값은?*/
		int f;
		//BigInteger : java에서 모든 무한의 값을 저장 할 수 있는 유일한 자료형입니다.
		BigInteger aa = new BigInteger("1");
		//합계에 사용할 자료형 변수 1을 최초값으로 설정
		//단, ""를 적용해야합니다.
		for(f=1;f<10;f++) {
			//multiply : 사칙연산 중 곱하기를 담당함.
			//add: 사칙연산 중 더하기를 담당
			//subtract: 사칙연산 중 빼기를 담당
			//divide: 사칙연산 중 나누기를 담당
			aa = aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
	}

}
