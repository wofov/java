package ex;

import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		//ȸ������ db�� �ִ� ��Ȳ�Դϴ� 
		/*
		 �ش� ���� �߿��� naver.com ���� �ּҸ� ����ϴ� �� �� �ο����� ��� 
		 ��,db�� �ε�� �߻�Ŭ�������� �ε�ǵ��� �մϴ� .
		 �̸�/��Ż�/��ȭ��ȣ/����/�ּ�/�̸���/����Ʈ
		 
		 http://mekeyace.dothome.co.kr/example2_db.txt
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
		 */

		one o = new one();
		o.fr();
	}
}
abstract class aa11{
	public int b1,c1;
	public abstract void fr();
	String user [][] =  { {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
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
}
class one extends aa11{
	@Override
	public void fr() {
		this.b1=user.length;
		int w= 0;
		while(w<this.b1) {
				String zero[] = user[w][5].split("@");
//				System.out.println(Arrays.toString(zero));
				if(zero[1].equals("naver.com")) {
					this.c1++;
				}
			w++;
	        }
		System.out.println(this.c1);
	}
}
