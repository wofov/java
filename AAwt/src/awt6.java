import java.util.ArrayList;
import java.util.Random;

//������ȣ �߼� �ý��� awt6.abstract
public class awt6 {

	public static void main(String[] args) {
		gg1 g = new gg1();
		g.fire();

	}

}
class gg1 extends awt6_absteact{
	 String zz;
	 String zz1;
	public void pp() {
		
	}
	public void make() {
		Random r = new Random();
		ArrayList<Integer> aa = new ArrayList<>();
	    int a;
		int w=0;
		while(w<4) {
			a=r.nextInt(9);
      		aa.add(a);
			w++;
		}
		System.out.println(aa);
		String qq="";
		int ww=0;
		while(ww<4) {
			qq = qq+Integer.toString(aa.get(ww));
			//String aa = String.valueOf(aa.get(ww));>>�̰͵� ����
			ww++;
		}
		System.out.println(qq);
		this.zz=qq;
	}
	public void user_num(String get) {
		this.zz1=get;
	}
	public String re() {
		String msg12;
		if(this.zz1.equals(this.zz)) {
			msg12="���� ����";
		}
		else {
			msg12="������ȣ�� �ٽ� �Է����ּ���";
		}
		return msg12;
	}
	
}