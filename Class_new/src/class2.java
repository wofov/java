
public class class2 {

	public static void main(String[] args) {
		/*
		 ���빮�� ���� Ŭ���� �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�
		 Ŭ������ 2������ �ֽ��ϴ�.
		 �θ�Ŭ���� ���� mother
		 �ڽ�Ŭ���� ���� child
		 ���� Ŭ�������� mother�� ���� ����.
		 30 50 ���ڰ��� �����մϴ�
		 child���� �θ�Ŭ������ �ִ� ���� �޾� 2���� ���ڸ� ���� ���� ���
		 */

		mother m = new mother(30, 50);
		mother.child mm = m.new child();
		mm.mini();
	}

}
class mother{
	int a1, b1;
	public mother(int a, int b) {
		this.a1 = a;
		this.b1 = b;
		
	}
	class child{
//		int aa = mother.this.a1;
//	    int bb =  mother.this.b1;
		public void mini() {
//			int cc= this.aa*this.bb;
			int nn =mother.this.a1 * mother.this.b1;
			System.out.println(nn);
		}
		
	}
}