package example;

public class Example1 {

	public static void main(String[] args) {
		/*
		 배열문제 +기본 메소드 (별도의 클래스 제외)
		 1차 배열에 다음과 같이 있다.
		 배열 리스트 22,33,44,55,66,77,88,99이며
		 해당 전체 값을 모두 더한 총 합계 값을 
		 별도의 메소드로 처리하게 해라
		 반복문은 무조건 do while.
		 */
		int a []= {22,33,44,55,66,77,88,99};//배열을 추가하는 코드?
		//void = 객체생성 + 인스턴스(메모리) 등록
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

   
    	


