package Ab2;

public class _app {

	public static void main(String[] args) {
//		members mb =new members();//�ڽ� > �ڽ�
//		mb.opp();
//		mb.opp2();
//		app_data2 ap = new members();//�θ� > �ڽ� �������̽��� �������� ����� �������̵常 ȣ���(����ȯ)
//		�������̽� ����
//		ap.opp();
//		ap.opp2();
		//ap.opp3();>�̰� ȣ�� �ȵ�
		members mb =new members();//�ڽ� Ŭ���� ����
		mb.opp3();
		
		app_data2 ap = mb;//Ŭ�������� �������̽� ����
		members mb2 = (members)ap;//�ڽ� Ŭ�������� �������̽� �纯��
		mb2.opp(); 
	}

}
/*
class members implements app_data1{
	app_data1�� ������ �ڷ��� �����ϴ� ��� 
}
*/
class members implements app_data2{
	@Override
	public void opp() {
		System.out.println("te2");
		
	}
	@Override
	public void opp2() {
		System.out.println("te3");

	}
	public void opp3() {
		System.out.println("te4");
	}
}