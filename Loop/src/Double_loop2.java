
public class Double_loop2 {

	public static void main(String[] args) {
		//while
		int w=1;
		while(w<4) {
			int ww=1;//�ڡڡڡڡڡڡڡ�while �̶� do while�� ���� ���ǹ� �ڵ忡�� ������
			         //�ڡڡڡڡڡڡڡھȿ��ٰ� �־�� �Ѵ�.
			while(ww<5) {
				//System.out.println(w+"+"+ww);
				ww++;
			}
			w++;
		}

		//do while
		int dw = 1;
		do {
			//do while�� ���� while�� ���� �ʱⰪ�� ū �ݺ��� �ȿ� ����
			int ddw = 1;
			do {
				System.out.println(dw+"+"+ddw);
				ddw++;
			}while(ddw<5);//���� �ݺ��� ����
			dw++;
		}while(dw<4);//ū �ݺ��� ����
	}

}
