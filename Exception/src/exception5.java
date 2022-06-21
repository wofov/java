
public class exception5 {

	public static void main(String[] args) {//값을 전달 출력만 함. 
		try {
			words wd = new words();
			String re = wd.files(null);
			System.out.println(re);
		}catch(Exception a) {
			System.out.println("공백이 문제가 되어 값 전달 안됨");
			if(a.getMessage()!=null) {
				System.out.println(a);
			}
				
			}finally {//파이널 생성시 try 한번더 
				try {
					
					words wd2 = new words();
					String re2 = wd2.files("홍길동");
					System.out.println(re2);
				}catch(Exception e1) {
					System.exit(0);
				}
			}

	}

}
class words{//값을 받고 연산 후 리턴.
	public String files(String aa) throws Exception{
		if(aa==null||aa.equals("")) {
//			Exception ea = new Exception();
			throw new Exception("값이 비어있음");
		}
		else {
			String msg = aa+"님 환영합니다";
			return msg;
		}
	}
}