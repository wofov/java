
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit(���)
		/*
		 ���� �θ� Ŭ������ construct �ι��� �μ����� �ۿ��ϸ�
		 �ڽ� Ŭ�������� �ε带 ���ϴ� ������ �߻���
		 ��, �ڽ� Ŭ�������� �μ����� �����ϸ� construct�� ����Ҽ�����.
		 */

		//mth1 m1 = new mth1();
		mth2 m2= new mth2(2);
		
	}

}
class mth1{
	public int no;
	public mth1(/*int z*/) {// > �μ��� ����
		this.no=20;
		System.out.println("mth1");
	}
//	class mth1{
//		public int no;
//		public mth1() {// 
//			this.no=20; > �̰Ŵ� ������
//			System.out.println("mth1");
//		}
}
class mth2 extends mth1{
	public mth2(int a) {//>>������ �ڽ��� �μ��� ����
		
		System.out.println("mth2");
	}
}