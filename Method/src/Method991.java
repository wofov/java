
public class Method991 {

	//문자열 정규식 코드 
	public static void main(String[] args) {
		//setter:사용자가 입력한 값 또는 수식 값을 전달하는 메소드
		//getter:연산을 거친후 리턴으로 값을 보내는 메소드

		//replace : 치환 형태의 함수입니다.(문자 및 문자열 숫자)
		//replaceAll : replace에서 조금 발전된 치환형태의 함수
		//자바에서 replace와 통합.
		String stt = "홍길동님 환영합니다";
		String stt2 = stt.replace("님","고객님");
		System.out.println(stt2);
		String mn = "홍 길동";
		String mn2=mn.replace(" ","" );//공백제거
		System.out.println(mn2);
		String nm3="자바가 진짜 사람을 자바요";
		String rnm3=nm3.replaceAll("자바","java");//All유무 확인 기억하기★
		System.out.println(rnm3);
	}

}
class met{
	private String user_name;
	private String user_pass;
	private String user_email;
	public met(String n, String p ,String e) {
		this.user_name = n;
		this.user_pass = p;
		this.user_email = e;
		
	}
}