
public class oop3 {
	//multi thread : start ,run, sleep, setstop
//멀티 쓰레드 : cpu에 코어와 관계가 있다. 
	public static void main(String[] args) {
		//쓰레드 thread : 프로세스 내부에서 독립적으로 실행되는 작업을 뜻함.
		//multi thread : 프로세스 내부에서 두 가지 이상의 작업을 동시 사용
		//쓰레드 > 출력
		//멀티 쓰레드 > 출력 다른일1 다른일2 /멀티 태스킹
		Thread my = new mythread();
		Thread my2 =new test2();
		my.start();
		my2.start();//쓰레드 메소드에 기본 run을 작용하기 위한 start 명령어 입니다. 
		int a1 = 1;
		while(a1<6) {
			System.out.println("내부 클래스 : "+a1);
			a1++;
		}
	}
}
class test2 extends Thread{
	@Override
   public void run() {
		int a2 = 1;
		while(a2<6) {
			System.out.println("외부2 클래스 : "+a2);
			a2++;
		}
	}
}
class mythread extends Thread{//쓰레드 : JVR기본으로 탑재 되어 있는 메소드
	//쓰레드는 단독으로 사용하지 않음. extends 랑 같이 사용
	@Override
	public void run() {//run이란 : 멀티 메소드 기본 실행 메소드 
		int a = 1 ;
		while(a<6) {
			System.out.println("외부1 클래스 : "+ a);
			a++;
		}
	}
}