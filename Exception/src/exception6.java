
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
			int a =45*3+16+5+22*8+1;
			String re = n.nn(a);
			System.out.println(re);
//			System.out.println(a);
//			String a1 = Integer.toString(a);
//			String a4=n.nn(a1);
//			System.out.println(a4);
		}catch(Exception e) {
			if(e.getMessage()!=null) {
				
				System.out.println(e.getMessage());
			}
		}
	}
}
class now{
	
	public String nn(int a2) throws Exception{//�ڡڸ��� �ڷ����� String�̴��� �μ��� int �൵ �ȴ�. 
//		int a3 = Integer.valueOf(a2);
		String msg;
		if(a2%2==0) {
			throw new Exception("����ó�� ���� Ȯ��");
		}
		else {
			msg="Ȧ���Դϴ�.";
			return msg;
		}
	}
}