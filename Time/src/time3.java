import javax.imageio.metadata.IIOInvalidTreeException;

public class time3 {

	public static void main(String[] args) {
		/*
		try {
			System.out.println("수업시작");
			Thread.sleep(5000);
			System.out.println("수업종료");
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		*/
		/*
		 응용문제
		 외부 class가 있습니다. 단 메인 클래스에서 해당
		 외부 클래스를 로드하면 해당 메소드에서 즉각적으로 
		 8초동안 로딩이 발생한다 
		 8초동안"처리중입니다. 잠시만 기다리세요"
		 8초이후 return으로 "입금이 모두 처리 되었습니다"라는
		 문자를 받도록 하십시오. 
		 */
		tt t1 = new tt();
		System.out.println(t1.uu());
	}
}
class tt{
	public tt() {
		try {
			System.out.println("처리중입니다. 잠시만 기다리세요");
//			int c=12/0;<그냥 이상한 값 집어 넣으면 에러 나는듯. 
			Thread.sleep(1000);
			uu();
		}catch(InterruptedException a) {
//			System.out.println(a); << 에러낫을때 나오는거
		}
	}
	public String uu() {
		return "입금 처리 완료";
	}
}
