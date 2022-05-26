import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		사용자가 입력한 숫자에 맞춰서 구구단이 작동되면 
		구구단 결과를 계산하여 짝수 인지 홀수 인지 출력하세요
		"구구단에 대한 숫자를 입력하세요"라고 메세지가 출력되면
		더한 값에 따라 짝수 인지 홀수인지를 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 구구단의 총합을 홀,짝인지 알려드릴까요?");
		int b=1;
		int z = sc.nextInt();
		int c;
		int total = 0;
		if(z<10) {
			while(b<10) {
				c=z*b;
				total = total +c;
			b++;
			}
		}
		if(total%2==0) {
			System.out.println("짝");
		}
		if(total%2==1) {
			System.out.println("홀");
		}
		

	}

}
