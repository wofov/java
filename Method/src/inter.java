/*
extends : 자식 클래스에서 하나의 부모만 로드
implements 자식 클래스에서 여러개의 부모만 로드(단, 에노케이션 무조건 사용)

 */



public class inter implements ime1,ime2{

	@Override
	public void c1() {
		System.out.println(names);
		System.out.println("인터페이스_1");
	}
	@Override
    public void c2() {
		System.out.println("인터2");
	}
	public static void main(String[] args) {
		inter it = new inter();
		it.c1();
		it.c2();
		

	}

}
