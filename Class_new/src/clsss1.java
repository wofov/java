
public class clsss1 {
/*�θ�Ŭ���� �� �ڽ�Ŭ���� ����*/
	public static void main(String[] args) {
		//�θ� �ν��Ͻ��� ������ ���� ������ �ڽ� class�� ���� ȣ�� ���� ����. 
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child();//�θ�class.�ڽ�class �̸����� = �θ�Ŭ���� ��.
		
		pc.c_box();
	}

}
class parents{//�θ�Ŭ����
	String a ="ȫ�浿"; //�θ� �ʵ忡 �ִ� �������� 
	String b;
	class child{//�ڽ� Ŭ���� >> ���ȿ� ����Ѵ�.
		int a =20;
		
		public void c_box() {//�ڽ� �޼ҵ�
			double c = 10.5;
			System.out.println(c);//�ڽ� �޼ҵ� ���� ���� �������� 
		    System.out.println(this.a);//�ڽ� Ŭ���� ���� ���� ����
		    System.out.println(parents.this.a);//�θ�Ŭ���� ���� ��������
		    System.out.println(parents.this.b);//�θ�Ŭ�������� �����°� 
		}
	    
	}
	
	public void p_box() {//�θ� �޼ҵ�
        String a="�̼���"; //<�������� 
        this.b=a;//�ڽ� Ŭ���������� ��� ������.
		System.out.println(this.a);//this ��������
	}
	
}