import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("on 또는 off를 입력하세요");
		String user = sc.next();
		if(user.equals("on")) {
			
			System.out.println("true");
		}
		else {
			
			System.out.println("false");
		}
		sc.close();

	}

}
