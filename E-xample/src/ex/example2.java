package ex;

import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		//회원정보 db가 있는 상황입니다 
		/*
		 해당 정보 중에서 naver.com 메일 주소를 사용하는 고객 총 인원수를 출력 
		 단,db를 로드시 추상클래스에서 로드되도록 합니다 .
		 이름/통신사/전화번호/나이/주소/이메일/포인트
		 
		 http://mekeyace.dothome.co.kr/example2_db.txt
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
		 */

		one o = new one();
		o.fr();
	}
}
abstract class aa11{
	public int b1,c1;
	public abstract void fr();
	String user [][] =  { {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
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
