package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/*
		���빮��
		�ѹ�������1 3,6,9,12,15
		�ѹ�������2 2,4
		
		��� 3,6,9,12,15,2,4
		 */
		/*
		arrays.sort �迭 ���� ���¿��� �����մϴ�.
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
		
		Collections.sort(b1); // �������� ��Ʈ �ϴ� �� �迭����Ʈ������ ����� �ٸ� 
		//ArraysList, linked list ���
		System.out.println(b1);
		
		int ea2 = b1.size();
		

	}

}
