
public class class2 {

	public static void main(String[] args) {
		/*
		 응용문제 더블 클래스 이용하여 자식 클래스에 결과값을 출력하는 프로세서를 제작하시오
		 클래스는 2가지가 있습니다.
		 부모클래스 명은 mother
		 자식클래스 명은 child
		 메인 클래스에서 mother로 값을 전달.
		 30 50 숫자값을 적용합니다
		 child에서 부모클래스에 있는 값을 받아 2개의 숫자를 곱한 값을 출력
		 */

		mother m = new mother(30, 50);
		mother.child mm = m.new child();
		mm.mini();
	}

}
class mother{
	int a1, b1;
	public mother(int a, int b) {
		this.a1 = a;
		this.b1 = b;
		
	}
	class child{
//		int aa = mother.this.a1;
//	    int bb =  mother.this.b1;
		public void mini() {
//			int cc= this.aa*this.bb;
			int nn =mother.this.a1 * mother.this.b1;
			System.out.println(nn);
		}
		
	}
}