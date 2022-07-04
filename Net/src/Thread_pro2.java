
public class Thread_pro2 {

	public static void main(String[] args) {
		/*
		 응용문제 Thread를 이용하여 각 배열의 값을 내림차순으로 모두 더하여 
		 결과를 출력하는 응용프로그램을 제작하십시오.
		 */
		int data[] = {6,9,10,15,3,17};
		//6이라는 배열 값이 인수값으로 쓰레드로 전달 
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
		while(this.aa>0) {//인수값을 받지 못함 
			this.total += this.aa;
			this.aa--;
		}
		System.out.println(this.total);
	}
}