package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
 
		/*
		 ���빮�� �ش� ������ �� �� �޸հ� �����ʹ� ��� ���� �ؾ� �մϴ�.
		 �� ������
		 
		{"�����","������","�ڵ���","�̰���","�����","������"}
		���
		�����,������ �� ������ ������ �� ����
		 */
		String user[]= {"�����","������","�ڵ���","�̰���","�����","������"};
		ArrayList<String> uu = new ArrayList<>(Arrays.asList(user));
//		int w = 0; > ���� �ݺ��� ����.
//		int ea = uu.size();
//		while(w<ea) {
//			if(uu.get(0)=="�����") {
//				System.out.println(uu);
//				break;
//			}
//			else {
//				uu.remove(0);
//			}
//			w++;
//		}
		int w=0;
		int w1 = 0; //���� �ݺ��� �� �ʿ� �ϴٰ� �ϳ׿�.
		int ea1 = uu.size();
		while(w<ea1) {
			int ea2=uu.size();
			int ww=0;
			while(ww<ea2) {
				if(!uu.get(ww).equals("�����")&&!uu.get(ww).equals("������")) {

					uu.remove(0);
//					System.out.println(uu);
			
				}
				//ww++;>�̰� ���� �ȳ���.
			}
			w++;
		}
		/*
		 ���빮�� ¦���� ���ڸ� ��� ���� �մϴ�.
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
