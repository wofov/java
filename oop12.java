import java.util.ArrayList;
import java.util.Arrays;

public class oop12 {

	public static void main(String[] args) {
	
		/*
		 ���빮��
		 ������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88};
		 �ش� ������ �� �� ���� ���� ��� �ǵ��� �� �迭 �Ͻÿ�. 
		 ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� ���� �� ���� �մϴ�.
		 �ش� ���� ���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�. 
		 getter���� �ش� �迭�� �������� �������� �մϴ�.
		 ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */
				Object a1[]= {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88};
				se s = new se();
				s.setter(a1);
			}

		}
		class se{
			ArrayList<String> abc = null;
			ArrayList<Object> a11 = null;
			ArrayList<Object> re = null;
			
			public void setter(Object a2[]) {
				this.a11=new ArrayList<>(Arrays.asList(a2));
				this.abc=new ArrayList<>(Arrays.asList());
				this.re=new ArrayList<>(Arrays.asList());
				try {
					int w=0;
					while(w<a2.length) {
						
						if(this.abc!=this.a11.get(w)) {
							Exception e2 = new Exception();
							throw e2;
						}
						
						w++;
					}
			
					
				}catch(Exception e) {
					System.out.println("��");
				}finally {
					int w1=0;
					int number;
					while(w1<a2.length) {
						Object k=this.a11.get(w1);
						if(number=Integer.parseInt(k.toString(w1))) {
							this.a11.remove(w1);
//							System.out.println(this.a11.get(w1));
							this.a11.add("");
						}
						
						w1++;
					}
					int ww=0;
					while(ww<this.a11.size()) {
						this.re.add(this.a11.get(ww));
						ww++;
					}
					System.out.println(this.re);
					
				}
			}
			
			
			
			
			
			
		}