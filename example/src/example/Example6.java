package example;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 응용문제
		 2차배열이며, 데이터는 다음과 같다
		 {"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"}
		 {3000,1000,25000,19800,5750,3630,0}
		 프로그램 시작과 동시에 
		 "포인트를 검색할 고객명을 입력하세용"
		 입력한 값은 별도의 클래서를 제작 하여 해당 메소드 값으로 매게변수를 이용하여
		 전달 후 해당 결과 값을 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("포인트를 검색할 고객명 입력");
		String zz = sc.next();
		users aa = new users();
		aa.pp(zz);
		sc.close();
		aa=null;//값 초기화 데이터 관리하는 법
	}
}
class users{
	public static void pp(String a) {
		String bb[][]= {
				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"3000","1000","25000","19800","5750","3630","0"}
		};
	 
		int a11 = bb.length;
		int a22 = bb[0].length;
	    int po = 0;
	    while(po<a22) {
	    	if(a.equals(bb[0][po])) {
	    		System.out.println(bb[1][po]);
	    	}
	    	po++;
	    }
	}
}