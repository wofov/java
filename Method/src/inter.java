/*
extends : �ڽ� Ŭ�������� �ϳ��� �θ� �ε�
implements �ڽ� Ŭ�������� �������� �θ� �ε�(��, �������̼� ������ ���)

 */



public class inter implements ime1,ime2{

	@Override
	public void c1() {
		System.out.println(names);
		System.out.println("�������̽�_1");
	}
	@Override
    public void c2() {
		System.out.println("����2");
	}
	public static void main(String[] args) {
		inter it = new inter();
		it.c1();
		it.c2();
		

	}

}
