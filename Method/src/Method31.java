
public class Method31 {

	public static void main(String[] args) {
		/*
		응용문제
		다음 숫자 하나를 해당 메소드로 전달 하게 됩니다.
		해당 메소드에서는 다음과 같이 처리 합니다.
		숫자 3을 전달하면 3*1 ~ 3*9까지 모든 결과값을 더하여
		sysout으로 출력하세요
		 */

		tr aa = new tr();
		int cc = aa.point(3);
		System.out.println(cc);
	}

}
class tr{
	public int point(int b) {
		int b1 = 1;
		int total = 0;
		do {
			total += b*b1;
			b1++;
		}while(b1<10);
		return total;//return 사용시 절대 반복문 안에 적용하면 안됩니다.
		//또한 조건문이라도 더블로 return 사용 안됩니다.
//		if() {
//			return = "ok"; // msg = "ok"
//		}
//		else {
//			return = "nn"; // msg = "nn"
//		}
		//return msg; < 이렇게 이해 .
		/*
		 해당 메소드에 변수를 생성 후 족ㄴ에 맞는 값을 적용하여 최종적은 값을 return에 사용.
		 */
		// 더블 return >> 코드 인식은 되는데 잘 사용하지 않는다. 추가 조건이 생길때마다 리턴이 늘어나서 
		//비효율적이다. 그래서 사용하지 않는다.
	}
}
