
public class Method6 {

	public static void main(String[] args) {
		// private�� ���� ��ü ���� ����2
		

		insert i = new insert();
		String userid="hong";
		//i.userid="admin";��
		String skey ="a1234567";
		String result = i.checks(userid,skey);
		//String result = i.checks(skey);��
		System.out.println(result);
	}

}
class insert{
	//String userid=null;
	private String key=null;
	public String checks(String aa, String bb) {//String aa�����//�ش� Ŭ�������� ����Ǵ� key��
		this.key =bb;
		String msg = null;
		if(key=="a1234567") {//�ش� Ű��(private)�� �ܺ� Ŭ���� ���� �Ѿ���� �μ����� ��
			//������ ���̵� Ȯ�� 
			if(aa=="hong") {//aa��� userid��
				msg="������ Ȯ���߿� �ֽ��ϴ�.";
			}
			else {
				msg="�ش� �����Ͱ��� Ȯ�� ���� ���մϴ�";
			}
		}
		else {//�ܺ� Ŭ�������� �ùٸ� Ű���� ���޵��� ���� ���
			msg = "error";
		}
		return msg;//���� ����� ���� return���� ȸ����.
	}
}
