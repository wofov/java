import javax.imageio.metadata.IIOInvalidTreeException;

public class time3 {

	public static void main(String[] args) {
		/*
		try {
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		*/
		/*
		 ���빮��
		 �ܺ� class�� �ֽ��ϴ�. �� ���� Ŭ�������� �ش�
		 �ܺ� Ŭ������ �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 
		 8�ʵ��� �ε��� �߻��Ѵ� 
		 8�ʵ���"ó�����Դϴ�. ��ø� ��ٸ�����"
		 8������ return���� "�Ա��� ��� ó�� �Ǿ����ϴ�"���
		 ���ڸ� �޵��� �Ͻʽÿ�. 
		 */
		tt t1 = new tt();
		System.out.println(t1.uu());
	}
}
class tt{
	public tt() {
		try {
			System.out.println("ó�����Դϴ�. ��ø� ��ٸ�����");
//			int c=12/0;<�׳� �̻��� �� ���� ������ ���� ���µ�. 
			Thread.sleep(1000);
			uu();
		}catch(InterruptedException a) {
//			System.out.println(a); << ���������� �����°�
		}
	}
	public String uu() {
		return "�Ա� ó�� �Ϸ�";
	}
}
