package Ab;
//inertface�� ���� ����� �޼ҵ常 ����,�߰��� ������ ó���ϴ� ������ default�� �߰���.

public interface method_2inter {//this, private �����ϱ� �����.

	//�ϳ��� �޼ҵ�� �ʵ� ���� ����. 
	public String names();//���� �޼ҵ� ���� 
	default void setbox(String name) {//setter
	
		System.out.println(name);
	}
	default String box3() {//getter
		
		//�������̽����� default�� �����ϸ� ���� �޼ҵ带 �����
		return null;
	}
}
interface method_2re extends method_2inter{
	//�������̽��� extends�� �θ� �������̽��� �ε��Ҽ��ֵ�. 
}