
public class If_for2 {

	public static void main(String[] args) {
		//1~100���� ���� �� 80�̻��� ���ڸ� ���
		int f;
		for(f=1;f<101;f++) {
			if(f>79) {
				//System.out.print(f+" ");
			}
		}
		//200~300 ���� �� 240 ������ ���ڸ� ����Ͻÿ�
		int a;
		for(a=200;a<301;a++) {
			if(a<241) {
				//System.out.print(a+" ");
			}
	
		}
		final int b=3;
		int w;
		for(w=1;w<11;w++) {
			if(w%b == 0) {
				//System.out.printf("%d ", w);
			}//
			
		}
		//���빮�� ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10 �̻� ���ڸ� ����Ͻÿ�
		final int aa = 2;
		int bb;
		int cc;
		for(bb=1;bb<10;bb++) {
			cc = aa*bb;
			if(cc>9) {
				//System.out.println(cc);
			}
	  
		}
		/*
		 ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�
		 18, 36, 54, 72
		 */
		final int a1 = 9;
		int b1;
		int c1;
		for(b1=1;b1<10;b1++) {
			c1= b1 * a1;
			if(c1%18==0) {
				//System.out.print(c1+" ");
			}
		}
		/*
		 ���빮�� ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �Է��ϼ���
		 1~20 ������ ���� �Դϴ�
		 6 14 17 19
		 */
		int z;
		for(z=1;z<21;z++) {
			if(z==6||z==14||z==17||z==19) {
				System.out.print(z+" ");
			}
		}
		

	}

}
