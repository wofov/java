/*
 Exception / try랑 catch랑 함께 사용 한다. 
 runtime exception (error 발생시 예외처리 체크를 안함) null class arraysize
 other exception (예외처리 체크사항 모두함)
 exception[종류]
 arithmetic :0으로 나눌때 발생
 NullPointer :null 객체를 참조할때
 ClassCast :클래스형 변환
 numberFormat:숫자형으로 변환
 arrayindexOutOfBound : 배열 참조시 인덱스 번호 오류 .
 IOException: 입출력 문제 발생
 exception : 전체 예외처리 현왕 
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b="c1";
		try {
			a= Integer.valueOf(b);
		}catch(Exception z){
			System.out.println(z);
		}
		finally {//예외발생시 catch발생 후 finally 출력 
			b = b.replaceAll("[a-z][A-Z]", " ");
			a = Integer.valueOf(b);
			
		}
		System.out.println(a);
	}

}
