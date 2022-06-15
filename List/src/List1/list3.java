package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/*
		응용문제
		넘버데이터1 3,6,9,12,15
		넘버데이터2 2,4
		
		결과 3,6,9,12,15,2,4
		 */
		/*
		arrays.sort 배열 변수 형태에만 적용합니다.
		 */
		Integer a1[]= {3,6,9,12,15};
		Integer a2[]= {2,4};
		ArrayList<Integer> b1 = new ArrayList<Integer>(Arrays.asList(a1));
		ArrayList<Integer> b2 = new ArrayList<Integer>(Arrays.asList(a2));
		
		int w=0;
		int ww =b2.size();
		while(w<ww) {
			b1.add(b2.get(w));
			w++;
		}
		
		Collections.sort(b1); // 오름차순 쇼트 하는 법 배열리스트에서는 방법이 다름 
		//ArraysList, linked list 등등
		System.out.println(b1);
		
		int ea2 = b1.size();
		

	}

}
