
public class Thread_pro2 {

	public static void main(String[] args) {
		/*
		 ���빮�� Thread�� �̿��Ͽ� �� �迭�� ���� ������������ ��� ���Ͽ� 
		 ����� ����ϴ� �������α׷��� �����Ͻʽÿ�.
		 */
		int data[] = {6,9,10,15,3,17};
		//6�̶�� �迭 ���� �μ������� ������� ���� 
		int w = 0 ;
		while(w<data.length) {
			da d = null;
			d = new da(data[w]);
			d.start();
			w++;
		}
	}
}
class da extends Thread{
	int aa ;
	int total;
	public da(int n) {
		this.aa = n;
	}
	@Override
	public void run() {
		while(this.aa>0) {//�μ����� ���� ���� 
			this.total += this.aa;
			this.aa--;
		}
		System.out.println(this.total);
	}
}