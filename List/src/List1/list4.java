package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		Integer a[]= {3,6,9,12,15};
		LinkedList<Integer> in = new LinkedList<>(Arrays.asList(a));
		System.out.println(in);
		in.add(33);
		in.add(34);
		in.add(35);
		System.out.println(in);
		
		Scanner sc = new Scanner(System.in);
	    LinkedList<Integer> list = new LinkedList<>();
		String user;
		//for(;;)���ѷ���
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���");

			try {//����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
				user = sc.next();
				int number = Integer.parseInt(user);
				list.add(number);//�ڷ��� �Ǽ�
				System.out.println(list);
				int ea = list.size();
				if(ea>=5) {break; //5�� �迭 �ԷµǸ� ���� ����
					
				}
			}catch(Exception a1) {//������ �߻�������� �۵��Ǵ� ��Ʈ
				System.out.println("���ڸ� �Է�");
				break;
			}

//		

			System.out.println(list);
		}

	}

}
