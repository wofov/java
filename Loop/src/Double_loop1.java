import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("H:m:s");
		System.out.println(date.format(today));
		System.out.println(time.format(today));
        //format : �԰�ȭ �� ���·� ���� ǥ���� �� ����ϰ� �˴ϴ�.
		//ex)1000 > 1,000 �̷������� 
	    int f;
		for(f=1;f<10;f=f+3) {// 2�Ǵ� 3�� �����ϴ� ��
			System.out.print(f);
		}
	
/*
 3���� ��ǰ
 ���ڵ�� ��ǰ�� �Է½����ּ���"
 �ݾ��� �Է��ϰ� ���� 
 ���� %�� �Է����ּ��� '
 ��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ�
 �����ݾ��� ���� �Ǿ� ��µǵ��� �մϴ�
 */
	}
	int money = 10000;
	int coupon = 20;
	double a = coupon * 0.01;
	double b = money * a;
	double c= money - b;
	
}