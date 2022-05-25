
public class If2 {

	public static void main(String[] args) {
	//mid1, mid2 _ hong, kim
		//String mid1, mid2;
		//mid1 = "hong";
		//mid2 = "kim";
		String mid1 = "hong";
		String mid2 = "kim";
		String mpass = "a123456";
		//공백도 하나의 문자
		/*
		 해당 조건문은 문자로 확인하는 조건형태 이며,
		 else문 이용하는 부분
		 */
		if(mid1.equals("hong")) {
			System.out.println("환영합니다");
		}
		else if(mid1=="park") {
			//추가로 비교대상이 있을 경우
			System.out.println("환영합니다");
		}
		else {
			System.out.println("가입되지 않은 사용자입니다");
		}
		/*
		 아이디 및 패스워드를 모두 검토하는 더블 조건문
		 */
		if(mid2=="kim") {//큰 if문
			if(mpass=="a123456") {//작은 if문
				System.out.println("로그인 됨");
			}
			else {
				System.out.println("패스워드가 틀립니다");
			}
		}
		else {
			System.out.println("가입되지 않은 사용자입니다");
		}
	}

}
