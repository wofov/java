
public class Do1 {

	public static void main(String[] args) {
		int a =1;//초기값
		do {
			//System.out.print(a+" ");
			a++;//증가,감사
		}while(a<11);//범위값,종료값
		/*
		 응용문제
		 5~0까지 출력되는 do while작성
		 */
		
		int a1 = 5;
		do {
			//System.out.print(a1+" ");
			a1--;
			
		}while(a1>=0);
		
		int c = 50;
		int d = 60;
		do {System.out.print(c+" ");
			c++;
		}while(c<=d);
		
	}

}
