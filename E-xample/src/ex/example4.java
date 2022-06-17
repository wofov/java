package ex;

public class example4 {

	public static void main(String[] args) {
		/*
		 가입된 모든 회원 포인트 총 합을 구하시오.
		 단 추상 사용.
		 */

		no2 no = new no2();
		no.zz();
		int c = no.ge();
		System.out.println("회원 전체의 포인트 합계는 "+c+"점 입니다");
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
	    	   //Integer.parseInt(null) < 이것도 같은 자료형 하지만 value가 좀더 빠름
	    	   this.a1 += this.b1;
	    	   w++;
	       }

	}
}