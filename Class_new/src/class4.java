import java.util.ArrayList;
import java.util.Arrays;

public class class4 {

	public static void main(String[] args) {
		/*
		 �迭 ������ : ȫ�浿, �̼���,������
		 ���� class���� ���ڸ� �ϳ� �����Ѵ�. 
		 ��, ���ڰ� null�� �������� �ִ�. �迭 �����Ϳ� ���� ����
		 ������ �Է� �Ҽ��� �ִ�. 
		 �ܺ� Ŭ���� ���� data_list
		 �߻� Ŭ���� �� v_constuct
		 �ܺ� Ŭ���� �ȿ� �ڽ� Ŭ���� check
		 �����?
		 ���� Ŭ�������� �������� ������ ���
		 ���� Ŭ�������� �ش� ����ڰ� �ƴմϴ� ��� ���
		 
		 ���� Ŭ�������� �̼����� ������ ��� 
		 ����Ŭ�������� �ش� ����ڰ� �ִ�.
		 
		 ��, arraylist�迭�� �ε� �ض�. 
		 */

		data_list da = new data_list();
		da.sang("");
		data_list.check da2= da.new check();
		da2.name();
	}
}
abstract class v_constuct{
	public String user[];//���⼭ ���� ���ϰ� check Ŭ���� ���� �����ص� �˴ϴ�. 1��
	public String join;
	public abstract void sang(String a);
}
class data_list extends v_constuct{
	@Override
	public void sang(String a) {
		if(a==null) {//null�� equals��� �ȵȴ�.�ڡڡ�
			System.out.println("����� �̸��� �Է��ϼ���");
		}
		else {
			this.join=a;//���ڸ� ������������ valuOf���� �ϱ� 
			String jj[]= {"ȫ�浿", "�̼���", "������"};
			this.user=jj;
//			check ck = new check();�̷������ε� ȣ�� ���� //  static ���ο� �ִ��� �δ��� ���� ���� �̰� �ʿ�� �ϱ� 
			
		}
	}
	class check{
		String join =data_list.this.join;
//		String user[] = data_list.this.user;
		String user[]; //�̷������� 1�� // ��ü�� ������ ������ 
		//ArrayList<String> user_1 = null; 2�� //arraylist ��ƿ�� �ʵ忡 ���� �̰� ���� ��ü ������.
		public void name() {
			this.user = new String[]{"ȫ�浿", "�̼���", "������"};
//			this.user_1 =new ArrayList<>(Arrays.asList(this.user)); 2�� �̷������ε� ȣ�� ���� /
			//check���� user[]�� ��ü ���� �߱� ������ data_list. �ڵ� �ʿ� ���� 
			ArrayList<String> user_1 = new ArrayList<>(Arrays.asList(this.user));
			//data_list.this.user <�̷��� ��� ���ص� ��
			int w=0;
			boolean ok = false;
			while(w<user_1.size()) {
		     	if(data_list.this.join.equals(user_1.get(w))) {
					System.out.println("�ش� ����ڰ� �ִ�.0000");
					ok = true;
				}
				w++;
			}
			if(ok==false) {
				System.out.println("�ش� ����ڰ� ����.xxxx");
			}
		}
	}
}
