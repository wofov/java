import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		int num = 3;
		datalist da = new datalist();//static 없는 메소드 할당.
		da.array_data(num);
		String pay = "태우다";
		if(pay=="신용카드") {
			da.pay1();//해당 조건에 맞는 메소드를 호출
		}
		else {
			da.pay2(pay);//메소드에 객체값을 태워서 전달 (객체값은 무한대)
		}
		/*
		 응용문제 로드할 class명은 agrees
		 main 메소드에서 사용자가 "동의함","동의안함"을 입력하게됩니다.
		 동의함으로 입력 되었을 경우 "회원가입이 진행 됩니다"
		 동의안함 "동의를 하셔야 진행됩니다"
		 단,agrees클래스 안에 void 메소드 한개 또는 두개 선택
		 */
		agrees pm = new agrees();
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 진행합니까?");
		String user=sc.next();
		pm.www(user);
		
		sc.close();
	}

}
class agrees{
	public void www(String a) {
		//String msg;
		if(a.equals("동의함")||a.equals("네")) {//!a.equals("동의함") < 반댓말 즉, 동의안함이 출력됨 //else는 동의함 출력 
			System.out.println("회원가입이 진행");
			
			//msg = "진행";
		}
		else {
        	System.out.println("동의를 하셔야 진행");
			
			//msg = " 동의하세요"
		}
		//System.out.println(msg);
	}
}

class datalist{
	//static 메소드를 필요할 경우 : 여러 package에서 해당 메소드를
	//자주 사용해야 하는 부분에서는 Static를 이용하여 사용.
	//static 정적 메소드 : 오버라이딩을 사용할 수 없음
	//void 동적 메소드 : 오버라이딩 사용할 수 있음.
	/*
	 * 오버라이딩 예제
	 class a{
	 void 메소드
	 }
	 class b extend a {
	 void 메소드
	 }
	 */
	public void array_data(int a) {//static 없는 메소드 
		int w=1;
		while(w<10) {
			//System.out.println(a*w);
			w++;
		}
	}
	public void pay1() {
		//System.out.println("신용카드로 결제 진행");
	}
	public void pay2(String pm) {
		//System.out.println(pm+ " 결제 진행");
	}
}