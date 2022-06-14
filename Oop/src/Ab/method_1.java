package Ab;

import java.util.Arrays;
import java.util.Scanner;

public class method_1 extends ide_mth1{//package Ab2에서 import할 수 있도록 하며, 외부 클래스에서도 동일하게 가져온다. 
	public void recall() {//다른 패키지 보낼때 꼭 public 작성하기.
		System.out.println("test");
	}
	protected static void name() {//패키지 넘길때 protected 사용시 static사용 하기 
		System.out.println("test");
	}

	public static void main(String[] args) {
		/*
		 Arrays.sort 배열 오름차순 정렬(숫자,한글,영문) 관계없이 가능
		 단, 영문일 경우 대문재가 먼저 오른차순으로 정렬됨 A,a
		 */
		
//		int number_data[]= {5,7,1,4,9,2};
//		Arrays.sort(number_data);//오름차순
//		System.out.println(Arrays.toString(number_data));

//		String user_data[]= {"홍길동","이순신","장보고","김유신"};
//		Arrays.sort(user_data);
//		System.out.println(Arrays.toString(user_data));
		/*
		 응용문제 
		 변수를 2개 생성해서 하나는 문자, 하나는 숫자로 
		 현재 가입된 사용자와 아이디를 확인 후 해달 포인트가 적립 되도록 합니다.
		 단, 기존 포인트+적립금 포인트에 대한 결과를 출력하셔야 합니다. 
		 출력은 메인 클래스에서 합니다. 
		String member_ship[][]= {
				{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
				{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		};
		 */
		
		ide_mth1 ck = new ide_mth1();
		ck.setter("kim",1500);
		System.out.println(ck.getter());
	}

}
class ide_mth1 extends mth1{
	private String member_ship[][];
	private String data1;
	private int data2;
	private int ea;
	private int total=0;
	public ide_mth1() {
		this.member_ship=new String[][] {
			{"kim","park","seo","oh","lee","jang","jeong","cho","ha","wang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
	        };
	        this.ea=this.member_ship[0].length;
	}
	@Override
	public void setter(String data1, int data2) {
		this.data1=data1;
		this.data2=data2;
		this.loops();
	};
	public void loops() {
		int w= 0;
		while(w<this.ea) {
			if(this.member_ship[0][w].equals(this.data1)){
				this.total=Integer.parseInt(this.member_ship[1][w])+this.data2;
			}
			w++;
		}
	}
	@Override
	public void setter(int data3[]) {
		
	};
	@Override
	public String getter() {
		String pt = this.data1+"님 포인트가"+this.total +"증감 되었습니다.";
		return pt;
	};

}
