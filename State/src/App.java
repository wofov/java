
public class App {

	public static void main(String[] args) {
		int a = 25+31*4+12;
		int b = 15*3+9+14;
		if(a < b) {
			System.out.println(a+"�� �� �۽��ϴ�");
		}
		else if(a >b) {
			System.out.println(b+"�� �� �۽��ϴ�");
		}
		else {
			System.out.println("����");
		}
		/*�ش� ���� 2������ ¦��, Ȧ���� Ȯ���ϱ� */
	    int c = b%2; // %��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ��µ�
	    if(c ==0) {
	    	System.out.println("¦���Դϴ�");
	    }
	    else {
	    	System.out.println("Ȧ���Դϴ�");
	    }
	}

}
