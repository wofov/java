
public class exception5 {

	public static void main(String[] args) {//���� ���� ��¸� ��. 
		try {
			words wd = new words();
			String re = wd.files(null);
			System.out.println(re);
		}catch(Exception a) {
			System.out.println("������ ������ �Ǿ� �� ���� �ȵ�");
			if(a.getMessage()!=null) {
				System.out.println(a);
			}
				
			}finally {//���̳� ������ try �ѹ��� 
				try {
					
					words wd2 = new words();
					String re2 = wd2.files("ȫ�浿");
					System.out.println(re2);
				}catch(Exception e1) {
					System.exit(0);
				}
			}

	}

}
class words{//���� �ް� ���� �� ����.
	public String files(String aa) throws Exception{
		if(aa==null||aa.equals("")) {
//			Exception ea = new Exception();
			throw new Exception("���� �������");
		}
		else {
			String msg = aa+"�� ȯ���մϴ�";
			return msg;
		}
	}
}