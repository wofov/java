
public class oop_example1 {

	public static void main(String[] args) {
		//abstract 응용문제
		/*
		1차 배열 값이 있습니다. 해당 배열 값을 모두 더한 값을 출력하세요.
		단, abstract 기본 void 이름은 sender 입니다.
		최종 값 출력은  sender에서 출력 되도록 합니다.
		
		배열은 abstract에서 사용합니다.
		배열 데이터 : 6, 13 ,22,9,12,64,32,47,39
		 */
		now g = new now();
		g.sender();
	}
}
abstract class go{
	int num[]= {6,13,22,9,12,64,32,47,39};
	int a;
	public abstract void sender();
}
class now extends go{
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