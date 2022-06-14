import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class time2{
	/*
	1.운영체제 목적이 뭔지
	2.ip 주소란? ipv4,ipv6 localhost 127.0.0.1
	3.도메인이란?
	4.tcp/ip란?
	5.FTP,SMTP,HRRP,SNMP,DNS
	6.JAVA 등등 this,메소드,스캐너 등등
	배열~인터페이스
	
	 */

	public static void main(String[] args) {
		Timer timer = new Timer();//timer util를 이용하여 시간함수를 사용
	    timer.scheduleAtFixedRate(new gogo(), 0, 5000);
	    //(시작할 메소드or클래스 , 몇 초 뒤에 시작 , 반복할 시간 )
	    //scheduleAtFixedRate : 지속적으로 반복 작업을 할 경우 
	    TimerTask tk = new TimerTask() {
			int a=0;
			String adata[]= {"길동","이순신","강감찬","유관순"};
			@Override
			public void run() {
				if(a>=4) {
					a=0;
				}
				System.out.println(adata[a]);
				a++;
			}
		};
		timer.scheduleAtFixedRate(tk, 0, 3000);
	}
	

}
class gogo extends TimerTask{//TimerTask : 시간작업 
    public void run() {//run 강제 실행 
	    System.out.println("시간 함수 잘 작동이 될까요?");
   }
}