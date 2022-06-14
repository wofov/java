package Ab2;

public class _app {

	public static void main(String[] args) {
//		members mb =new members();//자식 > 자식
//		mb.opp();
//		mb.opp2();
//		app_data2 ap = new members();//부모 > 자식 인터페이스로 기준으로 적용된 오버라이드만 호출됨(형변환)
//		인터페이스 전용
//		ap.opp();
//		ap.opp2();
		//ap.opp3();>이거 호출 안됨
		members mb =new members();//자식 클래스 전용
		mb.opp3();
		
		app_data2 ap = mb;//클래스에서 인터페이스 기준
		members mb2 = (members)ap;//자식 클래스에서 인터페이스 재변형
		mb2.opp(); 
	}

}
/*
class members implements app_data1{
	app_data1에 강제로 자료형 선언하는 방식 
}
*/
class members implements app_data2{
	@Override
	public void opp() {
		System.out.println("te2");
		
	}
	@Override
	public void opp2() {
		System.out.println("te3");

	}
	public void opp3() {
		System.out.println("te4");
	}
}