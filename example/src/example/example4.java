package example;

import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/*
		 배열 생성 +기본(클래스)메소드 문제
		 사용자가 다음 질문데 값을 입력하게 됩니다.
		 학급 학생 이름을 입력하세요
		 무조건, 총 배열 데이터는 5개가 생성됩니다.
		 별도의 메소드에서 해당 사용자가 입력한 값을 배열로 구성 하여
		 출력하세요
		 예시) qqw 23 we23 입력하면
		 [qqw 23 we23] 이렇게 출력
		 */
		//String a1 []= new String[5];
		Scanner sc = new Scanner(System.in);
		String aa = "";
		int f=0;
		String nn;
		while(f<5) {
			System.out.println("학급 학생 이름을 입력");
			nn=sc.next();
			aa +=(nn+" ");
			
			f++;
		}
		name1(aa);
		
	}
	public static void name1(String a) {
	
		
		String userin[] = a.split(" ");//split 문자열 또는 숫자열을 배열로 만들 수 있는 명렁어
		System.out.println(Arrays.toString(userin));
		
		
		
		
		
	}
	
	}
