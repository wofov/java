package ex;

public class example4 {

	public static void main(String[] args) {
		/*
		 ���Ե� ��� ȸ�� ����Ʈ �� ���� ���Ͻÿ�.
		 �� �߻� ���.
		 */

		no2 no = new no2();
		no.zz();
		int c = no.ge();
		System.out.println("ȸ�� ��ü�� ����Ʈ �հ�� "+c+"�� �Դϴ�");
	}

}
abstract class no1{
	public abstract void se();
	public abstract int ge();
	public abstract void zz();
	public String user[][];
	
}
class no2 extends no1{
	
	int a1=0;
	int b1=0;
	@Override
	public void se() {
		this.user = new String[][] {
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
		         
		       
	}
	@Override
	public int ge() {
		return this.a1;
	}
	@Override
	public void zz() {
		 se();
		 int w=0;
	       int ea=this.user.length;
	       while(w<ea) {
	    	   this.b1=Integer.valueOf(this.user[w][6]);
	    	   //Integer.parseInt(null) < �̰͵� ���� �ڷ��� ������ value�� ���� ����
	    	   this.a1 += this.b1;
	    	   w++;
	       }

	}
}