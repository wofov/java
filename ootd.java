import java.util.ArrayList;

public class ootd {

	public static void main(String[] args) {
		/*
		���빮�� arraylist �Ǵ� linkedlist�� �� �߿� ���ϴ� �޼ҵ带
		����ϼ���
		2���迭 ���� �Դϴ�
		�ش� �������� ���� ��� ���Ͽ� ¦�� ���� Ȧ�� ������ Ȯ���ϼ���
	    integer data[][]
	    10,20,30,40,50,60,70
	    3,6,9,12,15,17,19
	    ���
	    �� ���� ���� �̸� ¦���Դϴ�. 
		 */
		int a[][] ={
				{10,20,30,40,50,60,70},
				{3,6,9,12,15,17,19}
		};
		ArrayList<Integer> a1 = new ArrayList<>();
		int w=a.length;
		int ww=a[0].length;
		int b=0;
		while(b<w) {
			int b1=0;
			while(b1<ww) {
				a1.add(a[b][b1]);
				b1++;
			}
			b++;
		}
		int aa=0;
		int total = 0;
		int ea=a1.size();
		while(aa<ea) {
			total +=a1.get(aa);
			aa++;
		}
		if(total%2==0) {
			System.out.println("������ "+total+"�̸� ¦���Դϴ�.");
		}
		else {
			System.out.println("������ "+total+"�̸� Ȧ���Դϴ�.");
		}
	

	}

}
