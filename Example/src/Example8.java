import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 응용문제 8
		 사용자 패스워드는 a1234 입니다
		 사용자가 패스워드를 입력합니다. 단, 3회 이상 실패시 다름과 같이 출력
		 패스워드 횟수 제한으로 가까운 지점에 방문하셔야합니다
		 단, 패스워드가 맞을경우 로그인 되었습니다 라고 출력
		 */
		/*Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요");
        int b=1;	
        String a;
		while(b<4) {
			a = sc.next();
			if(a.equals("a1234")) {
				System.out.println("로그인 되었습니다");
				break;//반복문에서 강제 종료 할 수 있는 코드
			}
			else if(b==3) {
				System.out.println("패스워드 횟수 제한으로 가까움 지점에 방문하세요");
			}
			else {
				System.out.println("재입력 해주세요");
			}
			b++;
		}*/
		final String pw = "a1234";
		int c = 3;
		Scanner sc1 = new Scanner(System.in);
		int w = 0 ;
		String msg ="패스워드를 입력해 주세요";
		while(w<3) {
			System.out.println(msg);
			String userpw=sc1.next();
			if(pw.equals(userpw)) {
				System.out.println("로그인 성공");
				break;
			}
			else {
				msg="올바른 패스워드를 넣어주세요";
				c--;
				if(c==0) {
					System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다");
				}
			}
			w++;
		}
	
		

	}

}
