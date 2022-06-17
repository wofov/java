package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class sadasd {

	public static void main(String[] args) {
	/*
	 추상 하는 방법 사용방법>>오버라이드 꼭 사용 하기 
	 */
	user_list user = new user_list();
	user.setter("naver.com");
	System.out.println(user.getter());
	}

}
abstract class basic{
	public abstract void pro();
	public abstract void setter(String email);
	public abstract int getter();//>>리턴 값 받는 것.
	ArrayList<String> abc =null;
	public String aa[][];
	
}
class user_list extends basic{
	int ea = 0 ;
	int total=0;
	@Override
	public void setter(String email2) {
		pro();
		int w=0;
		while(w<ea) {
			this.abc=  new ArrayList<>(Arrays.asList(aa[w][5]));
			
			if(this.abc.get(0).indexOf(email2)!=-1) {
				//this.abc[w][5].indexOf(email2)
				// 인덱스오브 -1은 해당 값이 없음. 그 외의 모든 정수는 값이 있음. 
				//인덱스 사이에 get 있는거 배열 때문에 
				this.total++;
			}
			w++;
		}
	}
	@Override
	public int getter() {
		return this.total;
	}
	@Override
	public void pro() {
		this.aa = new String [][] { 
			     {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
				 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
				 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
				 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
				 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
				 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
				 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
				 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
				 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
				 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
				 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
		};
		this.ea = this.aa.length;
	}
}
