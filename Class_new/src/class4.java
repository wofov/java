import java.util.ArrayList;
import java.util.Arrays;

public class class4 {

	public static void main(String[] args) {
		/*
		 배열 데이터 : 홍길동, 이순신,유관순
		 메인 class에서 문자를 하나 전송한다. 
		 단, 문자가 null로 보낼수도 있다. 배열 데이터와 관계 없는
		 강감찬 입력 할수도 있다. 
		 외부 클래스 명은 data_list
		 추상 클래스 명 v_constuct
		 외부 클래스 안에 자식 클래스 check
		 결과는?
		 메인 클래스에서 강감찬을 적용할 경우
		 내부 클래스에서 해당 사용자가 아닙니다 라고 출력
		 
		 메인 클래스에서 이순신을 적용할 경우 
		 내부클래스에서 해당 사용자가 있다.
		 
		 단, arraylist배열을 로드 해라. 
		 */

		data_list da = new data_list();
		da.sang("");
		data_list.check da2= da.new check();
		da2.name();
	}
}
abstract class v_constuct{
	public String user[];//여기서 생성 안하고 check 클래스 에서 생성해도 됩니다. 1번
	public String join;
	public abstract void sang(String a);
}
class data_list extends v_constuct{
	@Override
	public void sang(String a) {
		if(a==null) {//null은 equals사용 안된다.★★★
			System.out.println("사용자 이름을 입력하세요");
		}
		else {
			this.join=a;//숫자를 넣을수있으니 valuOf생각 하기 
			String jj[]= {"홍길동", "이순신", "유관순"};
			this.user=jj;
//			check ck = new check();이런식으로도 호출 가능 //  static 메인에 최대한 부담을 덜기 위해 이거 필요로 하기 
			
		}
	}
	class check{
		String join =data_list.this.join;
//		String user[] = data_list.this.user;
		String user[]; //이런식으로 1번 // 객체만 생성해 놓은것 
		//ArrayList<String> user_1 = null; 2번 //arraylist 유틸을 필드에 선언 이것 또한 객체 생성만.
		public void name() {
			this.user = new String[]{"홍길동", "이순신", "유관순"};
//			this.user_1 =new ArrayList<>(Arrays.asList(this.user)); 2번 이런식으로도 호출 가능 /
			//check에서 user[]를 객체 생성 했기 때문에 data_list. 코드 필요 없다 
			ArrayList<String> user_1 = new ArrayList<>(Arrays.asList(this.user));
			//data_list.this.user <이렇게 사용 안해도 됨
			int w=0;
			boolean ok = false;
			while(w<user_1.size()) {
		     	if(data_list.this.join.equals(user_1.get(w))) {
					System.out.println("해당 사용자가 있다.0000");
					ok = true;
				}
				w++;
			}
			if(ok==false) {
				System.out.println("해당 사용자가 없다.xxxx");
			}
		}
	}
}
