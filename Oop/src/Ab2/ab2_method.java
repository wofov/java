package Ab2;
import Ab.method_1;

public class ab2_method extends Ab.method_1 {//public class는 한번밖에 사용 못한다.

	
	public static void main(String[] args) {
		Ab.method_1 at = new Ab.method_1();
		at.main(args);//메인 클래스 로드
		at.recall();// public 메소드 실행 //private는 로드 불가 

		at.name();
	}

}
