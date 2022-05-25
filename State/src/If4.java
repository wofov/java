import java.util.Scanner;
//import : java에 있는 file을 로드 할때 사용하는 언어
//export : java에 있는 파일을 별도 내보낼 수 있는 언어
//java.util 패키지 안에 Scanner 클래스 부분를 로드 하게 합니다.
//java.util 패키지는 그냥 사용하지 못하며 new를 할당하며 구분자를 사용해야 합니다.
//단, 해당코드 위치가 코드 보다 위에 있어야 한다. 하단에 위치 X
public class If4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		//new : 객체를 선언하는 말
		System.out.println("아이디를 입력하시오");
		//System.in(입력) System.out(출력)

		String mid =a.next();
		System.out.println(mid);
		//next() 사용자가 입력하는 형태를 말합니다. 숫자 또는 문자를 입력 받는 형태 
		
		}

}
