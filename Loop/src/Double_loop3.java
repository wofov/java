
public class Double_loop3 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ���� ��� ���� ��� �ǵ��� for�� �ۼ�.
		 5+2=7
		 5+3=8
		 5+4=9
		 5+5=10
		 6+2=8
		 6+3=9
		 6+4=10
		 6+5=11
		 7+2=9
		 7+3=10
		 7+4=11
		 7+5=12
		 ...9+5=14
		 */
		int a,b,c;//�ڡڡ��ڵ� ���̱� �̰͸� ���� Ǯ������
		
		for(a=5;a<10;a++) {
			for(b=2;b<6;b++) {
				c=a+b;
			//	System.out.println(a+" + "+b+" = "+c);
			}
		}
		/*
		 ���빮�� ���� while�ۼ�
		 */
		int aa=9;
		while(aa>6) {
			int bb=7;
			
					while(bb>4) {
						int cc=aa*bb;//�ڡڰ�� ���� �ȿ� �ֱ� �̰͸� ���� ��Ǯ� ��
						//�ڡڴ��� while�� ���� �� �ȿ� �ֱ� �̰͸� ���� ��Ǯ� ��
						//System.out.println(aa+" * "+bb+" = "+cc);
						bb--;
					}
			aa--;
		}
		/*
		 ���빮��
		 ������� ���� do while������ �����Ͻÿ�
		 
		 */
		int x =5;
		do {
			int y=4;
			do {
				System.out.println(x+"+"+y+"="+(x+y));
				y++;
			}while(y<8);
			x--;
		}while(x>2);
		
		
		

	}

}
