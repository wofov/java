package example;

public class Example1 {

	public static void main(String[] args) {
		/*
		 �迭���� +�⺻ �޼ҵ� (������ Ŭ���� ����)
		 1�� �迭�� ������ ���� �ִ�.
		 �迭 ����Ʈ 22,33,44,55,66,77,88,99�̸�
		 �ش� ��ü ���� ��� ���� �� �հ� ���� 
		 ������ �޼ҵ�� ó���ϰ� �ض�
		 �ݺ����� ������ do while.
		 */
		int a []= {22,33,44,55,66,77,88,99};//�迭�� �߰��ϴ� �ڵ�?
		//void = ��ü���� + �ν��Ͻ�(�޸�) ���
		//example pp = new example();
		//pp.data();
		data(a); //static void
		
		}
	public static void data(int aa[]){
		int b=0;
		int ab=aa.length;
	
		int total = 0;
		do {
			total += aa[b];
			b++;
		}while(b<ab);
		System.out.println(total);
		
	}
 

	}

   
    	


