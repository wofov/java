import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	    System.out.println("�Է��� ������ �����ּ���!!");
	    //String memo = a.next();
	    //next()�� �����̽��� �Է� �������� ����
	    //nextline()�� �����̽��� ���� ��� �Է� ���
	    String memo = a.nextLine();
	    System.out.println(memo);
	    a.close();//Scanner ����, �⺻���� ���� ���־�� �մϴ�
	    
	    String a1 = "park";
	    int a2 = 22;
	    
	    //System.out.println(a1 + "���� ���̴�"+ a2 + "�Դϴ�");
	    //System.out.printf("%d���� ���̴� %d�Դϴ�.",a1,a2);
	    System.out.printf("%s���� ���̴� %s �Դϴ�.",a1,a2);
	    //printf : f��� ���� ������ ����.
	    //String, ���ڵ� ����(int) : %s
	    //int : %d
	    // �߿���� %f : float, double
	    // %t : date, time �ð�, ��¥
	    // %b : boolean ( true, false)
	              
	    
	    
	}

}
