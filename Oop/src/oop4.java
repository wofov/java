
public class oop4 {

	//추상 클래스 및 메소드 abstract
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();
	}

}
abstract class ab_1{//추상 클래스 : 외부에서 로드가 절대 안됨, 자체 실행도 안됨
	public void ab_a() {//인수값 없는 추상 메소드 
		System.out.println("부모 클래스 입니다");
		
	}
	public void ab_a(int ww) {//인수값 받는 추상 메소드
		
	}
	public abstract int b(); // free 구성 , 추상 메소드 - 자체 실행 안됨
    public abstract int c(); //자식클래스에서 사용
}
class ab_2 extends ab_1{
	@Override // > 추상 abstract 사용 하면 꼭 오버라이드 사용;
	public int b() {//실제 메소드 + 추상 메소드
		return 55;
	}
    @Override
	public int c() {
		return 52;
	}
}