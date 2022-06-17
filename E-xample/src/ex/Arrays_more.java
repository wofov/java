package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_more {
//arrayslist 2차 배열 형태 ( 다차원 포함)
	public static void main(String[] args) {
		String member_data[][]= {
				{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
				{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"}	 
		};

		//String[] , integer[] = 2차 배열 이상. 
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
		System.out.println(list);
		int a= list.size();
		//list.get(0)[5] > 이런식으로 값 불러옴.
	}

}
