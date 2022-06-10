
public class Test2 {

	public static void main(String[] args) {
		String msg;
		int point = 100;
		if(point >= 90) {
			msg = "등급 A 입니다";
		}
		else if(point<90 && point>=70) {
			msg = "등급 B 입니다";
		}
		else if(point<70 && point>=50){
			msg = "등급 C 입니다";
		}
		else {
			msg = "일반 등급입니다";
		}
		System.out.println(msg);
	}
}
