
public class opp5 {
    //응용 기본 형태 인수값으로 추상 메소드로 값을 넘김.
	public static void main(String[] args) {
		load1 id1 = new load1();
		id1.datain(20, 30);
		id1.call();
		load2 id2 = new load2();
		id2.datain(20, 30);
		id2.call();
	}
}
abstract class abcclass{
	int data1,data2;
	public void datain(int d1, int d2) {
		//기본 추상 메소드 이며, 모든 데이터 인수값 받아서 this 처리
		//단, 외부 클래스에서 선언하지 않음.
		this.data1 = d1;
		this.data2 = d2;
	}
	public abstract void plus();
	//각각의 class 기본으로 plus 메소드는 무조건 들어가야함
	public void call() {
		this.plus();
	}
}
class load2 extends abcclass{
//	public void call() {
//		this.avg();
//	}//>>여기먼저 해버리면 바로 아래 곱하기 sum plus실행 안됨 
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg();
	}
	public void avg() {
		System.out.println("dd");
	}
}
class load1 extends abcclass{
	@Override
	public void plus() {
		int sum = this.data1+this.data2;
		System.out.println(sum);
	}
}