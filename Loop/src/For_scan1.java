import java.util.Scanner;

public class For_scan1 {

	public static void main(String[] args) {
	
		 /*int a=3;
		 System.out.println(a++);
		 System.out.println(++a);
         
		int b =10;
		int c = 10;
		int d = ++b + (++c);//괄호 이용하기
		System.out.println(d);
		*/
		Scanner sc = new Scanner(System.in);//입력엔진
	    int su;//사용자입력
		int total=0;//사용자가 입력한 합계
		int f;//반복문
		for(f=1;f<4;f++) {
			System.out.println("점수를 입력해주세요");
			su = sc.nextInt();//사용자가입력한값
			total += su;//사용자가 입력한 값을 합계변수로 이관
		}
		System.out.println("총 점수의 합은 "+total);//합계
		sc.close();//엔진종료
		
		
	}

}
