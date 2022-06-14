
public class oop_example1 {
	

	public static void main(String[] args) {
		//★★★★★★★★★★★★★★★★
		
		//추상화 abstract 코드를 정형화, 개별적인 메소드를 막는, 확장성
		//캡슐화,은닉화 public private protected 게터 세터
		//다형성 오버로딩 오버라이드
		//상속성 재사용 extends , 재사용 -재귀함수 등등
		/*
		 
		 */
		//abstract 응용문제
		/*
		1차 배열 값이 있습니다. 해당 배열 값을 모두 더한 값을 출력하세요.
		단, abstract 기본 void 이름은 sender 입니다.
		최종 값 출력은  sender에서 출력 되도록 합니다.
		
		배열은 abstract에서 사용합니다.
		배열 데이터 : 6, 13 ,22,9,12,64,32,47,39
		 */
		now g = new now();
//		g.sender();
	}
}
abstract class go{
	int num[]= {6,13,22,9,12,64,32,47,39};
	int a;
	public abstract void sender();
}
class now extends go{
	private int all[];
	public now() {//★★★★
		this.all=new int[] {6,13,22,9,12,64,32,47,39};//이렇게 처리해서 아래로 this로 받아 처리 가능. 
		System.out.println("dd");
		this.sender();
	}//이거 작성하면 위에 g.sender() 없어도 출력 가능. 
	@Override
	public void sender() {
		int w=0;
		while(w<this.num.length) {
			a +=this.num[w];
			w++;
		}
		System.out.println(this.a);
	}
}