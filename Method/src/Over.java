
public class Over {

	public static void main(String[] args) {


		//pt p =new pt();
		//p.display();
		//p.display("���� ���� �� ���");
		cd c = new cd();
		c.display("���� ���");//�����ε�
		c.display();//�������̵�
		

	}

}/*
�����ε�(over loading) ���ο� �޼ҵ带 �����ϴ� ��.
�������̵�(over ride) �θ� Ŭ�������� ��� ���� ���� �޼ҵ带 ����ϴ� ���� ���մϴ�.
*/
class pt{
	
	public void display() {
		System.out.println("�ܺ� ���� ��");
	}
	
}
class cd extends pt{
	public void aaaa() {
		System.out.println("�ڽ�");
	}
			
	//�������̵� > �������̼� <ǥ��>���� �߻��� Ȯ�� (�������̵� ������ Ȯ��)
	public void display() {//�������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����");//�̰ŷ� �ٲ۴�
		//super.display();//���� ��µ��� �ʴ� �θ� Ŭ������ ��� 
		//�θ� ���� �Ӽ� �޼ҵ� ���� �����ö� ����մϴ�. �������̵�.
	}
	
	public void display(String msg) {//�����ε�
		System.out.println(msg);
	}
}