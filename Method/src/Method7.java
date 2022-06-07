import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		apink ap =new apink("홍길동",23,"123@gfg",-1000);
	
		System.out.println(ap.data());
		System.out.println(ap.data2());
	}

}

class apink{
	//private선은 class 필드에서 생성해야합니다.
	String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
	
		if(this.nm=="홍길동") {
			this.nm="hong";
			String e[] = this.email.split("@");//이메일 중에 이메일 정보만 가져오기 위한 배열을 나누는 작업
			System.out.println(Arrays.toString(e));
			this.email_cp=e[0];
			
		}
		
		
	}
	public apink(String nm1,int age2,String email3,int point4) {//private를 안에서 사용하지 못함
	
		//setter 형태
		this.nm = nm1;
		this.email=email3;
		if(point4<0) {
			this. point = 0;
		}
		else {
			this .point=point4;
		}
		
	
		names();
				
	}
	public String data() {
		
		return this.nm;
		//리턴 밑에 코드 작성 할 수가 없다 
		//리턴은 맨 마지막에 사용하는 코드입니다.
	}public int data2() {
		//getter 형태 
		return this.point;
	}
}
