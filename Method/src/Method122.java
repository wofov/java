
public class Method122 {

//	
//		public static void main(String[] args) {
//			bbox2 bx = new bbox2();
//			bx.b2("이순신");
//
//		}
//
//	}
//	class bbox{//기본 외부 클래스 메인 에서 필요한 사항을 체크
//		protected String user_info;
//		private String user_pw;
//		public String user_rpw;
//		public bbox() {
//			this.user_info = "홍길동";
//			this.user_pw="abcd";
//			this.user_rpw=this.user_pw.replace("abcd","asd22");
//		}
//		
//		
//	}
//	class bbox2 extends bbox{//bbox에 대한 모든 정보를 bbox2와 공유함
//		//단, bbox중에서 private으로 셋팅된 값은 공유하지 않음.
//		public void b2(String nm) {//main class에서 bbox2를 로드 후 
//			//해당 값에 인수값을 적용하여 bbox class에 있는 필드명 중 user_info에 적용 하게 되는 형태
//			this.user_info = nm;
//			System.out.println(this.user_info);
//			//System.out.println(this.user_pw);//private 다른 클래스에서 로드 불가
//			System.out.println(this.user_rpw);
//		}

}
