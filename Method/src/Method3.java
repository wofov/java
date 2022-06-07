
public class Method3 {

	public static void main(String[] args) {
		/*
		 응용문제 
		 인수값 2개의 숫자를 적용하여 계산되도록 합니다.
		 최종 계산 값을 받아서 결과를 출력하세요
		 157, 45
		 157*45 
		 최종 결과 값 출력 :
		 */
 
		add cc = new add();
		//System.out.println(cc.a11(157, 45)); << 이것도 가능
		int abc = cc.a11(157, 45);
		System.out.println(abc);
		cc.m2();
		cc.a11();
	}

}
class add{
	public int a11(int a1, int a2) {
		//a11 안에 인수값이 있다면 아래에 있는 a11은 인수값이 없기 때문에 서로 다른걸로 인식함
		int b1 = a1*a2;
		return b1;
	}
	public void a11() {
		System.out.println("연습입니다.");
	}
	public void m2() {
		int z=a11(100,200);
		System.out.println(z);
	}
}
