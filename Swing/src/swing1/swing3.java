package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing3 {

	//반복문을 이용하여 키생성 및 배열값을 split으로 분리작업
	public static void main(String[] args) {
		String data[]= {"홍","강","이","유"};
		Map<String, String> m =new HashMap<>();
		int w =0;
		do {
			
			m.put("name"+w, data[w]);
			//등록되지 않은 키값 생성 + 해당 배열에 있는 index번호 사용 
			w++;
			//m.put(String.valueOf(w),data[w])>>이렇게도 사용가능.
		}while(w<data.length);
		System.out.println(m);
		
		Map<String, String> m2 =new HashMap<>();
		for(String names : data) {
			m2.put(names, names+1);//for each로 키, 값이 동일하게 적용 
		}
		System.out.println(m2);
		
		String alldata[]= {"name=홍길동","age=22","email=joo@mejj"};
		Map<String,String> m3=new HashMap<>();
		for(int f=0;f<alldata.length;f++) {
			String key[]=alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		System.out.println(m3);
	}

}
