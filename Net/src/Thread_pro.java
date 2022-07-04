//thread는 메인 클래스에서 사용 안함. extends(class), implements(interface) 
public class Thread_pro {

	public static void main(String[] args) {
		//순차적으로 처리함
		class_box cb = new class_box();
		for(int a=0;a<10;a++) {
			cb.run("클래스 처리 현황"+a);
		}
		//Thread를 이용하여 빠르게 처리 되는거부터 처리함. 
		for(int b=0;b<10;b++) {
		cpu_box cp = new cpu_box("쓰레드 처리 현황"+b);
		cp.start();
		}
		
		call_box c = null;
		
		int w = 0;
		String msg = null;
		//msg.length();>> null 한글자씩 입력되서 4로 출력
		while(w<10) {
			if(w==5) {
				
			}
		c=new call_box(msg);
		c.start();
		}
		
		
		
	}
}
class call_box extends Thread{
	String call = null;
	public call_box(String z) {
		this.call  = z;
		
	}
	
	
	@Override
	public void run() {
		try {
			
			/*
			 Thread를 이용하여 강제 예외처리 방식이며, 문제가 발생하더라도 해당 문제가 발생한 
			 Thread만 예외처리 그 외 사항은 모두 처리하는 예시
			 */
				if(this.call.length()>0) {
				//방법 1 (강제 오류 시키는 법이라네)
				Exception ex = new Exception();
				throw ex;
				
				//방벙2 _ throw new Exception();
				
			}
			else {
				System.out.println(this.call.length());
			}
		}catch(Exception e) {
			
		}
	}
}

class cpu_box extends Thread{
	
	String name = null;
	public cpu_box(String a) {
		this.name =a;
		
	}
	@Override
	public void run() {
		System.out.println(this.name);
		
		
		
	}
	
	
}
class class_box {
	public void run(String name) {
		System.out.println(name);
	}
	
	
}

