import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		/*
		응용문제 {"햄버거","피자","치킨","커피"}
		주문하고자 하는 음식을 선택하세요 < 질문
		해당 질문을 총 4번 물어봅니다
		단, "주문종료"라고 입력시 즉시 주문 종료되며,
		주문내역을 출력.
		 */
		//빈 배열 변수에 데이터가 있는 배열로 커스텀 방법
		int a[] = new int[2];//3개의 공간만 제공함 (0, 1, 2)
		int b[] = {1,2,3,4,5,6,7};//7개의 객체가 있는 상황
		int ea = b.length;//b 배열 안에 몇개의 데이터가 있는지.
		int ee = a.length;
		int w = 0 ;
		int ct = 0 ;
		while(w<ea) {
			//System.out.println(b[w]);
			// && ct<ee ★★★★ 조건 변경시 확인하기
			if(b[w]%2==0 && ct<ee) {// if(b배열)의 값중 짝수만 && 새로운 a 배열에 전체 객체크기 만큼만
				a[ct] = b[w];
				ct++;//조건만 맞을시 인덱스 번호를 +1씩 증가시킴 
			}
			w++;
		}
		System.out.println(Arrays.toString(a));

	}

}
