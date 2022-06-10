
public class Test5 {

	public static void main(String[] args) {
		int a=1;
		int total=0;
		while(a<100) {
			total +=a;
			if(total>=4000) {
				System.out.println(total);
				break;
			}
			a++;
		}
	}
}
