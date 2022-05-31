import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		/*
		 응용문제 
		 장바구니에 여러 개의 상품이 담겨져 있습니다
		 그 중 택배비만 별도로 측정되는 금액만 추출하세요
		 택배비는 30000 이상 (포함)
		 15000 48000 67000 8000 118200 49800 6000 18700
		 
		 결과 [48000 67000 118200 49800] < 괄호 있을때 배열 만들어 출력
		 */
		int a[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int b[] = new int[4];
		int a1 = a.length;
		int aa = 0;
		int ct = 0;
		while(aa<a1) {
			if(a[aa]>=30000) {
				b[ct]=a[aa];
				ct++;
			}
			aa++;
		}
		System.out.println(Arrays.toString(b));
		
		/*
		응용문제 {"햄버거","피자","치킨","커피"}
		주문하고자 하는 음식을 선택하세요 < 질문
		해당 질문을 총 4번 물어봅니다
		단, "주문종료"라고 입력시 즉시 주문 종료되며,
		주문내역을 출력.
		 */
		String z[] = {"햄버거","피자","치킨","커피"};
		String bbb[] = new String[4];
	    Scanner sc = new Scanner(System.in);
	    String zzz;
		int y =z.length;
		int abc = 0 ;
		int ctt = 0;
		while(abc<y) {
			System.out.println("주문 메뉴를 선택하세요");
			zzz = sc.next();
			
				if(zzz.equals("햄버거")||zzz.equals("피자")||zzz.equals("치킨")||zzz.equals("커피")) {
					bbb[ctt]=z[abc];
					ctt++;
				}
				else if(zzz.equals("주문종료")) {
					break;
				}
			
			abc++;
		}
		System.out.println(Arrays.toString(bbb));
		
		
		
		
		
		

	}

}
