
public class Sun1 {

	public static void main(String[] args) {
		inherit2 ih2 = new inherit2();
		ih2.it("ȫ�浿", "aaa5");
		ih2.print();
	}
}
class inherit1{
	private String nm;//inherit1 �ش� �κп����� �۵�
	protected String pw;//inherit1, inherit2���� ��� �۵� �ǵ��� �Ͽ�, �ܺο��� �ε� ����
//	public String pw2; > �������� �� ��밡��. 
//	public String aa = nm; // �̰� ���� ����Ǳ� ������ ȫ�浿�� �ƴ�.
	static String aa;//private���� ���� �κ��� inherit2������ ����� �� �ֶǷ� �ϴ°�
	
	public void it(String d1,String d2) {
		this.nm =d1;
		this.pw =d2;
		this.aa=this.nm;
		
		
	}
	
}
class inherit2 extends inherit1{
	public void print() {
//		System.out.println(this.nm+""+this.pw); > ���� �ȵ�
		System.out.println(this.aa+""+this.pw);
	}
	
	
}