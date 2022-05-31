import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/*
		 응용문제
		 2개의 데이터 배열이 있습니다
		 해당 데이터 배열을 다음 결과 처럼 값을 출력하시오
		1번 data : 대한민국 일본 중국 베트남 태국
		2번 data : 40 35 70 55 32
		결과 data :
		["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"] 
		 */
		String data[][] = {
				{"대한민국","일본","중국","베트남","태국"},
				{"40", "35", "70", "55", "32"}
		};
		int ar = data.length;
		int ar2 = data[0].length;
		String newdata[] = new String[ar2];
		int w= 0;
		do {
		    int ww=0;
		    do {
		    	//System.out.println(data[w][ww]);
		    	newdata[ww]=data[0][ww]+ "(" + data[1][ww]+ ")" ;
		    	ww++;
		    }while(ww<ar2);
			
			w++;
		}while(w==0);
		System.out.println(Arrays.toString(newdata));
		
	 
		/*
		 응용문제
		 해당 두개의 배열 데이터가 있습니다 
		 각 배열 별로 인덱스가 같은 번호를 더해서 
		 짝수 인지 홀수 인지를 배열 결과 데이터로 재설정 하세요
		 A data = 5 17 19 22 33
		 B data = 1 2 3 4 5
		 result = ["짝","홀","홀","짝","짝"]
		 */
		
		int A1 [][] = {
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
		int data_ea =A1[0].length;
		int f =0;
		int total;
		String result;
		String result_data[]= new String[data_ea];
		while(f < data_ea) {
			total = A1[0][f] + A1[1][f];
			if(total%2==0) {
				result = "짝";
			}
			else {
				result = "홀";
			}
			result_data[f]=result;
			
			f++;
		}
		System.out.println(Arrays.toString(result_data));
		

	}

}
