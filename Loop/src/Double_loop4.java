
public class Double_loop4 {

	public static void main(String[] args) {
		/*
		 ���빮�� ���� �ݺ��� for, do while //���߿� �ѹ�Ǯ�� ���Ҷ��� �Ѱ� 
		 */
		int f;
		for(f=2;f<4;f++) {
			int w=1;
					do {
						//System.out.println(f+"*"+w+"="+(f*w));
						w++;
					}while(w<10);
		}
		/*
		 ���빮�� ������ 7~9��
		 ��,�� ������ ���� ���� 5������
		 �� do while 
		 �� while
		 *///
		int a=7;
		
		do {
			int b=1;
			while(b<6) {
				//System.out.println(a+"*"+b+"="+(a*b));
			//System.out.println(" %d * %d = %d ",a,b, total); ���̰� �������̱�
				b++;
			}
			a++;
		}while(a<10);
		/* �� ������ �� �غ���
		 ���빮�� for-while�� �ڵ� ���� 
		 1*1
		 2*2
		 3*3..9*9 �ڵ� ��� 
		 */
		int aa;
		for(aa=1;aa<10;aa++) {
			//int bb=aa;
			//while(bb<=aa) <<�̰� �´� �ڵ�.
			while(aa<10) { // << �̰� �������� �ڵ�.
				System.out.println(aa+"*"+aa+"="+(aa*aa));
				aa++;
			}
		}
		/*
		 ������ ���빮��
		 ���� �ݺ��� �̿��ϱ�
		 �� while
		 �� do while
		 1+1=2
		 2+1=3
		 2+2
		 3+1
		 3+2
		 3+3
		 4+1
		 4+2
		 4+3
		 4+4
		 */
		
		

	}

}
