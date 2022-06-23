import java.util.ArrayList;
import java.util.Collections;

public class te1 {

	public static void main(String[] args) {

		//http://mekeyace.dothome.co.kr/test1.txt
		/*
		 {
{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
{"65","74","23","75","68","96","88","98","54"}
}
		 */
		bb b = new bb();
		b.a1();
	}
}
abstract class aa{
	public abstract void a1();
	public abstract void a2();
	String a[][];
}
class bb extends aa{
	int ea, ea1;
	ArrayList<Integer> list =null;
	ArrayList<Integer> list2 =null;
	public void a1() {
		this.a2();
		this.list = new ArrayList<>();
		int w=0;
		while(w<this.ea1) {
			this.list.add(Integer.valueOf(this.a[1][w]));
			w++;
		}
        Collections.sort(list);
		int w3=0;
		String msg="";
		while(w3<this.ea1) {
			if(this.list.get(this.ea1-1)==Integer.valueOf(this.a[1][w3])) {
				msg="1µî " + this.a[0][w3]+" "+this.a[1][w3];
				System.out.println(msg);
			}
			w3++;
		}
	}
	public void a2() {
		this.a =new String[][] {
			{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
			{"65","74","23","75","68","96","88","98","54"}
			};
		this.ea=this.a.length;
		this.ea1=this.a[0].length;
	}
}