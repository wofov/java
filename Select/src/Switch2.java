import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 ���빮�� 
		 ����ڰ� ������ ���� ������ �޽��ϴ�.
		 1���� 5������ ���ڸ� �ϳ� �Է��ϼ���.
		 ���
		 1-5%���α�
		 2-10���α�
		 3,4-�ù�� ����
		 5-������ȸ
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5���� ���� �ϳ� �Է�");
        int a = sc.nextInt();
        String msg;//�ڡڡڡ� ġȯ
        /*
        switch(a) {
        case 1:
        	msg ="5%";
        	break;
        case 2:
        	msg ="10%";
        	break;
        case 3:
        case 4:
        	msg ="�ù�� ����";
        	break;
        default:
        	msg ="������ȸ��";
        	break;
        }*/
        /*
         switch version
         */
        switch(a) {
        case 1 ->{//14���� �̻� �츮�� ���� 17
        	msg ="5%";
        }
        case 2->{
        	msg ="10%";
        }
        case 3,4 ->{
        	msg ="�ù�� ����";
        }
        default ->{
        	msg ="������ȸ";
        }
        }
        System.out.println(msg);
        sc.close();
	}

}
