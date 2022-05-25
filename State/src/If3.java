
public class If3 {

	public static void main(String[] args) {
		boolean a = true;//boolean :true, false로 구분
		//두 가지 중에 하나만 사용 가능
		if(a=true) {
			System.out.println("회원가입이 진행 됩니다");
		}
		else {
			System.out.println("이용약관에 동의하십쇼.");
		}
		
		String mid1 = "park";
		String mpass = "a1234";
		if(mid1.equals("park") && mpass.equals("a1234")) {
			//&& : 한 가지 조건 이상 모두 맞을 경우(2개)
			//|| : 한 가지 조건 이상에서 한 개라도 맞을 경우 
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("아이디 및 패스워드 확인하세요");
		}
		
	    if(mid1=="park"|| mid1=="kim") {
	    	//if(mid1=="park"|| mid1=="kim") :두 개중 하나만 맞아도 승인 
	    	System.out.println("회원확인");
	    }
	    else {
	    	System.out.println("확인된 아이디가 없습니다");
	    }
	    
	    
	}

}
