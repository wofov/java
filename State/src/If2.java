
public class If2 {

	public static void main(String[] args) {
	//mid1, mid2 _ hong, kim
		//String mid1, mid2;
		//mid1 = "hong";
		//mid2 = "kim";
		String mid1 = "hong";
		String mid2 = "kim";
		String mpass = "a123456";
		//���鵵 �ϳ��� ����
		/*
		 �ش� ���ǹ��� ���ڷ� Ȯ���ϴ� �������� �̸�,
		 else�� �̿��ϴ� �κ�
		 */
		if(mid1.equals("hong")) {
			System.out.println("ȯ���մϴ�");
		}
		else if(mid1=="park") {
			//�߰��� �񱳴���� ���� ���
			System.out.println("ȯ���մϴ�");
		}
		else {
			System.out.println("���Ե��� ���� ������Դϴ�");
		}
		/*
		 ���̵� �� �н����带 ��� �����ϴ� ���� ���ǹ�
		 */
		if(mid2=="kim") {//ū if��
			if(mpass=="a123456") {//���� if��
				System.out.println("�α��� ��");
			}
			else {
				System.out.println("�н����尡 Ʋ���ϴ�");
			}
		}
		else {
			System.out.println("���Ե��� ���� ������Դϴ�");
		}
	}

}
