
public class Method5 {

	public static void main(String[] args) {

		cab c =new cab();
//		c.d1 = "ȫ�浿";
//		cab.d1="�̼���";
//		c.d3 ="ȫ";
//		cab.data1(d3);
//		c.data2(d1);
//		cab.data1();
		//c.d2="������";private�� ������ ��ü �̹Ƿ� main class���� �ε� ����
		c.data2("������");
		
	}

}
class cab{
	String d1;//void �ڷ��� �޼ҵ� �ε� ����
	private String d2=null;
	public static String d3;//�� ��� ����
	public static void data1() {//static ������ private �ε� �Ұ�, static �ڷ��� �ܿ��� �ε� �Ұ�
		//���⼭�� this���Ұ�
		System.out.println(d3);
	}
    public void data2(String user) {
    	this.d2 =user;
    	data2(d3);
		System.out.println(this.d2);
	}
    public String data3() {
		String a=this.d2;
		//String a=null;
		return a;//�������� ���� �ѱ�°�
		
	}
	
	
}