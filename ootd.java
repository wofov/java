import java.util.ArrayList;

public class ootd {

	public static void main(String[] args) {
		/*
		응용문제 arraylist 또는 linkedlist를 둘 중에 원하는 메소드를
		사용하세요
		2차배열 형태 입니다
		해다 ㅇ데이터 값을 모두 더하여 짝수 인지 홀수 인지를 확인하세요
	    integer data[][]
	    10,20,30,40,50,60,70
	    3,6,9,12,15,17,19
	    결과
	    총 합은 ㅁㅁ 이며 짝수입니다. 
		 */
		int a[][] ={
				{10,20,30,40,50,60,70},
				{3,6,9,12,15,17,19}
		};
		ArrayList<Integer> a1 = new ArrayList<>();
		int w=a.length;
		int ww=a[0].length;
		int b=0;
		while(b<w) {
			int b1=0;
			while(b1<ww) {
				a1.add(a[b][b1]);
				b1++;
			}
			b++;
		}
		int aa=0;
		int total = 0;
		int ea=a1.size();
		while(aa<ea) {
			total +=a1.get(aa);
			aa++;
		}
		if(total%2==0) {
			System.out.println("총합은 "+total+"이며 짝수입니다.");
		}
		else {
			System.out.println("총합은 "+total+"이며 홀수입니다.");
		}
	

	}

}
