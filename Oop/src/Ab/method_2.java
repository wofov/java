package Ab;
/*
 abstract�� interface ������ �� ������
 
 */
public class method_2 {
  //inter1,2 ���� �Ǿ� �ִ°�
	public static void main(String[] args) {

		loadinter ld = new loadinter();
		ld.setbox("ȫ�浿");
	}

}
//abstract�� �������̽� ��� static ��� �� �� ����. 
abstract class test{//abstract�� default�� ������� ����(public �⺻����)
	//�ʵ忡 �ڷ����� ������ �� ����.
	//inter�� �޼ҵ� �̹Ƿ� �ʵ��� �ڷ����� ���� �� �� ����. 
    public String nn;	
	public abstract void box();
	public void box2() {
		System.out.println("tt");
		this.nn="dd";
	}
}
class loadinter implements method_2re,method_2inter2{//���� ��
	//�������̽��� extends�� �θ� �������̽��� �ε��Ҽ��ֵ�. 
	@Override
	public String names() {
		return null;
	}
	
}