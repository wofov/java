
public class Method81 {

	public static void main(String[] args) {
		/*
		 ���빮�� ���� ���α׷��Ӱ� �ش� db�� �� �� 
		 Ȧ�� ���� ���� �� ������ �ް��� �մϴ�.
		 �ش� ������ ��� �� �� �ֵ��� �ڵ带 �ۼ��ϼ���. 
		 */
		oddd pp=new oddd();
		System.out.println(pp.aaa());

	}

}
class oddd{
	private int ori[];//�迭���� ������� �ʵ��� ���
	private int count=0;//Ȧ�� �� ��� +1�� ���� �ϱ� ���� �ʵ� ������
	public oddd() {		
		int odata2[]= {15,22,17,14,32,35,19,33};
		this.ori=odata2;
	//	aaa();
	
	
	}
	public int aaa() {
		int w=0;
		int ea=this.ori.length;
		while(w<ea) {
			if(this.ori[w]%2==1) {
				this.count++;//Ȧ���̸� +1�� ���� 
			}
			w++;
		}
		return this.count;//���� ���� return��Ŵ
	}
	
	
}