import java.io.IOException;

public class exception4 {

	public static void main(String[] args) throws IOException{
	try {
		ex e =new ex();
		e.loader("ok");
		//throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻� �ϸ� �ڽ��� ȣ���� class�� return
		
	}catch(Exception e) {
		//Exception e �̰� �۵��ҷ���
		//this.ea = new Exception();
		//throw this.ea; > �̰� �־����. 
		System.out.println(e);
		
	}

	}

}
class ex{
	Exception ea=null;
//	IOException io = null;
	/*//�ڽ��� ������ ���� main Ŭ������ ��� �����ϴ� ��Ȳ//�Ʒ� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ��� */
	public void loader(String a) throws Exception{//throws ���� ���� ���� �޼ҵ忡 try catch �ۼ� �ؾ���.
		//throws try-catch�� �ޱ� ���� class�� �ε�
		//IOE �� fileReader �̷��� ����Ҷ� �־����.(Ư��)
//		if(a=="ok") {
//			
//		}
//		else {
//		
////			int k = Integer.valueOf(a);
////			int keycode = Integer.valueOf(a);
//			//�Ʒ� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ��� 
//			//�ڽ��� ������ ���� main Ŭ������ ��� �����ϴ� ��Ȳ
//			this.ea = new Exception();
//			throw this.ea;
//		}
		try {
			if(a=="ok") {
				int keycode = Integer.valueOf(a);
			}
			else {
				System.out.println("tt");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());//���� ���� Ȯ���غ��� �ϰ� �����°�
			//�ڽ��� ���� ��Ȳ�� ���� �޾Ƽ� Ȯ����. 
			this.ea = new Exception();
			throw this.ea;
			
		}
		
			
		}
}