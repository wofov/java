import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 �ܺ� Ŭ���� ����
		 ���빮��
		 �����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ����Դϴ�.
		 �ش� �޴��� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ�ϴ�
		 (y,n)���� �մϴ�
		 �ش� Ȱ��ȭ ���� �����Ͽ� "y"�� ����Ǵ� �ε��� ��ȣ�� �´�
		 �޴����� 1�� �迭�� �籸�� �� ���ο��� ��� �ǵ��� �մϴ�.
		 ��� : ["���Ϲ��","����������","���ڽ�","�̺�Ʈ""�߼�"]
		 �� private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��Ѵ�.
		 */
		menus me = new menus();
		System.out.println(Arrays.toString(me.get()));
	}
}
class menus{
	private String mdata[][];
	private String rdata[];
	String a;
	public menus() {
		String ms[][]= {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"y","y","n","y","y","n","y"}
		};
		this.mdata=ms;
		//System.out.println(Arrays.toString(this.mdata[1]));
		//2�� �迭 ����� ������ ���� this.mdata�� �ۼ��ϸ� �ȵ�
		redata();//�����
	}
	public void redata() {
		int w = 0 ;
		int ea = this.mdata[0].length;
		int ct = 0 ;
		String ww[] = new String[ea];
		
		do {
			if(this.mdata[1][w]=="y") {
				ww[ct]=this.mdata[0][w];
				ct++;
			}
			w++;
		}while(w<ea);
		//String rdata[]=new String[ct]; �ʿ� ���� �ڵ�.
		this.rdata=ww;
	}
	public String[] get() {
		return this.rdata;
	}
}