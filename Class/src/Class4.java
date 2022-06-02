
public class Class4 {

	public static void main(String[] args) {
		Member mb = new Member();
		//객체 : Member
		// mb : 인스턴스
		//new Member() : 메모리에 인스턴스 명을 생성하여 사용할 수 있도록 함.
		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total=25 * mb.user_agree;
		System.out.println(total);
		final int agree = mb.user_agree;//member 인스턴스를 필드값으로 로드함 > agree라는 필드 상수값으로 전달
		mb.user_agree = 80;//메모리에 등록된 필드명에 해당 되는 값을 변경함
		System.out.println(agree);
		/*
		 일반 클래스 메소드 부분 
		 일반 클래스 메소드 사용시 별도의 객체 및 인스턴스를 만들 필요가 없습니다.
		 Static 자체가 메소드 사용시 별도의 객체 및 인스턴스를 만들 필요가 없다
		 왜? static 자체가 메소드 인스탠스를 사용한다
		 */
		coupon.events();
     	Member.Member_events();
		

	}

}
class Member{//클래스
	String user_name; //변수 필드명을 생성 하는것
	int user_age;
	int user_level;
	int user_agree =1;//변수 필드명에 필드 값을 선언
	public static void Member_events() {
		coupon.events();//클래스에 대한 메소드를 바로 출력가능
//		단, events라는 메소드에 변수 필드 및 변수 필드값은
//		clas  선언 하게 되면 그때느 객체+인스턴스를 생성해야만 로드가 됩니다.
	}
	
	
}
/*
 하나의 project중 서로 다른 package라도 한번 사용한 class명은 다른 곳에서 
 사용하실 수 없습니다.
 */
class coupon{
	public static void events() {
		int cp=30;
		
		
		
		
	}
}