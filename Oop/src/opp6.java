
public class opp6 {

	public static void main(String[] args) {
		//�迭 ������ ������ ��ü �ֻ� Ŭ���� ����� 
		box b[]= {new abox(), new abox2(),new abox3() };
//		b[0].dataload();
//		b[1].dataload();
		for(box z : b) {//for each Ư�� Ŭ������ ���� ���� ����. 
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