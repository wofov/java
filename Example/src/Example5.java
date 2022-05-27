
public class Example5 {

	public static void main(String[] args) {
		/*
		 응용문제 5
		 */
		int a= 1;
		int total=0;
		while(a<13) {
			if(a%2==0) {
			total += a;
		
			}
			a++;
		}
		System.out.println("1부터 12까지 짝수의 합은" + total + "입니다");

	}

}
