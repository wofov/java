package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {
	//add추가,  get데이터로드 ,remove삭제  , size인덱스 갯수,
	//ArrayList라는 유틸 메소드에서 사용함
	//Array.asList : 로드를 배열 변수를 적음
	//add는 일반적으로 무조건 맨 뒤에 데이터가 추가됨
	//단, 인덱스 번호를 적용 후 값을 실행하면 해당 인덱스 부분에 추가 
	public static void main(String[] args) {
		String member[] = {"이순신","홍길동","유관순","강감찬"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
//		System.out.println(mb);
		int ea = mb.size();
//		System.out.println(ea);
		mb.add("김유신");
//		System.out.println(mb);
		mb.remove(1);
//		System.out.println(mb);
		mb.add(3,"세종대왕");
//		System.out.println(mb);
		String checks =mb.get(2);
//		System.out.println(checks);
		/*
		응용문제 {15,22,37,8,11,19,41};
		해당 데이터를 커스텀 하여 다음 결과 처럼 출력하시오
		{7,15,22,8,11,39,41}
		 */
		//arrayList에서는 int를 사용하지 않음 대신 integer를 사용함. 
		Integer num[]= {15,22,37,8,11,19,41};
		ArrayList<Integer> a= new ArrayList<Integer>(Arrays.asList(num));
		a.remove(2);
		a.remove(4);
		System.out.println(a);
		a.add(0,7);
		a.add(5,39);
		System.out.println(a);
		
		
	}

}
