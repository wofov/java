
public class If_do_while1 {

	public static void main(String[] args) {
		/*
		 ���빮�� ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�
		 */
		
		int b=1;
		int total;
		do {
			total = b * 6;
			if(total>=35) {
				//System.out.println(total +" ");
			}
				b++;
		}while(b<10);
		/*
		 ���빮�� 14~27���� ���� �� ¦������ ��� ���Ͽ� ������� ����Ͻÿ�
		 */

		int total1 = 0;
		int a = 14;
		do {
			if(a%2==0) {
				total1 += a;
			}
			a++;
		}while(a<28);
		System.out.println(total1);
			

	}
	

}
