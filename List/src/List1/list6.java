package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		//���ڿ� ���� �迭 ���
		Scanner sc = new Scanner(System.in);

		ArrayList list = new ArrayList();//�ڷ����� ���� �迭
		int w=0;
		while(w<5) {
			System.out.println("�����͸� �Է����ּ���");
			String user = sc.next();
			list.add(user);
			w++;
		}
		System.out.println(list);
		//���� �Է°��� ��� ���Ҳ��� 
		int ww=0;
		int total2=0;
		do {
			try {
				Object k = list.get(ww);
				//�迭 �ڷᰡ ���� ���� ���·� ������ �Ǿ� ���� ���� ������Ʈ �Ű� Ÿ������ �����մϴ�.
				
				int numbers = Integer.parseInt(k.toString());
				//�ش� �Ű�Ÿ���� ����ȭ �Ͽ� pareInt�� �ٽ� ������.
				total2 +=numbers;
				
			}catch(Exception a1) {//�迭�� �Ű� Ÿ���� ���ڰ� �ƴ� ��� ���ܻ�Ȳ �߻� 
//				System.out.println("��");
			}
			
			ww++;
		}while(ww<list.size());
		Object a = list.get(2);
		System.out.println(a);
		System.out.println(total2);
	}

}
