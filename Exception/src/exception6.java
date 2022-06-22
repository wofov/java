
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
			int a =45*3+16+5+22*8+1;
			String re = n.nn(a);
			System.out.println(re);
//			System.out.println(a);
//			String a1 = Integer.toString(a);
//			String a4=n.nn(a1);
//			System.out.println(a4);
		}catch(Exception e) {
			if(e.getMessage()!=null) {
				
				System.out.println(e.getMessage());
			}
		}
	}
}
class now{
	
	public String nn(int a2) throws Exception{//★★리턴 자료형이 String이더라도 인수값 int 줘도 된다. 
//		int a3 = Integer.valueOf(a2);
		String msg;
		if(a2%2==0) {
			throw new Exception("예외처리 오류 확인");
		}
		else {
			msg="홀수입니다.";
			return msg;
		}
	}
}