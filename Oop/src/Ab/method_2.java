package Ab;
/*
 abstract와 interface 차이점 및 공통점
 
 */
public class method_2 {
  //inter1,2 연결 되어 있는것
	public static void main(String[] args) {

		loadinter ld = new loadinter();
		ld.setbox("홍길동");
	}

}
//abstract와 인터페이스 모두 static 사용 할 수 있음. 
abstract class test{//abstract는 default를 사용하지 못함(public 기본설정)
	//필드에 자료형을 생성할 수 있음.
	//inter은 메소드 이므로 필드형 자료형을 선언 할 수 있음. 
    public String nn;	
	public abstract void box();
	public void box2() {
		System.out.println("tt");
		this.nn="dd";
	}
}
class loadinter implements method_2re,method_2inter2{//다중 상성
	//인터페이스에 extends로 부모 인터페이스를 로드할수있따. 
	@Override
	public String names() {
		return null;
	}
	
}