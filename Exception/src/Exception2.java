
public class Exception2 {

	public static void main(String[] args) {
		

		try {
			Exception2 ex =new Exception2();
			String a= "ȫ�浿2";
			ex.test(a);
		}catch(Exception z) {
			System.out.println(z);
		}

	}
	public void test(String b) throws Exception,NumberFormatException{
		//throw�� main�޼ҵ忡�� ����ó�� ���� �ش� �޼ҵ带 ȣ�� �� ��츦 ���� ����. 
		//test�� main���� �ҷ����� throws Exception�� 
		//�ۼ��߱� ������ ���ο��� ���ܹ��� ������ ��� �ȵ� 
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c=new Exception();
		System.out.println("te");
		throw c;//����ó�� ����� ���� ���� main�޼ҵ�� �ٽ� return��Ŵ
		//throw �ڵ� �ǹؿ� ����� �ϸ� throw +return�� ����� ������ ����
	}
}
