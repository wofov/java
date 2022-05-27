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
        //format : 규격화 된 형태로 값을 표현할 때 사용하게 됩니다.
		//ex)1000 > 1,000 이런식으로 
	    int f;
		for(f=1;f<10;f=f+3) {// 2또는 3씩 증가하는 법
			System.out.print(f);
		}
	
/*
 3개의 상품
 바코드로 상품을 입력시켜주세요"
 금액을 입력하고 나서 
 할인 %를 입력해주세요 '
 라는 문구와 함께 해당 할인 숫자를 입력하면
 최종금액이 변경 되어 출력되도록 합니다
 */
	}
	int money = 10000;
	int coupon = 20;
	double a = coupon * 0.01;
	double b = money * a;
	double c= money - b;
	
}