import java.util.ArrayList;
import java.util.Arrays;

//�ߺ� ���̵� üũ �ý��� ����� awt5_abstract�� �Բ� ��� 
//hong, lee, park
public class awt5 {

	public static void main(String[] args) {
		handle hd = new handle();
		hd.signok();
		hd.dataload();
		hd.design();

	}

}
class handle extends awt5_abstract{
	ArrayList<String> db=null;
	private String iddd;//awt���� �ѿ��� �μ����� Ŭ�������� Ȱ��
	private String return_id;
	//awt�� �ٽ� ���� ���� . ���� ���� null��� �ش� ���̵� ��밡�� 
	//���̵��� ����:�ش� ���̵�� ����� �� ����
	@Override
	public String signok() {//getter
		return this.return_id;
	}
	@Override
	public void id_check(String id) {//setter
		this.return_id=null;//�ڡڡڡڡڡڡ��ߺ� ������ ���� �������� �ʱ�ȭ�ڡڡ�
		this.iddd=id;
		this.dataload();//���������� �����Ͱ� �Ѿ���� ��� �ش� �޼ҵ带 �ε��Ͽ� Ȯ�� 
		int ea = this.db.size();
		int w=0;
		while(w<ea) {
			if(this.iddd.equals(this.db.get(w))) {
				this.return_id =this.db.get(w);
				break;
			}
			w++;
		}
		
	}
	@Override
	public void dataload() {
		String ori[]= {"hong","lee","park","jung","kim"};
		this.db=new ArrayList<>(Arrays.asList(ori));
	}
}