
public class Test2 {

	public static void main(String[] args) {
		String msg;
		int point = 100;
		if(point >= 90) {
			msg = "��� A �Դϴ�";
		}
		else if(point<90 && point>=70) {
			msg = "��� B �Դϴ�";
		}
		else if(point<70 && point>=50){
			msg = "��� C �Դϴ�";
		}
		else {
			msg = "�Ϲ� ����Դϴ�";
		}
		System.out.println(msg);
	}
}
