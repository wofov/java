import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		int num = 3;
		datalist da = new datalist();//static ���� �޼ҵ� �Ҵ�.
		da.array_data(num);
		String pay = "�¿��";
		if(pay=="�ſ�ī��") {
			da.pay1();//�ش� ���ǿ� �´� �޼ҵ带 ȣ��
		}
		else {
			da.pay2(pay);//�޼ҵ忡 ��ü���� �¿��� ���� (��ü���� ���Ѵ�)
		}
		/*
		 ���빮�� �ε��� class���� agrees
		 main �޼ҵ忡�� ����ڰ� "������","���Ǿ���"�� �Է��ϰԵ˴ϴ�.
		 ���������� �Է� �Ǿ��� ��� "ȸ�������� ���� �˴ϴ�"
		 ���Ǿ��� "���Ǹ� �ϼž� ����˴ϴ�"
		 ��,agreesŬ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ� ����
		 */
		agrees pm = new agrees();
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ������ �����մϱ�?");
		String user=sc.next();
		pm.www(user);
		
		sc.close();
	}

}
class agrees{
	public void www(String a) {
		//String msg;
		if(a.equals("������")||a.equals("��")) {//!a.equals("������") < �ݴ� ��, ���Ǿ����� ��µ� //else�� ������ ��� 
			System.out.println("ȸ�������� ����");
			
			//msg = "����";
		}
		else {
        	System.out.println("���Ǹ� �ϼž� ����");
			
			//msg = " �����ϼ���"
		}
		//System.out.println(msg);
	}
}

class datalist{
	//static �޼ҵ带 �ʿ��� ��� : ���� package���� �ش� �޼ҵ带
	//���� ����ؾ� �ϴ� �κп����� Static�� �̿��Ͽ� ���.
	//static ���� �޼ҵ� : �������̵��� ����� �� ����
	//void ���� �޼ҵ� : �������̵� ����� �� ����.
	/*
	 * �������̵� ����
	 class a{
	 void �޼ҵ�
	 }
	 class b extend a {
	 void �޼ҵ�
	 }
	 */
	public void array_data(int a) {//static ���� �޼ҵ� 
		int w=1;
		while(w<10) {
			//System.out.println(a*w);
			w++;
		}
	}
	public void pay1() {
		//System.out.println("�ſ�ī��� ���� ����");
	}
	public void pay2(String pm) {
		//System.out.println(pm+ " ���� ����");
	}
}