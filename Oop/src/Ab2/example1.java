package Ab2;

public class example1 {

	public static void main(String[] args) {
//		hp b = new hp();
//		b.broken(10);
		home h[] = {new computer(),new monitor(),new hp()};
		/*
		home2 h2[] = { new hp()}; extends로 home를 로드
		home2 h2[0]
		 */
//		h[0].broken(80);
//		h[1].broken(0);
		h[2].broken(15);
		hp b = new hp();
		b.broken(10);

	}

}
class computer implements home{
	@Override
	public void poweron() {
		System.out.println("컴퓨터 전원 공급중");
		
	}
	@Override
	public void poweroff() {
		System.out.println("컴퓨터 전원 중단");
		
	}
	@Override
	public void broken(int a) {
		if(this.dk<=a) {
			System.out.println("컴퓨터 고장 ");
		}
		else if(this.dk>a&& a > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
		
	}
}
class monitor implements home{
	@Override
	public void poweron() {
		System.out.println("모니터 전원 공급중");
		
	}
	@Override
	public void poweroff() {
		System.out.println("모니터 전원 중단");
		
	}
	@Override
	public void broken(int a) {
		if(this.dk<=a) {
			System.out.println("모니터 고장 ");
		}
		else if(this.dk>a&& a > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
		
	}
}
class hp implements home,home2{
	/*
	 휴대폰에 추가 기능이 필요합니다.
	 휴대폰 고장시 40~79정상 / 80이상 고장 / 최소작동 20
	  1.전원은 공급 되지만 화면이 고장(전원 공급중인데 작동이 안됨)20이상
	  2.전원을 공급시키지만 충천 x(공급이 아예 안됨) 20미만
	  3.
	 */
	@Override
	public void poweron() {//1~79
		System.out.println("핸드폰 전원 공급중");
		
	}

	
	@Override
	public void poweroff() {//0
		System.out.println("핸드폰 전원 중단");
		
	}
	@Override
	public void power1() {//20이상
		System.out.println("화면이 고장 났습니다.");
		
	}
	@Override
	public void power2() {//20미만
		System.out.println("충전 안되는 중");
		
	}
	@Override
	public void broken(int a) {
		if(this.dk<=a) {//80이상
			System.out.println("핸드폰 고장 ");
		}
		else if(this.dk>a&& a > 0) {
			this.poweron();
			if(a<20) {
				this.power2();
			}
			else if(a>=20 && a<40) {
				this.power1();
			}
		}
		else {
			this.poweroff();
		}
		
	}
}