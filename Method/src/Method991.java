
public class Method991 {

	//���ڿ� ���Խ� �ڵ� 
	public static void main(String[] args) {
		//setter:����ڰ� �Է��� �� �Ǵ� ���� ���� �����ϴ� �޼ҵ�
		//getter:������ ��ģ�� �������� ���� ������ �޼ҵ�

		//replace : ġȯ ������ �Լ��Դϴ�.(���� �� ���ڿ� ����)
		//replaceAll : replace���� ���� ������ ġȯ������ �Լ�
		//�ڹٿ��� replace�� ����.
		String stt = "ȫ�浿�� ȯ���մϴ�";
		String stt2 = stt.replace("��","����");
		System.out.println(stt2);
		String mn = "ȫ �浿";
		String mn2=mn.replace(" ","" );//��������
		System.out.println(mn2);
		String nm3="�ڹٰ� ��¥ ����� �ڹٿ�";
		String rnm3=nm3.replaceAll("�ڹ�","java");//All���� Ȯ�� ����ϱ��
		System.out.println(rnm3);
	}

}
class met{
	private String user_name;
	private String user_pass;
	private String user_email;
	public met(String n, String p ,String e) {
		this.user_name = n;
		this.user_pass = p;
		this.user_email = e;
		
	}
}