package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_more {
//arrayslist 2�� �迭 ���� ( ������ ����)
	public static void main(String[] args) {
		String member_data[][]= {
				{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
				{"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"}	 
		};

		//String[] , integer[] = 2�� �迭 �̻�. 
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
		System.out.println(list);
		int a= list.size();
		//list.get(0)[5] > �̷������� �� �ҷ���.
	}

}
