import java.util.Random;

public class example2 {

	private String msg = "";
	
	public void user_new(int q,int q1) {

		if(q1<q) {
			this.msg = "�ٿ�";
		}
		else if(q1>q) {
			this.msg = "��";
		}
		else {
			this.msg = "����";
		}
		
	}
	public String user2() {
		return this.msg;
	}

}
