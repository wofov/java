import java.util.Random;

public class example2 {

	private String msg = "";
	
	public void user_new(int q,int q1) {

		if(q1<q) {
			this.msg = "다운";
		}
		else if(q1>q) {
			this.msg = "업";
		}
		else {
			this.msg = "정답";
		}
		
	}
	public String user2() {
		return this.msg;
	}

}
