package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class example1 {

	public static void main(String[] args) {
		/*
		 �ܺ� Ŭ���� ����Ͽ� ���� ���μ����� �ۼ��Ͻÿ�
		 ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�. ��, 2���� �迭�� �ϳ��l �迭��
		 ��ġ���� �մϴ�. �� ��� �ߺ��� ���� �ϳ��� ó���մϴ�. 
		 1�� �迭 : 11,22,33,44,55
		 2�� �迭 : 8,10,11,19,44
		 ��� ��� 8,10,11,19,22,33,55
		 �ߺ��� �� �� ����
		 2�� ������ �� 1���� �߰�
		 1�� �����͸� ��Ʈ �������� 
		 */

		ori a = new ori();
		a.data();
	}

}
class ori{
	
	ArrayList<Integer> a1,b1=null;
	public void data() {
		Integer[] a = {11,22,33,44,55};
		Integer[] b = {8,10,11,19,44};
		this.a1 = new ArrayList<>(Arrays.asList(a));
		this.b1 = new ArrayList<>(Arrays.asList(b));
		int w=0;
		do {
			int ww = 0;
			int z= this.b1.size();
			while(ww<z) {
				if(this.a1.get(w)==this.b1.get(ww)) {
					this.b1.remove(ww);
					this.b1.add(0);
				}
				ww++;
			}
		w++;
		}while(w<this.a1.size());

		int t=0;
		while(t<this.b1.size()) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}
			t++;
		}

		Collections.sort(this.a1);
		System.out.println(this.a1);
		
	
	}
}





