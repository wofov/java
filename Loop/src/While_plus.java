
public class While_plus {

	public static void main(String[] args) {
		/*
		 5~10���� ���� �հ踦 ����ϼ���
		 */
		int w =5;
		int total = 0;//��� �հ�ġ�� ������Ű�� ������
		while(w<11) { // += -= *= %= /=
			total = total +w;
			w++;
		}
		System.out.println(total);
		
	    /*
	     3~8���� ���� �� �հ踦 ����ϼ���
	     */
		int a = 3;
		int total1 = 1;//���ϱ� �հ踦 ������ 1 �⺻������ ����
	    while(a<9) {
	    	total1 = total1*a;
	    	a++;
	    }
	    System.out.println("�� �հ��"+total1+"�Դϴ�");
	
	}

}
