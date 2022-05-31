import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 응용문제 
		 사용자가 다음과 같은 질문을 받습니다.
		 1부터 5번까지 숫자를 하나 입력하세요.
		 결과
		 1-5%할인권
		 2-10할인권
		 3,4-택배비 무료
		 5-다음기회
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5까지 숫자 하나 입력");
        int a = sc.nextInt();
        String msg;//★★★★ 치환
        /*
        switch(a) {
        case 1:
        	msg ="5%";
        	break;
        case 2:
        	msg ="10%";
        	break;
        case 3:
        case 4:
        	msg ="택배비 무료";
        	break;
        default:
        	msg ="다음기회에";
        	break;
        }*/
        /*
         switch version
         */
        switch(a) {
        case 1 ->{//14버전 이상 우리는 지금 17
        	msg ="5%";
        }
        case 2->{
        	msg ="10%";
        }
        case 3,4 ->{
        	msg ="택배비 무료";
        }
        default ->{
        	msg ="다음기회";
        }
        }
        System.out.println(msg);
        sc.close();
	}

}
