import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("on �Ǵ� off�� �Է��ϼ���");
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
