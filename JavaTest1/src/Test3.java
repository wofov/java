import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int user = sc.nextInt();
		String msg;
		if(user <= 60 && user > 0) {
			if(user%2 == 0) {
				msg="�Է��Ͻ� ���ڴ� ¦���Դϴ�.";
			}
			else {
				msg="�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.";
			}
		}
		else {
			msg="�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.";
		}
		System.out.println(msg);
		sc.close();

	}

}
