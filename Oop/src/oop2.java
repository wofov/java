import java.util.Arrays;

/*�迭 �ű� �������� ��Ȯ�ϰ� �����Ͽ� �ű� �迭�� �����ϱ�.*/
public class oop2 {

	public static void main(String[] args) {
		array1 ar = new array1();
		
	}

}
class array1{
	private int ar1[];//={1,2,3,4,5,6,7};
	private int ea;
	public array1() {
	
		//�迭�� �ʵ忡 �ִ� ���� �������� ó���ϴ� ���
		this.ar1= new int[] {1,2,3,4,5,6,7};
		this.ea= this.ar1.length;
		//5�̻��� �迭���� ��������
		int w = 0 ;
		String newdata ="";
		while(w<ea){
			if(this.ar1[w]>=5) {
				newdata +=this.ar1[w]+",";
				//�ش� ���ǿ� �´� ���� ���ڿ��� ��ȯ�Ͽ� ���� �ϴ� ���.
			}
			w++;
		}
		String ar2[]=newdata.split(",");
		int ar2_ea=ar2.length;
		int oridata[]=new int[ar2_ea];
		System.out.println(Arrays.toString(ar2));
		System.out.println(ar2_ea);
		//���ڿ� ������ŭ �迭 ������ ���� �߰��ϰ� �˴ϴ�. 
		int ww=0;
		while(ww<ar2_ea) {
			oridata[ww]= Integer.parseInt(ar2[ww]);
			ww++;
			
		}
		System.out.println(Arrays.toString(oridata));
		
	}
	
}