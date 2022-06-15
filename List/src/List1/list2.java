package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
 
		/*
		 응용문제 해당 데이터 값 중 휴먼고객 데이터는 모두 삭제 해야 합니다.
		 고객 데이터
		 
		{"김수빈","김정현","박도현","이경훈","정재욱","하윤성"}
		결과
		정재욱,하윤성 만 나오거 나머지 다 삭제
		 */
		String user[]= {"김수빈","김정현","박도현","이경훈","정재욱","하윤성"};
		ArrayList<String> uu = new ArrayList<>(Arrays.asList(user));
//		int w = 0; > 더블 반복문 없이.
//		int ea = uu.size();
//		while(w<ea) {
//			if(uu.get(0)=="정재욱") {
//				System.out.println(uu);
//				break;
//			}
//			else {
//				uu.remove(0);
//			}
//			w++;
//		}
		int w=0;
		int w1 = 0; //더블 반복문 꼭 필요 하다고 하네요.
		int ea1 = uu.size();
		while(w<ea1) {
			int ea2=uu.size();
			int ww=0;
			while(ww<ea2) {
				if(!uu.get(ww).equals("정재욱")&&!uu.get(ww).equals("하윤성")) {

					uu.remove(0);
//					System.out.println(uu);
			
				}
				//ww++;>이거 조건 안넣음.
			}
			w++;
		}
		/*
		 응용문제 짝수의 숫자를 모두 삭제 합니다.
		 10,7,6,1,11,37,41,22
		 */
		Integer qwe[]= {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(qwe));
		int no = ar2.size();
		int z = 0;
		do {
			int no2 = ar2.size();
			int zz=0;
			do {
				if(ar2.get(zz)%2==0) {

					ar2.remove(zz);
					break;
				}
		System.out.println(ar2);
		    zz++;
			}while(zz<no2);
		
			z++;
		}while(z<no);
		System.out.println(ar2);
		
		
		
		
		
		
		
	}
}
