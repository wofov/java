package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class sadasd {

	public static void main(String[] args) {
	/*
	 �߻� �ϴ� ��� �����>>�������̵� �� ��� �ϱ� 
	 */
	user_list user = new user_list();
	user.setter("naver.com");
	System.out.println(user.getter());
	}

}
abstract class basic{
	public abstract void pro();
	public abstract void setter(String email);
	public abstract int getter();//>>���� �� �޴� ��.
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
				// �ε������� -1�� �ش� ���� ����. �� ���� ��� ������ ���� ����. 
				//�ε��� ���̿� get �ִ°� �迭 ������ 
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
			     {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
				 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
				 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
				 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
				 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
				 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
				 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
				 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
				 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
				 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
				 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
		};
		this.ea = this.aa.length;
	}
}
