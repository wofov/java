package Ab;

import java.util.Arrays;
import java.util.Scanner;

public class method_1 extends ide_mth1{//package Ab2���� import�� �� �ֵ��� �ϸ�, �ܺ� Ŭ���������� �����ϰ� �����´�. 
	public void recall() {//�ٸ� ��Ű�� ������ �� public �ۼ��ϱ�.
		System.out.println("test");
	}
	protected static void name() {//��Ű�� �ѱ涧 protected ���� static��� �ϱ� 
		System.out.println("test");
	}

	public static void main(String[] args) {
		/*
		 Arrays.sort �迭 �������� ����(����,�ѱ�,����) ������� ����
		 ��, ������ ��� �빮�簡 ���� ������������ ���ĵ� A,a
		 */
		
//		int number_data[]= {5,7,1,4,9,2};
//		Arrays.sort(number_data);//��������
//		System.out.println(Arrays.toString(number_data));

//		String user_data[]= {"ȫ�浿","�̼���","�庸��","������"};
//		Arrays.sort(user_data);
//		System.out.println(Arrays.toString(user_data));
		/*
		 ���빮�� 
		 ������ 2�� �����ؼ� �ϳ��� ����, �ϳ��� ���ڷ� 
		 ���� ���Ե� ����ڿ� ���̵� Ȯ�� �� �ش� ����Ʈ�� ���� �ǵ��� �մϴ�.
		 ��, ���� ����Ʈ+������ ����Ʈ�� ���� ����� ����ϼž� �մϴ�. 
		 ����� ���� Ŭ�������� �մϴ�. 
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
		String pt = this.data1+"�� ����Ʈ��"+this.total +"���� �Ǿ����ϴ�.";
		return pt;
	};

}
