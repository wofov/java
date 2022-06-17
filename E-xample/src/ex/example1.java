package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class example1 {

	public static void main(String[] args) {
		/*
		 외부 클래스 사용하여 다음 프로세서를 작성하시오
		 다음 2개의 배열 데이터가 있습니다. 단, 2개의 배열을 하나릐 배열로
		 합치도록 합니다. 그 대신 중복된 값은 하나로 처리합니다. 
		 1번 배열 : 11,22,33,44,55
		 2번 배열 : 8,10,11,19,44
		 결과 출력 8,10,11,19,22,33,55
		 중복값 비교 및 삭제
		 2번 데이터 값 1번에 추가
		 1번 데이터를 쇼트 오름차순 
		 */

		ori a = new ori();
		a.data();
	}

}
class ori{
	
	ArrayList<Integer> a1,b1=null;
	public void data() {
		Integer[] a = {11,22,33,44,55};
		Integer[] b = {8,10,11,19,44};
		this.a1 = new ArrayList<>(Arrays.asList(a));
		this.b1 = new ArrayList<>(Arrays.asList(b));
		int w=0;
		do {
			int ww = 0;
			int z= this.b1.size();
			while(ww<z) {
				if(this.a1.get(w)==this.b1.get(ww)) {
					this.b1.remove(ww);
					this.b1.add(0);
				}
				ww++;
			}
		w++;
		}while(w<this.a1.size());

		int t=0;
		while(t<this.b1.size()) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}
			t++;
		}

		Collections.sort(this.a1);
		System.out.println(this.a1);
		
	
	}
}





