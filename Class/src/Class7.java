
public class Class7 {

	public static void main(String[] args) {
		//Class�� �⺻ �޼ҵ� ��ü �ʵ尪 ����
		String mid ="ȫ";
		String name = "ȫ�浿";
		java1 jv1 = new java1(mid,name);
		//jv1.java2();
		

	}

}
class java1{
	//java1 class�� main���� ��ü���� �� �ν��Ͻ��� �����ϸ� �ٷ� �۵��ϴ� class �⺻ �޼ҵ� �Դϴ�
	public java1(String a, String b) {//�⺻�޼ҵ� ������ �ϸ� �̰� //class�� �⺻���� ����ϴ� �޼ҵ� class��� ����
		System.out.println(a+b);
		java2();//void �޼ҵ带 �ٷ� ȣ�� �� �� �ִ�.�ڡڡڡڡ�
	}
	public void java2() {
		System.out.println("tset");
		
	}
	
}