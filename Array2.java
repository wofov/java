
public class Array2 {

	public static void main(String[] args) {
		//String id[] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(id[4]);
		//int word = id[4].length();//★★length() < 단어 글자 수 괄호 꼭 
		//System.out.println(word);
		/*
		 응용문제 해당 사용자 리스트 배열이 있다
		 해당 배열값 중 사용자 id 3단어 이상만 출력하시오
		 */
		String id[] = {"hong","kim","park","lee","jang","jung"};
		int a = id.length;//전체 회원수를 파악하기 위함
		int aa = 0;
		int word;//각각의 배열 데이터의 문자 갯수파악
	    while(aa<a) {
	    	word = id[aa].length();//문자 갯수 파악
	    	if(word>3) {//3단어 이상의 데이터 만 출력
	    	//	System.out.println(id[aa]);
	    	}
	    	aa++;
	    }
		/*
		 응용문제 배열데이터 다음과 같음
		 15 60 11 14 27
		 다음 데이터 값을 모두 더해서 최종 결과값을 출력하세요
		 */
		int x[] = {15,60,11,14,27};
		int p = x.length;
		int total=0;
		int z=0;
		while(z<p) {
			total += x[z];
			z++;
		}
		System.out.println(total);

	}

}
