import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*
		 2차 배열 [][]
		 */
		//String member2[][] = new String[2][3];//2차 정적 배열 
		String member[][] = {//2차 동적 배열
				{"홍길동","김유신","유관순"},
				{"25","31","22"}
		};
		//System.out.println(member[0][1]);
		int ea= member.length;//배열 갯수가 몇개 있는지 확인. 1차 2차 3차 등등
		int data_ea= member[0].length;//해당 배열에서 데이터 객체가 몇개있는지 확인 
		int f,ff;
		for(f=0;f<ea;f++) {//반복문은 배열 갯수 만큼 반복한다.
			//System.out.println(Arrays.toString(member[f]));
			for(ff=0;ff<data_ea;ff++) {//작은 반복문은 배열에 있는 데이터 갯수 만큼 루프
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
		 응용문제 해당 데이터 배열에 있는 모든 값중 짝수 값만 모두 더하시오
		 1번 데이터 {11,42,22,16}
		 2번 데이터 {7,33,10,29}
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
