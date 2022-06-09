
public class Over {

	public static void main(String[] args) {


		//pt p =new pt();
		//p.display();
		//p.display("메인 내용 값 출력");
		cd c = new cd();
		c.display("메인 출력");//오버로딩
		c.display();//오버라이드
		

	}

}/*
오버로딩(over loading) 새로운 메소드를 정의하는 것.
오버라이드(over ride) 부모 클래스에서 상속 받은 기존 메소드를 사용하는 것을 말합니다.
*/
class pt{
	
	public void display() {
		System.out.println("외부 내용 값");
	}
	
}
class cd extends pt{
	public void aaaa() {
		System.out.println("자식");
	}
			
	//오버라이드 > 에노테이션 <표시>문제 발생시 확인 (오버라이드 에서만 확인)
	public void display() {//오버라이드
		System.out.println("자식 클래스 값으로 변경");//이거로 바꾼다
		//super.display();//원래 출력되지 않던 부모 클래스값 출력 
		//부모에 고유 속성 메소드 값을 가져올때 사용합니다. 오버라이드.
	}
	
	public void display(String msg) {//오버로딩
		System.out.println(msg);
	}
}