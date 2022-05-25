
public class For_plus {

	public static void main(String[] args) {
		/*
		 1~10까지 모든 숫자를 합한 결과값을 출력하시오
		 */
		int f;
		int total =0;
		for(f=1;f<11;f++) {//total값에 반복값을 지속적으로 증가시킴
			//total=total+f;
			total +=f;
		}
		System.out.println("총 합계 "+total);
        //+-(더하기할당) -=(빼기할당) *=(곱하기할당) /=(나누기할당)
		//b=b-f; >> b-=f;
		/*응용문제
		 전체 값은 500이 있습니다.총 8회 동안 반복되면서
		 한번 반복할때마다 12씩 감소하도록 하여 최종 값을 출력하시오
		 */
		int a = 500;
		int b;
		int m =12;
		for(b=1;b<9;b++) {//for문 조건이 꼭 괄호 안에 안들어가도 된다.@@@@@
			a= a -m;
		}
		System.out.println(a);
		/*
		 응용문제3
		 구구단 2단 2*1 ~ 2*9 총 합계를 출력하시오.
		 정답 합계 90
		 */
	}

}
