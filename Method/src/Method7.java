import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		apink ap =new apink("ȫ�浿",23,"123@gfg",-1000);
	
		System.out.println(ap.data());
		System.out.println(ap.data2());
	}

}

class apink{
	//private���� class �ʵ忡�� �����ؾ��մϴ�.
	String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
	
		if(this.nm=="ȫ�浿") {
			this.nm="hong";
			String e[] = this.email.split("@");//�̸��� �߿� �̸��� ������ �������� ���� �迭�� ������ �۾�
			System.out.println(Arrays.toString(e));
			this.email_cp=e[0];
			
		}
		
		
	}
	public apink(String nm1,int age2,String email3,int point4) {//private�� �ȿ��� ������� ����
	
		//setter ����
		this.nm = nm1;
		this.email=email3;
		if(point4<0) {
			this. point = 0;
		}
		else {
			this .point=point4;
		}
		
	
		names();
				
	}
	public String data() {
		
		return this.nm;
		//���� �ؿ� �ڵ� �ۼ� �� ���� ���� 
		//������ �� �������� ����ϴ� �ڵ��Դϴ�.
	}public int data2() {
		//getter ���� 
		return this.point;
	}
}
