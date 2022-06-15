package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class dd2 {

	public static void main(String[] args) {
		Integer qwe[]= {10,7,6,1,11,37,41,22};
		ArrayList<Integer> qq = new ArrayList<Integer>(Arrays.asList(qwe));
		int x = 0;
		int ea = qq.size();
		System.out.println(qq.size());
		while(x<ea) {
			if(qq.get(0)%2==1) {
				qq.add(qq.get(0));
			}
			qq.remove(0);
			x++;
		}
		System.out.println(qq);
	}

}
