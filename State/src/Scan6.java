import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		//
		/*
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���");//AltŰ ����Ű ���Ʒ� �ٹٲ�
		String n = mid.next();//����ڰ� ���̵� �Է�
		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���");
		String p = mpass.next();
		if(n.equals("jung")||n.equals("su")) {
			if(n.equals("jung")&&p.equals("j1234")) {
				System.out.println("�α��� ����");
			}
			else if(n.equals("su")&&p.equals("ssh")) {
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���");
			}
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�");
		}*/
			
		
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���");//AltŰ ����Ű ���Ʒ� �ٹٲ�
		String n = mid.next();//����ڰ� ���̵� �Է�
		
		if(n.equals("jung")) { // ���� ���Խ� == ���� , equals �Է��ϱ�
			Scanner mpass = new Scanner(System.in);
			System.out.println("�н����带 �Է��ϼ���");
			String p = mpass.next();
			if(p.equals("j1234")) {
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("ȸ������ Ȯ���ϼ���");
			}
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�");
		}
	}

}
