
public class Method31 {

	public static void main(String[] args) {
		/*
		���빮��
		���� ���� �ϳ��� �ش� �޼ҵ�� ���� �ϰ� �˴ϴ�.
		�ش� �޼ҵ忡���� ������ ���� ó�� �մϴ�.
		���� 3�� �����ϸ� 3*1 ~ 3*9���� ��� ������� ���Ͽ�
		sysout���� ����ϼ���
		 */

		tr aa = new tr();
		int cc = aa.point(3);
		System.out.println(cc);
	}

}
class tr{
	public int point(int b) {
		int b1 = 1;
		int total = 0;
		do {
			total += b*b1;
			b1++;
		}while(b1<10);
		return total;//return ���� ���� �ݺ��� �ȿ� �����ϸ� �ȵ˴ϴ�.
		//���� ���ǹ��̶� ����� return ��� �ȵ˴ϴ�.
//		if() {
//			return = "ok"; // msg = "ok"
//		}
//		else {
//			return = "nn"; // msg = "nn"
//		}
		//return msg; < �̷��� ���� .
		/*
		 �ش� �޼ҵ忡 ������ ���� �� ������ �´� ���� �����Ͽ� �������� ���� return�� ���.
		 */
		// ���� return >> �ڵ� �ν��� �Ǵµ� �� ������� �ʴ´�. �߰� ������ ���涧���� ������ �þ�� 
		//��ȿ�����̴�. �׷��� ������� �ʴ´�.
	}
}
