
public class Switch1 {

	public static void main(String[] args) {
		/*
		 swtich case : ���ù�
		 �Էµ� �� �������� case�� �ߵ� �Ͽ� ��� ���� ���� �ϰ� �˴ϴ�.
		 default�� case�� ���� �� ���� ������ �������� ���� ��� �����̴�.
		 swtich(���ڰ�)
		 */
		int n=3;
		switch(n) {
		case 1:
			System.out.println("�ɼ� 1�� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("�ɼ� 2�� �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("�ɼ� 3�� �����ϼ̽��ϴ�.");
			break;
        default:
        System.out.println("������ ���� �����ϴ�.");
        break;
		}
		
		String user = "�̼���";//���ڷ� switch���� ���ڰ� ����
		switch(user) {//���� case���� �Դϴ�
		case "�̼���":
		case "�� ����":
			System.out.println("a��");
			break;
		case "ȫ�浿":
			System.out.println("b��");
			break;
		case "������":
			System.out.println("c��");
			break;
			default:
				System.out.println("�������� d��");
				break;
		}

	}

}
