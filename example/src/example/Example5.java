package example;

public class Example5 {

	public static void main(String[] args) {
		
		/*
		 2�� �迭 +�⺻(Ŭ����) �޼ҵ� ����
		 ��ϵ� �� �� vip���� ����Ʈ�� ����弼��
		 {"ȫ�浿","�̼���","������","������","�������","������","����屺"}
		{"gold","vip","guest","gold","vip","vip","guest"}	
		
		��� ��� : �̼���, �������, ������
		 
		 */
		String user[][]={
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
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
