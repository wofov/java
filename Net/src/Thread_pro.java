//thread�� ���� Ŭ�������� ��� ����. extends(class), implements(interface) 
public class Thread_pro {

	public static void main(String[] args) {
		//���������� ó����
		class_box cb = new class_box();
		for(int a=0;a<10;a++) {
			cb.run("Ŭ���� ó�� ��Ȳ"+a);
		}
		//Thread�� �̿��Ͽ� ������ ó�� �Ǵ°ź��� ó����. 
		for(int b=0;b<10;b++) {
		cpu_box cp = new cpu_box("������ ó�� ��Ȳ"+b);
		cp.start();
		}
		
		call_box c = null;
		
		int w = 0;
		String msg = null;
		//msg.length();>> null �ѱ��ھ� �ԷµǼ� 4�� ���
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
			 Thread�� �̿��Ͽ� ���� ����ó�� ����̸�, ������ �߻��ϴ��� �ش� ������ �߻��� 
			 Thread�� ����ó�� �� �� ������ ��� ó���ϴ� ����
			 */
				if(this.call.length()>0) {
				//��� 1 (���� ���� ��Ű�� ���̶��)
				Exception ex = new Exception();
				throw ex;
				
				//�溡2 _ throw new Exception();
				
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

