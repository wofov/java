
public class Example6 {

	public static void main(String[] args) {
		/*
		 응용문제6
		 1~10까지 순차적으로 적용하는 반복문이 있습니다.
		 단, 1부터 5까지는 모든 값을 곱하고 6부터 10까지는 모든 값을 더합니다
		 해당 두 개의 값을 비교하여 뭐가 큰지 결과를 출력하세요
		 */
		int a;
		int total = 1;
		int total2 = 0;
		for(a=1;a<11;a++) {
			if(a<6) {
				total *= a;
			}
			else {
				total2 +=a;
			}
		}
		if(total>total2) {
			System.out.println("더한 값이 더 큽니다");
		}
		else {
			System.out.println("곱한 값이 더 큽니다");
		}
		int b=1;
		int a1=1;
		int a0=0;
		/*while(b<11) {
			if(b<6) {
				a1 *= b;
			}
			else {
				a0 += b;
			}
			b++;
		}*/
		do {
			if(b<6) {
				a1 *= b;
			}
			else {
				a0 += b;
			}
			b++;
		}while(b<11);
		if(a1>a0) {
			System.out.println("더한 값 큼");
		}
		else {
			System.out.println("곱한 값 큼");
		}

	}

}
