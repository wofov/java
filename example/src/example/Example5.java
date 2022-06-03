package example;

public class Example5 {

	public static void main(String[] args) {
		
		/*
		 2차 배열 +기본(클래스) 메소드 문제
		 등록된 고객 중 vip고객만 리스트를 출력흐세요
		 {"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"}
		{"gold","vip","guest","gold","vip","vip","guest"}	
		
		결과 출력 : 이순신, 세종대왕, 김유신
		 
		 */
		String user[][]={
				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"gold","vip","guest","gold","vip","vip","guest"}	
		};
		
		gg(user);
		
	}
	public static void gg(String mem[][]){
		
//		mem[1][1]
//				mem[1][4]
//				mem[1][5]
		int ab = mem[0].length;
		int c = 0;
		String msg;
		String total = "";
		while(c<ab) {
			if(mem[1][c].equals("vip")) {
				msg=mem[0][c];
				total = total +msg+", ";
				
			}
			
			c++;
		}
		System.out.println(total);
	}
//	int gp =mem.le
//			while(w<gp) {
//				int ww= 0
//						while(ww<ea) {
//							if(data[w][ww].equals("vip")) {
//								System.out.println(data[0][ww]);
//							}
//							
//							ww++;
//					
//				
//						}
//				w++;
//			}

}
