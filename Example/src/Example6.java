
public class Example6 {

	public static void main(String[] args) {
		/*
		 ���빮��6
		 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
		 ��, 1���� 5������ ��� ���� ���ϰ� 6���� 10������ ��� ���� ���մϴ�
		 �ش� �� ���� ���� ���Ͽ� ���� ū�� ����� ����ϼ���
		 */
		int a;
		int total = 1;
		int total2 = 0;
		for(a=1;a<11;a++) {
			if(a<6) {
				total *= a;
			}
			else {
				total2 +=a;
			}
		}
		if(total>total2) {
			System.out.println("���� ���� �� Ů�ϴ�");
		}
		else {
			System.out.println("���� ���� �� Ů�ϴ�");
		}
		int b=1;
		int a1=1;
		int a0=0;
		/*while(b<11) {
			if(b<6) {
				a1 *= b;
			}
			else {
				a0 += b;
			}
			b++;
		}*/
		do {
			if(b<6) {
				a1 *= b;
			}
			else {
				a0 += b;
			}
			b++;
		}while(b<11);
		if(a1>a0) {
			System.out.println("���� �� ŭ");
		}
		else {
			System.out.println("���� �� ŭ");
		}

	}

}
