
public class Class1 {

	public static void main(String[] args) {//�Ϲ� main �Լ�
		Adata a = new Adata();//Adata class ���� �ε�
		Bdata b = new Bdata();//Bdata class ���� �ε�
		System.out.println(a.aa);//Adata Class���� aa��� ���� �ڷ��� ��ü���� ������
		System.out.println(b.aa);//Bdata Class���� aa��� ���� �ڷ��� ��ü���� ������
		
		Cdata c =  new Cdata();
		/*
		 Cdata�ȿ� ���� �ڷ����� ������ -> ���� �⺻�Լ��� ���� �Է��� �� ��ü ���� �޾�
		 ��� ������ ��� (�ν��Ͻ� ����)
		 */
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa + c.bb;
		System.out.println(c.cc);
		//System.out.println(c.cc);
	}

}

//aa�� ������ �ٸ� Ŭ������ �ֱ� ������ �ߺ������ʽ��ϴ�.
class Adata{
	
	String aa = "ȫ�浿";
}

class Bdata{
	String aa = "�̼���";
}
class Cdata{
	//�ش� Cdata�� �ִ� Ŭ���� ���� �ڷ����� ���� ������ �����մϴ�
	//��, ��� ������ �Լ��� ���� ��Ȳ�̹Ƿ� ���� �Ǵ� sysout�� ������� ����.
	int aa;//
	int bb;
	int cc;
}