import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*
		 2�� �迭 [][]
		 */
		//String member2[][] = new String[2][3];//2�� ���� �迭 
		String member[][] = {//2�� ���� �迭
				{"ȫ�浿","������","������"},
				{"25","31","22"}
		};
		//System.out.println(member[0][1]);
		int ea= member.length;//�迭 ������ � �ִ��� Ȯ��. 1�� 2�� 3�� ���
		int data_ea= member[0].length;//�ش� �迭���� ������ ��ü�� ��ִ��� Ȯ�� 
		int f,ff;
		for(f=0;f<ea;f++) {//�ݺ����� �迭 ���� ��ŭ �ݺ��Ѵ�.
			//System.out.println(Arrays.toString(member[f]));
			for(ff=0;ff<data_ea;ff++) {//���� �ݺ����� �迭�� �ִ� ������ ���� ��ŭ ����
				//System.out.println((member[f][ff]));
			}
		}
		
		int [][] date = {
				{1,3,5},
				{2,4,6}
		};
		int fea = date.length;
		int dea = date[0].length;
		int w, ww;
		int total = 0;
		for(w=0;w<fea;w++) {
			for(ww=0;ww<dea;ww++) {
				//System.out.println(date[w][ww]);
				total +=date[w][ww];
			}
		}
		//System.out.println(total);
		/*
		 ���빮�� �ش� ������ �迭�� �ִ� ��� ���� ¦�� ���� ��� ���Ͻÿ�
		 1�� ������ {11,42,22,16}
		 2�� ������ {7,33,10,29}
		 */
		int aa[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int a1 = aa.length;
		int a2 = aa[0].length;
		int b1, b2;
		int total3 = 0;
		for(b1=0;b1<a1;b1++) {
			for(b2=0;b2<a2;b2++) {
				if(aa[b1][b2]%2==0) {
					total3 += aa[b1][b2];
					System.out.println((aa[b1][b2]));
				}
			}
		}
		System.out.println(total3);
		
		
		/*
		 int numbers[][] = {
		 
				{11,42,22,16},
				{7,33,10,29}
		};
		
		int ws = 0;
		while(ws<numbers.length) {
			int wz= 0;
			while(wz < numbers[ws].length) {
				if() {
					
				}
			}
		}
		*/
		
		
	}

}
