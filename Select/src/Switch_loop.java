
public class Switch_loop {

	public static void main(String[] args) {
		String sign="*";
		int total;
		/*
		 case�ȿ� ������ �ݺ��� �ȿ� ����� �� �ֽ��ϴ�.
		 ���� ������ �������� ����ص� �����ϴ�
		 case ������ �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ������ ����
		 ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� ����.
		 */
		switch(sign) {
		case "+" ->{
			int f;
			total = 0;
			for(f=1;f<6;f++) {
				total += f;
			}
			System.out.println("�� 1~5���� ���� ���� "+total);
		}
        case "-" ->{
        	
        	int f;
			total = 0;
			for(f=1;f<6;f++) {
				total -= f;
			}
			System.out.println("�� 1~5���� ���� ���� "+total);
		}
        case "*" ->{
        	total = 1;
        	int f=1;
        	do {
        		total *=f;
        		f++;
        	}while(f<6);
        	System.out.println("�� 1~5���� ���� ���� "+total);
        }
        case "/" ->{
        	total = 0;
        }
       
		}
		

	}

}
