package Ab2;

public class example1 {

	public static void main(String[] args) {
//		hp b = new hp();
//		b.broken(10);
		home h[] = {new computer(),new monitor(),new hp()};
		/*
		home2 h2[] = { new hp()}; extends�� home�� �ε�
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
		System.out.println("��ǻ�� ���� ������");
		
	}
	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ�");
		
	}
	@Override
	public void broken(int a) {
		if(this.dk<=a) {
			System.out.println("��ǻ�� ���� ");
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
		System.out.println("����� ���� ������");
		
	}
	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ�");
		
	}
	@Override
	public void broken(int a) {
		if(this.dk<=a) {
			System.out.println("����� ���� ");
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
	 �޴����� �߰� ����� �ʿ��մϴ�.
	 �޴��� ����� 40~79���� / 80�̻� ���� / �ּ��۵� 20
	  1.������ ���� ������ ȭ���� ����(���� �������ε� �۵��� �ȵ�)20�̻�
	  2.������ ���޽�Ű���� ��õ x(������ �ƿ� �ȵ�) 20�̸�
	  3.
	 */
	@Override
	public void poweron() {//1~79
		System.out.println("�ڵ��� ���� ������");
		
	}

	
	@Override
	public void poweroff() {//0
		System.out.println("�ڵ��� ���� �ߴ�");
		
	}
	@Override
	public void power1() {//20�̻�
		System.out.println("ȭ���� ���� �����ϴ�.");
		
	}
	@Override
	public void power2() {//20�̸�
		System.out.println("���� �ȵǴ� ��");
		
	}
	@Override
	public void broken(int a) {
		if(this.dk<=a) {//80�̻�
			System.out.println("�ڵ��� ���� ");
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