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
		//for(;;)무한루프
		while(true) {
			System.out.println("숫자를 입력하세요");

			try {//사용자가 입력한 값이 오류가 있는지 확인하는 파트
				user = sc.next();
				int number = Integer.parseInt(user);
				list.add(number);//자료형 실수
				System.out.println(list);
				int ea = list.size();
				if(ea>=5) {break; //5개 배열 입력되면 루프 종료
					
				}
			}catch(Exception a1) {//오류가 발생햇을경우 작동되는 파트
				System.out.println("숫자만 입력");
				break;
			}

//		

			System.out.println(list);
		}

	}

}
