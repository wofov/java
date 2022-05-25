
public class App {

	public static void main(String[] args) {
		int a = 25+31*4+12;
		int b = 15*3+9+14;
		if(a < b) {
			System.out.println(a+"가 더 작습니다");
		}
		else if(a >b) {
			System.out.println(b+"이 더 작습니다");
		}
		else {
			System.out.println("같다");
		}
		/*해당 값을 2진수로 짝수, 홀수로 확인하기 */
	    int c = b%2; // %기호로 사용시 0 또는 1로 나머지 값이 출력됨
	    if(c ==0) {
	    	System.out.println("짝수입니다");
	    }
	    else {
	    	System.out.println("홀수입니다");
	    }
	}

}
