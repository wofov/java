
public class Do_plus {

	public static void main(String[] args) {
		/*
		 do-while
		 30���� 35���� �հ�ġ ����Ͻÿ�
		 */
		int a = 30;
		int total = 0;
		do {
			total = total + a;
			a++;
		}while(a<36);

		//System.out.println(total);
	
		
		/*
		 ���빮��
		 �հ� ���� 189�� �ִ� 
		 �� 1~10���� �հ�ġ�� ���� 189�� �� �� �հ踦 ���ϼ���
		 */
		int aa =2;
		int to = 0;
		do {
			to += aa;
			aa++;
		}while(aa<20);
			System.out.println(to);
			int aa1 =1;
			int to1 = 0;
			do {
				to1 += aa1;
				aa1++;
			}while(aa1<11);
				System.out.println(to1);
				
				System.out.println(to-to1);
				
				int a3 =1;
				int t3 = 189;
				do {
					t3 -= a3;
					a3++;
				}while(a3<11);
					System.out.println(t3);
	}

}
