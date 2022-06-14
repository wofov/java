
public class opp6 {

	public static void main(String[] args) {
		//배열 형태의 생성자 객체 주상 클래스 만들기 
		box b[]= {new abox(), new abox2(),new abox3() };
//		b[0].dataload();
//		b[1].dataload();
		for(box z : b) {//for each 특정 클래스를 중지 하지 못함. 
			z.dataload();
		}
		int w=0;
		while(w<b.length){
			if(w!=1) {
				b[w].dataload();
			}
			w++;
		}
	}

}
abstract class box{
	public abstract void dataload(); 
	//추상화 abstract 코드를 정형화, 개별적인 메소드를 막는, 확장성
	//캡슐화,은닉화 public private protected 게터 세터
	//다형성 오버로딩 오버라이드
	//상속성 재사용 extends , 재사용 -재귀함수 등등
	/*
	 
	 */
}
class abox extends box{
	@Override
	public void dataload() {
		System.out.println("te1");
	}
}

class abox2 extends box{
	@Override
	public void dataload() {
		System.out.println("te2");
	}
}
class abox3 extends box{
	@Override
	public void dataload() {
		System.out.println("te3");
	}
}