
public class oop_example1 {

	public static void main(String[] args) {
		//abstract ���빮��
		/*
		1�� �迭 ���� �ֽ��ϴ�. �ش� �迭 ���� ��� ���� ���� ����ϼ���.
		��, abstract �⺻ void �̸��� sender �Դϴ�.
		���� �� �����  sender���� ��� �ǵ��� �մϴ�.
		
		�迭�� abstract���� ����մϴ�.
		�迭 ������ : 6, 13 ,22,9,12,64,32,47,39
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