package Ab2;

public interface app_data1 {//

	String a="��������";//�ʵ忡 �ڷ����� ����ִ� ���� ����� ��� ���� ��ü�� �ȵ�.
	//������ ���� ���س�����.
	public void user_join();//���� ������ �޼ҵ�� this��� ����. 
	default void aaa() {
		System.out.println(this.a);//default������ this��� ���� 
	}
}
