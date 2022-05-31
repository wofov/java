import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		//더블루프
		int A1 [][] = {
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
		//A1[0][0] = A1[1][0]
		//A1[0][1]+A1[1][1]
		int ea =A1[0].length;//배열에 있는 데이터 객체 수
		int ea2 = A1.length;//배열 그룹 수
		int w=0;//큰 반복문 인덱스
		int total1 = 0;
		int total2 = 0;
		int newdata[] = new int[ea];//새로운 배열 객체 생성
		while(w<ea) {
			int ww=0;
			while(ww<ea2) {
				
				if(ww==0) {
					total1 = A1[ww][w];
				}
				else {
					total2 = A1[ww][w];
				}
				//System.out.println(A1[ww][w]);
				ww++;
			}
			//작은 반복문 앞으로 나와서 첫번째 배열값 더하기 두번째 배열값 더하기
			newdata[w]= total1 + total2;//새로운 배열 객체로 등록 
			w++;
		}
		
		System.out.println(Arrays.toString(newdata));

	}

}
