package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*
		 ���빮��
		 ����ڰ� ���� �ݾ��� �Է��մϴ�.
		 �ش� ���� �ݾ� Ƚ���� �� 8�� �Դϴ�. 
		 0~n ���� �Է� ..�ش� �Է��� ��� ������
		 ���� �հ踦 �Է��ϼ���
		 ����;; �Ա��� �ݾ��� �����ּ�
		 */

		LinkedList<Integer> po = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int w =0;
		while(true) {
			System.out.println("�Ա��� �ݾ� �Է�");
			String user =sc.next();
			try {
				int addm = Integer.parseInt(user);
				po.add(addm);
				
				int ea = po.size();
				w +=addm;
				System.out.println(po);
				if(ea>8) {
					break;
				}
				
			}catch(Exception a) {
				System.out.println("���ڸ� �Է��ϼ�");
				break;
			}
//			w++;
		}
		System.out.println(w);
	}

}
