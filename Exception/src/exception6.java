
public class exception6 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� ���� ����
		 �ܺ� Ŭ������ ���� �մϴ�. 
		 �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ����ó�� �ϰ�
		 Ȧ�� �� ��� Ȧ�����Դϴ� ��� �ٽ� ȸ�� �ǵ��� �մϴ�. 
		 */
		now n = new now();
		try {
			int a =45*3+16+5+22*8;
			System.out.println(a);
			String a1 = Integer.toString(a);
			String a4=n.nn(a1);
			System.out.println(a4);
		}catch(Exception e) {
			System.out.println("¦���� ����");
		}
	}
}
class now{
	
	public String nn(String a2) throws Exception{
		int a3 = Integer.valueOf(a2);
		String msg;
		if(a3%2==0) {
			throw new Exception();
		}
		else {
			msg="Ȧ���Դϴ�.";
			return msg;
		}
	}
}