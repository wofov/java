import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 숫자를 하나 입력하세요");
		int user = sc.nextInt();
		int a=1;
		if(user<10 && user>0) {
			do {
				System.out.printf("%d*%d=%d\n",user,a,user*a);
				a++;
			}while(a<10);
		}
		else {
			System.out.println("음수 및 10 이상의 숫자는 구구단을 이용할 수 없습니다.");
		}
		sc.close();
	}

}
