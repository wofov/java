package App;

public class App1 {
	//app라는 기본 메인 class이며, abox,main의 공종에 이음

	public static void main(String[] args) {
		//method11에서 로드할 경우 해당 외부 blue 클래스를 로드하게
		//출력 시켜  method11에 로드 할 수 있도록 함.
		blue b = new blue();
		System.out.println(b.box());

	}
	public void abox() {
		System.out.println("tt");
	}
//blue는 별도의 외부 class이며, method11에서 직접적인 핸들링 불가
}
class blue{
	private String msg;
	public String box() {
		this.msg = "환영합니다";
		return this.msg;
	}
}