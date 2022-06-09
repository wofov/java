import java.util.Random;

public class example2 {

	public int user_new(int q,int q1) {

		int msg = 0;
		if(q1<q) {
			msg = 11;
		}
		else if(q1>q) {
			msg = 22;
		}
		else {
			msg = 33;
		}
		
		return msg;
	}

}
