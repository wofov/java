import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
		 2�� ����
{ "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" }
������ ���� ������ �ֽ��ϴ�.
�ش� ��ٱ��ϴ� ������ŭ ��ü ���� ����Ͽ� �� ������ �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
[���� 1���� ����]
��� = 250
���� = 200
���� = 700
�� = 2300
��ġĵ = 1100
��� = 850
[������]
�����Ͻð��� �ϴ� �� ���� �ݾ��� :  XXXXX �� �Դϴ�.
�� ���� 1���� ���� ���� ���� �迭�� ���� �����Ͻñ� �ٶ��, �ش� �迭 �⺻���� ���� ���� ������ �ʾƾ� �մϴ�.
���� 1���� ���� ���� ������ ������ java ���Ͽ��� �ε� �Ͽ� �������ñ� �ٶ��ϴ�.
test2.java test2_data.java�� �Բ� �̿��մϴ�.

 */

public class te2 {

	public static void main(String[] args) {
		
		tt t = new tt();
		t.da();
		System.out.println(t.total);//static ���� �θ��� ��� 

	}

}
class tt extends te2_data{
	static int total=0;
	public void da() {
		String r[]= {"���=1"};
		System.out.println(Arrays.asList(this.mo));
		total = 123 +123;
	}
	
}