
public class If3 {

	public static void main(String[] args) {
		boolean a = true;//boolean :true, false�� ����
		//�� ���� �߿� �ϳ��� ��� ����
		if(a=true) {
			System.out.println("ȸ�������� ���� �˴ϴ�");
		}
		else {
			System.out.println("�̿����� �����Ͻʼ�.");
		}
		
		String mid1 = "park";
		String mpass = "a1234";
		if(mid1.equals("park") && mpass.equals("a1234")) {
			//&& : �� ���� ���� �̻� ��� ���� ���(2��)
			//|| : �� ���� ���� �̻󿡼� �� ���� ���� ��� 
			System.out.println("�α��� ����");
		}
		else {
			System.out.println("���̵� �� �н����� Ȯ���ϼ���");
		}
		
	    if(mid1=="park"|| mid1=="kim") {
	    	//if(mid1=="park"|| mid1=="kim") :�� ���� �ϳ��� �¾Ƶ� ���� 
	    	System.out.println("ȸ��Ȯ��");
	    }
	    else {
	    	System.out.println("Ȯ�ε� ���̵� �����ϴ�");
	    }
	    
	    
	}

}
