import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 ���빮�� 8
		 ����� �н������ a1234 �Դϴ�
		 ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� �ٸ��� ���� ���
		 �н����� Ƚ�� �������� ����� ������ �湮�ϼž��մϴ�
		 ��, �н����尡 ������� �α��� �Ǿ����ϴ� ��� ���
		 */
		/*Scanner sc = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���");
        int b=1;	
        String a;
		while(b<4) {
			a = sc.next();
			if(a.equals("a1234")) {
				System.out.println("�α��� �Ǿ����ϴ�");
				break;//�ݺ������� ���� ���� �� �� �ִ� �ڵ�
			}
			else if(b==3) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼ���");
			}
			else {
				System.out.println("���Է� ���ּ���");
			}
			b++;
		}*/
		final String pw = "a1234";
		int c = 3;
		Scanner sc1 = new Scanner(System.in);
		int w = 0 ;
		String msg ="�н����带 �Է��� �ּ���";
		while(w<3) {
			System.out.println(msg);
			String userpw=sc1.next();
			if(pw.equals(userpw)) {
				System.out.println("�α��� ����");
				break;
			}
			else {
				msg="�ùٸ� �н����带 �־��ּ���";
				c--;
				if(c==0) {
					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�");
				}
			}
			w++;
		}
	
		

	}

}
