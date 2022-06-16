import java.util.ArrayList;
import java.util.Arrays;

//중복 아이디 체크 시스템 만들기 awt5_abstract과 함께 사용 
//hong, lee, park
public class awt5 {

	public static void main(String[] args) {
		handle hd = new handle();
		hd.signok();
		hd.dataload();
		hd.design();

	}

}
class handle extends awt5_abstract{
	ArrayList<String> db=null;
	private String iddd;//awt에서 넘오은 인수값을 클래스에서 활용
	private String return_id;
	//awt로 다시 값을 전달 . 전역 변수 null경우 해당 아이디 사용가능 
	//아이디값이 전달:해당 아이디는 사용할 수 없음
	@Override
	public String signok() {//getter
		return this.return_id;
	}
	@Override
	public void id_check(String id) {//setter
		this.return_id=null;//★★★★★★★중복 검출을 위한 지속적인 초기화★★★
		this.iddd=id;
		this.dataload();//정상적으로 데이터가 넘어왔을 경우 해당 메소드를 로드하여 확인 
		int ea = this.db.size();
		int w=0;
		while(w<ea) {
			if(this.iddd.equals(this.db.get(w))) {
				this.return_id =this.db.get(w);
				break;
			}
			w++;
		}
		
	}
	@Override
	public void dataload() {
		String ori[]= {"hong","lee","park","jung","kim"};
		this.db=new ArrayList<>(Arrays.asList(ori));
	}
}