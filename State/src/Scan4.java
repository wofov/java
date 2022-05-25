import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	    System.out.println("입력할 내용을 적어주세요!!");
	    //String memo = a.next();
	    //next()는 스페이스바 입력 전까지만 적용
	    //nextline()는 스페이스바 포함 모두 입력 허용
	    String memo = a.nextLine();
	    System.out.println(memo);
	    a.close();//Scanner 종료, 기본으로 적용 해주어야 합니다
	    
	    String a1 = "park";
	    int a2 = 22;
	    
	    //System.out.println(a1 + "님의 나이는"+ a2 + "입니다");
	    //System.out.printf("%d님의 나이는 %d입니다.",a1,a2);
	    System.out.printf("%s님의 나이는 %s 입니다.",a1,a2);
	    //printf : f라는 뜻이 포맷을 뜻함.
	    //String, 숫자도 가능(int) : %s
	    //int : %d
	    // 중요사항 %f : float, double
	    // %t : date, time 시간, 날짜
	    // %b : boolean ( true, false)
	              
	    
	    
	}

}
