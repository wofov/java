package example;

import java.util.Arrays;
import java.util.Scanner;

public class example44 {

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
		String a1 []= new String[5];
		
		name1(a1);
		}
		
	
	
	public static void name1(String aa[]) {
		Scanner sc = new Scanner(System.in);
		int z=0;
		int z1=aa.length;
		String name;
		while(z<z1) {
			System.out.println("학급 학생 이름을 입력");
			name = sc.next();
			aa[z]=name;
			z++;
		}
		System.out.println(Arrays.toString(aa));
	}

	


	}


