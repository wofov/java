import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2.lists2();//★★★static이 구별 // 메모리에서 로드
		Member2 mb2 =new Member2();//★★★static이 구별//Static이 없는 함수 이므로 객체 및 인스턴스를 생성
		mb2.lists();//★★★static이 구별 // 인스턴스에(메모리)에  있는 메소드를 로드하게 함.

		Member2.list3("유관순",12);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용 하실 구구단 숫자를 입력하세요");
		int aa2 =sc.nextInt();
		Member2.for_in(aa2);
		sc.close();
	}
	/*
	 응용문제 for_in 라는 일반 메소드(메모리)가 있습니다.
	 프로그램 실행시 다음과 같이 질문을 합니다.
	 "사용 하실 구구단 숫자를 하나 입력하세요"
	 [결과] 해당 메소드에서 결과를 출력해야함.
	 만약 사용자 3 입력시
	 3*1=3 ....... 3*9=27 출력 해야함
	 for문 사용하기
	 */

}
class Member2{
	public void lists() {//메모리 할당 x > 이건 로드 해야지만 사용 // 메모리 별도 할당 없이 메소드 함수만 선언
		String a="홍길동";
		System.out.println(a);
		
	}
	public static void lists2() {//메오리 올려놓고 마음대로 로드 
		
		String a="이순신";
		System.out.println(a);
		
	}
	
	public static void list3(String nm,int pw) {
		//nm을 메소드에서 전달 받는 값을 바로 사용할 경우 nm.equals("유관순")
		String user_name = nm;
		int user_pw=pw;
		//메소드에 객체 값을 첨부하여 로드 후 메소드 안에 별도의 필드명을 이용하여 전달 받는 형식
		//int user_point;
	    if(nm.equals("유관순")&& user_pw==12) {
	    	System.out.println("회원확인");
	    }
				
		System.out.println(nm);
		
	}
	  public static void for_in(int aa) {
			
			int aa3;
			
			for(aa3=1;aa3<10;aa3++) {
				
				System.out.printf("%d * %d = %d ",aa,aa3,(aa*aa3));
			}
		}
}