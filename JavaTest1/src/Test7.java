import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("� ������ ����� ǥ���ұ��?");
		String user = sc.next();
		String a[]= {"����", "��Ȳ", "���", "�ʷ�"};
		String msg = "";
		for(String z : a) {
			switch(user) {
			case "����" ->{ msg = "red";}
			case "��Ȳ" ->{ msg = "orange";}
			case "���" ->{ msg = "yellow";}
			case "�ʷ�" ->{ msg = "green";}
			default ->{msg = "�ش� �ܾ�� ������ ���� �ʽ��ϴ�";}
			}
		}
		System.out.println(msg);
		sc.close();
	}
}
