import java.util.Scanner;

public class Loop_Scan2 {

	public static void main(String[] args) {
		//스캐너와 함께 while 문으로 사용자가 입력하는
		//값으로 구구단 결과가 출력되는 프로그램을 제작하시오
		Scanner a = new Scanner(System.in);
		System.out.println("원하는 구구단의 숫자를 입력하세요");
		int b = a.nextInt();
		int c=1;
		int j;
	    while(c<10) {
	    	j=c*b;
	    	System.out.printf("%d ",j);
	    	c++;
	    }
	    a.close();

	}

}
