package example;

public class Example3 {

	public static void main(String[] args) {
		/*
		 �迭 �⺻ Ŭ���� ����
		 a1 = {����, ����, ���, ��, ����, Ű��, �ٳ���, ����}
		 a2 = {35000,8000,4000,5500,3800,4400,11000,18900}
		 ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��Ҵ�
		 ��, �� �� ����� �ٳ����� �����ϰ� ���� �ݾ�
		 */
		String a1[]= {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
		int a2[]= {35000,8000,4000,5500,3800,4400,11000,18900};
		

		point(a1,a2);
		
		
	}
	public static void point(String b1[],int b2[]) {
//		int bb = b1.length;
//		int c=0;
//		int total = 0;
//		
//		for(String abc : b1) {
//			if(!abc.equals("���")&&!abc.equals("�ٳ���")) {
//				total += b2[c];
//				System.out.println(b1[c]);
//				//c++;
//			}
//	      
//			c++;
//		}
//		System.out.printf("�� ���� �ݾ��� %d�Դϴ�",total);
		
		int ea = b1.length;
		int w = 0 ;
		int total2 = 0 ;
		while(w<ea) {
			if(!b1[w].equals("���") && !b1[w].equals("�ٳ���")) {
				total2 += b2[w];
			}
			
			w++;
		}
		System.out.println(total2);
	}

}
