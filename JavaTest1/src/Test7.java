import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 색상을 영어로 표기할까요?");
		String user = sc.next();
		String a[]= {"빨강", "주황", "노랑", "초록"};
		String msg = "";
		for(String z : a) {
			switch(user) {
			case "빨강" ->{ msg = "red";}
			case "주황" ->{ msg = "orange";}
			case "노랑" ->{ msg = "yellow";}
			case "초록" ->{ msg = "green";}
			default ->{msg = "해당 단어는 번역이 되지 않습니다";}
			}
		}
		System.out.println(msg);
		sc.close();
	}
}
