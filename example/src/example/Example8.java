package example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 다음 사용자가 복권 관련 프로그램을 요청했습니다.
		 사용자가 총 5개의 숫자를 입력합니다.
		 "1~46 번 사이에 숫자를 입력하세요"
		 5개 숫자를 배열로 생성(main에서 처리)
		 
		 외부 class를 이용하여 pc가 직접 당첨 번호 5개를 랜덤하게 뽑아냅니다.
		 pc가 뽑은 5개의 숫자를 배열로 생성합니다(외부 클래스)
		 
		 별도의 결과 메소드를 하나 더 생성하여
		 사용자가 입력한 5개의 배열 데이터와 pc가 뽑은 배열 데이터를
		 해당 메소드로 전달하여, 출력하세요.
		 
		 단 모든 반복문은 do while문
		 */
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int a1;
		int pp[] = new int[5];
		do {
			System.out.println("1~46번 사이에 숫자를 입력하세요");
			a1 = sc.nextInt();
            pp[a]=a1;
			a++;
		}while(a<5);
		A11.bb1(pp);
		sc.close();
	}
}
class A11{
	public static void bb1(int rr[]) {
		Random r = new Random(); 
		int pp1[]= new int[5];
		int ww=0;
		do {
            pp1[ww]=r.nextInt(45)+1;       	
			ww++;
		}while(ww<5);
		bb2(rr,pp1);
	}
	public static void bb2(int rr1[],int pp12[]) {
		System.out.println(Arrays.toString(rr1) + " " + Arrays.toString(pp12));
	}
}