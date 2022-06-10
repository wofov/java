
public class Sun1 {

	public static void main(String[] args) {
		inherit2 ih2 = new inherit2();
		ih2.it("홍길동", "aaa5");
		ih2.print();
	}
}
class inherit1{
	private String nm;//inherit1 해당 부분에서만 작동
	protected String pw;//inherit1, inherit2에서 모두 작동 되도록 하여, 외부에서 로드 못함
//	public String pw2; > 공통으로 다 사용가능. 
//	public String aa = nm; // 이게 먼저 실행되기 때문에 홍길동이 아님.
	static String aa;//private으로 받은 부분을 inherit2에서도 사용할 수 있또록 하는것
	
	public void it(String d1,String d2) {
		this.nm =d1;
		this.pw =d2;
		this.aa=this.nm;
		
		
	}
	
}
class inherit2 extends inherit1{
	public void print() {
//		System.out.println(this.nm+""+this.pw); > 실행 안됨
		System.out.println(this.aa+""+this.pw);
	}
	
	
}