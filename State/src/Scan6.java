import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		//
		/*
		Scanner mid = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력하세요");//Alt키 방향키 위아래 줄바꿈
		String n = mid.next();//사용자가 아이디 입력
		Scanner mpass = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요");
		String p = mpass.next();
		if(n.equals("jung")||n.equals("su")) {
			if(n.equals("jung")&&p.equals("j1234")) {
				System.out.println("로그인 성공");
			}
			else if(n.equals("su")&&p.equals("ssh")) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("회원정보를 다시 확인하세요");
			}
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다");
		}*/
			
		
		Scanner mid = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력하세요");//Alt키 방향키 위아래 줄바꿈
		String n = mid.next();//사용자가 아이디 입력
		
		if(n.equals("jung")) { // 문자 기입시 == 말고 , equals 입력하기
			Scanner mpass = new Scanner(System.in);
			System.out.println("패스워드를 입력하세요");
			String p = mpass.next();
			if(p.equals("j1234")) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("회원정보 확인하세요");
			}
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다");
		}
	}

}
