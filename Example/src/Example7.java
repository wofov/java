import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 응용문제7
		 사용자가 다음 질문에 확인하여 값을 확인하여 해당 결과를 돌출하는 프로세서 제작.
		 "첫번째 입력값 단, 1~10까지 입력값"
		 "두번째 입력값 단, 1~10까지 입력값"
		 "세번째 입력값 단, 1~10까지 입력값"
		 "마지막 질문 입니다. 해당 세가지 값에 대한
		 산술기호를 적으시오"
		 해당 산술기호에 맞게 수식 적용하요 최종값을 돌출해라
		 */
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1번째 입력값 (단, 1~10까지)을 입력하세요");
		int user1=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("2번째 입력값 (단, 1~10까지)을 입력하세요");
		int user2=sc2.nextInt();
	
		Scanner sc3 = new Scanner(System.in);
		System.out.println("3번째 입력값 (단, 1~10까지)을 입력하세요");
		int user3=sc3.nextInt();
	
			
		Scanner sc4 = new Scanner(System.in);
		System.out.println("마지막 질문입니다. 해당 세 가지 값에 대한 산술기호를 적으시오");
		String user4=sc4.next();
		if(user4.equals("+")) {
			System.out.println(user1+user2+user3);
		}
		else if(user4.equals("-")) {
			System.out.println(user1-user2-user3);
		}
		else if(user4.equals("*")) {
			System.out.println(user1*user2*user3);
		}
		else if(user4.equals("/")) {
			System.out.println(user1/user2/user3);
		}
        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
	}

}
