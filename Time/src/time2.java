import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class time2{
	/*
	1.�ü�� ������ ����
	2.ip �ּҶ�? ipv4,ipv6 localhost 127.0.0.1
	3.�������̶�?
	4.tcp/ip��?
	5.FTP,SMTP,HRRP,SNMP,DNS
	6.JAVA ��� this,�޼ҵ�,��ĳ�� ���
	�迭~�������̽�
	
	 */

	public static void main(String[] args) {
		Timer timer = new Timer();//timer util�� �̿��Ͽ� �ð��Լ��� ���
	    timer.scheduleAtFixedRate(new gogo(), 0, 5000);
	    //(������ �޼ҵ�orŬ���� , �� �� �ڿ� ���� , �ݺ��� �ð� )
	    //scheduleAtFixedRate : ���������� �ݺ� �۾��� �� ��� 
	    TimerTask tk = new TimerTask() {
			int a=0;
			String adata[]= {"�浿","�̼���","������","������"};
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
class gogo extends TimerTask{//TimerTask : �ð��۾� 
    public void run() {//run ���� ���� 
	    System.out.println("�ð� �Լ� �� �۵��� �ɱ��?");
   }
}