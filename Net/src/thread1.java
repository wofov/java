//Thread ��� ��� 
public class thread1 {

	public static void main(String[] args) {
		
		int w = 0;
		while(w<6) {
			box b = new box(w);
			Thread t = new Thread();
			t.start();
			//������ �޼ҵ带 ȣ���Ͽ� �ش� Ŭ������ cpu �Ѱ踦 ���� 
			box2 b2 = new box2(w);
			Thread t2 = new Thread();//������ ����(������� �۵���ų Ŭ������ Ŭ����)
			t2.start();
			
			w++;
		}
	
		box3 b3 = new box3();
		Thread t3 = new Thread(b3);
		t3.start();
		



	}

}
//extends
class box extends Thread{
	int no = 0;
	public box(int a) {
		this.no=a;
	}
	@Override
	public void run() {//�⺻�޼ҵ�
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
		}
		System.out.println(this.no);
		
		

	}
}
class box2 implements Runnable{
	int no =0;
	public box2(int a) {
		this.no = a;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			
		}catch(Exception e1) {
			
		}
		System.out.println(this.no);
		
		
	}
	
}

class box3 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("a1");
		
	}
	
}




