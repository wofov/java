
public class exception7 {

	public static void main(String[] args) {

/*
 응용문제
 데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
 해당 데이터 값 중 문자 값만 출력 되도록 재 배열 하시오. 
 단, 메인에서는 해당 배열을 외부 클래스 세터 로 전송 합니다.
 해당 세터 에서 배열값을 확인하여 이름만 재배열로 생성합니다. 
 getter에서 해당 배열을 리털으로 보내도록 합니다.
 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
 */
		Object a1[]= {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
		se s = new se();
		s.setter(a1);
	}

}
class se{
	
	public void setter(Object a2) {
		
	
		try {
			
		}catch(Exception e) {
			
		}
	}
}