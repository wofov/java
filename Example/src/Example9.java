import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 응용문제 9
		 A학생에 대한 성적을 입력 받고 총 점수가 나오는 프로그램을 제작합니다
		 "점수를 입력하세요" 라는 문구가 총 5번이 나오게되며,
		 모든 점수는 합산하여 출력합니다
		 // 모든 점수는 합산 한 후 5개의 점수에 대한 평균 값을 출력하셔야 합니다.
		  * 출력 메세지는 "해당 점수의 평점은 : " 출력
		  * 단, 평점 점수가 40점 이하 일경우 재시험입니다." 라고 메세지를 출력후 프로세서는 종료합니다.
		  * 40점 이상일 경우 "합격" 이라고 메세지를 출력하십시오
		  * 
		  * 추가기획
		  * "입력하실 과목수를 적어주세요:" 라고 제일먼저 출력 후 해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 
		  * 평균 값이 적용 되어야 합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목수를 적어주세요");
		int c=sc.nextInt();
		int total = 0;
		int a=1;
		int b;
		do {
			System.out.println("점수를 입력하세요");
			b=sc.nextInt();
			total +=b;
			if(a==c) {
				break;
			}
			a++;
		}while(a<6);
		String msg;
		if(total/c <=40) {
			msg = "재시험";//★★★★★이거 자주 사용하기, msg 치환
			}
			else {
				msg = "합격";//★★★★★이거 자주 사용하기, msg 치환
			}
		System.out.println("평균 점수는 "+(double)total/c+"점 이며 "+msg);//★★★★★이거 자주 사용하기, msg 치환
        sc.close();
	}

}
