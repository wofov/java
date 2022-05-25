
public class If {

	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		//조건문 if~ else
		if(a > b) {//if문
			System.out.println("a값이 더 큽니다");
		}

		else if(a < b) {//else if문
			System.out.println("b값이 더 큽니다");
		}
	
		else {//else문
			System.out.println("두 값이 같습니다");
		}
	    //else문이 없는 경우 아래쪽 코드
		//if, else문 하나씩 사용가능, 하지만 else if문은 계속 사용 가능
		if(a > b) {
			System.out.println("a값이 더 큽니다");
		}
		else if(a < b) {
			System.out.println("b값이 더 큽니다");
		}
		else if(a == b) {
			System.out.println("두 값이 같습니다");
		}
		/*
		 부등호 기호 : <, >, <=, >=, ==
		 */
		
	}

}
