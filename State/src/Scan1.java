import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		
		Scanner b = new Scanner(System.in);
		System.out.print("당신의 나이는?");
		int c = b.nextInt();
		System.out.println("해당 나이는"+c+"입니다");
		
		Scanner d = new Scanner(System.in);
		System.out.println("입력하실 금액을 적어주세요");
		int e = d.nextInt();
		if(e< 1000) {
			System.out.println("1000원 이상 금액을 입력해야 함");
		}
		else {
			System.out.println("입금이 진행됩니다");
		}
		b.close();// 스캐너 사용시 꼭 닫기.// 스캐너 사용시 꼭 닫기.
		d.close();// 스캐너 사용시 꼭 닫기.// 스캐너 사용시 꼭 닫기.
	}// 스캐너 사용시 꼭 닫기.// 스캐너 사용시 꼭 닫기.

}
