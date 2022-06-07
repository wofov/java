
public class Method6 {

	public static void main(String[] args) {
		// private에 대한 객체 선언 형태2
		

		insert i = new insert();
		String userid="hong";
		//i.userid="admin";★
		String skey ="a1234567";
		String result = i.checks(userid,skey);
		//String result = i.checks(skey);★
		System.out.println(result);
	}

}
class insert{
	//String userid=null;
	private String key=null;
	public String checks(String aa, String bb) {//String aa빼기★//해당 클래스에서 적용되는 key값
		this.key =bb;
		String msg = null;
		if(key=="a1234567") {//해당 키값(private)과 외부 클래스 에서 넘어오는 인수값과 비교
			//맞으면 아이디 확인 
			if(aa=="hong") {//aa대신 userid★
				msg="데이터 확인중에 있습니다.";
			}
			else {
				msg="해당 데이터값을 확인 하지 못합니다";
			}
		}
		else {//외부 클래스에서 올바른 키값이 전달되지 않을 경우
			msg = "error";
		}
		return msg;//최종 결과에 대한 return으로 회신함.
	}
}
