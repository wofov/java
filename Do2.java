
public class Do2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 9;//산술 고정값
		int c;
		do {c = a*b;
			//System.out.print(c+" ");
			a++;
		}while(a<10);
		/*
		 다음 결과값을 보고 do while 코드로 작성하시오
		 35 45 55 65 75 
		 */
		int a1=1;
		int b1;
		do {b1=a1*10 + 25;
		System.out.print(b1 + " ");
			a1++;
		}while(a1<6);
		

	}

}
