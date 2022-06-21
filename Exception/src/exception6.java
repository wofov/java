
public class exception6 {

	public static void main(String[] args) {
		/*
		 응용문제
		 사용자가 45*3+16+5+22*8 해당 연산 값에 최종 값을
		 외부 클래스로 전송 합니다. 
		 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외처리 하고
		 홀수 일 경우 홀수값입니다 라고 다시 회신 되도록 합니다. 
		 */
		now n = new now();
		try {
			int a =45*3+16+5+22*8;
			System.out.println(a);
			String a1 = Integer.toString(a);
			String a4=n.nn(a1);
			System.out.println(a4);
		}catch(Exception e) {
			System.out.println("짝수라서 오류");
		}
	}
}
class now{
	
	public String nn(String a2) throws Exception{
		int a3 = Integer.valueOf(a2);
		String msg;
		if(a3%2==0) {
			throw new Exception();
		}
		else {
			msg="홀수입니다.";
			return msg;
		}
	}
}