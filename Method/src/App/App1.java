package App;

public class App1 {
	//app��� �⺻ ���� class�̸�, abox,main�� ������ ����

	public static void main(String[] args) {
		//method11���� �ε��� ��� �ش� �ܺ� blue Ŭ������ �ε��ϰ�
		//��� ����  method11�� �ε� �� �� �ֵ��� ��.
		blue b = new blue();
		System.out.println(b.box());

	}
	public void abox() {
		System.out.println("tt");
	}
//blue�� ������ �ܺ� class�̸�, method11���� �������� �ڵ鸵 �Ұ�
}
class blue{
	private String msg;
	public String box() {
		this.msg = "ȯ���մϴ�";
		return this.msg;
	}
}