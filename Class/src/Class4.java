
public class Class4 {

	public static void main(String[] args) {
		Member mb = new Member();
		//��ü : Member
		// mb : �ν��Ͻ�
		//new Member() : �޸𸮿� �ν��Ͻ� ���� �����Ͽ� ����� �� �ֵ��� ��.
		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total=25 * mb.user_agree;
		System.out.println(total);
		final int agree = mb.user_agree;//member �ν��Ͻ��� �ʵ尪���� �ε��� > agree��� �ʵ� ��������� ����
		mb.user_agree = 80;//�޸𸮿� ��ϵ� �ʵ�� �ش� �Ǵ� ���� ������
		System.out.println(agree);
		/*
		 �Ϲ� Ŭ���� �޼ҵ� �κ� 
		 �Ϲ� Ŭ���� �޼ҵ� ���� ������ ��ü �� �ν��Ͻ��� ���� �ʿ䰡 �����ϴ�.
		 Static ��ü�� �޼ҵ� ���� ������ ��ü �� �ν��Ͻ��� ���� �ʿ䰡 ����
		 ��? static ��ü�� �޼ҵ� �ν��Ľ��� ����Ѵ�
		 */
		coupon.events();
     	Member.Member_events();
		

	}

}
class Member{//Ŭ����
	String user_name; //���� �ʵ���� ���� �ϴ°�
	int user_age;
	int user_level;
	int user_agree =1;//���� �ʵ�� �ʵ� ���� ����
	public static void Member_events() {
		coupon.events();//Ŭ������ ���� �޼ҵ带 �ٷ� ��°���
//		��, events��� �޼ҵ忡 ���� �ʵ� �� ���� �ʵ尪��
//		clas  ���� �ϰ� �Ǹ� �׶��� ��ü+�ν��Ͻ��� �����ؾ߸� �ε尡 �˴ϴ�.
	}
	
	
}
/*
 �ϳ��� project�� ���� �ٸ� package�� �ѹ� ����� class���� �ٸ� ������ 
 ����Ͻ� �� �����ϴ�.
 */
class coupon{
	public static void events() {
		int cp=30;
		
		
		
		
	}
}