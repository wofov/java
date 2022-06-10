
public class RealTest3 {

	public static void main(String[] args) {
		int a=1;
		int c;
		int total = 0 ;
		while(a<6) {
			int b=1;
			while(b<10) {
				c=a+b;
				total += c;
				b++;
			}
			a++;
		}
		System.out.println(total);
	}
}
