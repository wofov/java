import java.util.Scanner;

public class ex1 {
/*http://mekeyace.dothome.co.kr/movie_db.txt
 해당 사용자가 영화 제목을 검색합니다.
 해덩 영화 제목 맞는 데이터 값이 있을 경우 
 영화 전체에 대한 정보를 출력 하게 됩니다.
 힌트 : 스캐너로 사용
 "검색할 영화 제목을 입력하세요"
 -범죄도시
 [범죄도시]-추천5 2022년 4월 개봉 
 
 없을시
 검색한 영화는 확인 되지 않습니다. 
 경관의 피 - 추천 3 2022년 1월 5일 개봉
특송 - 추천 3 2022년 1월 개봉
블루버스데이 - 추천 2 2022년 1월 19일 개봉
킹메이커 - 추천 2 2022년 1월 26일 개봉
해적: 도깨비 깃발 - 추천 3 2022년 1월 26일 개봉
뜨거운 피 - 추천 3 2022년 3월 23일 개봉
야차 - 추천 3 2022년 3월 8일 개봉
범죄도시 2 - 추천 5 2022년 5월 11일 개봉
딥워터 - 추천 3 2022년 1월 14일 개봉
모비우스 - 추천 2 2022년 1월 28일 개봉
언챠티드 - 추천 4 2022년 2월 18일 개봉
앰블런스 - 추천 3 2022년 2월 18일 개봉
더 배트맨 - 추천 2 2022년 3월 4일 개봉
닥터 스트레인지 인더 멀티버스 오브 매드니스 - 추천 5 2022년 3월 25일 개봉
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목은?");
		String user=sc.next();
		mo1 m = new mo1();
		m.a2(user);
		System.out.println(m.a3());
		sc.close();
	}
}
abstract class mo{
	public abstract void a1();
	public abstract void a2(String aa);
	public abstract String a3();
	String movie[][];
}
class mo1 extends mo{
	int ea ;
	String msg="";
	public void a2(String aa) {
		a1();
		int w=0;
		boolean ok =false;
		while(w<this.ea) {
			if(this.movie[w][0].indexOf(aa)!=-1) {
				this.msg = this.movie[w][0];
				ok=true;
			}
			w++;
		}
		if(ok==false) {
			this.msg = "검색한 영화는 없음";
		}
	}
	public String a3() {
		return this.msg;
	}
	public void a1() {
		this.movie=new String[][] {
			{"경관의 피 - 추천 3 2022년 1월 5일 개봉"},
				{"특송 - 추천 3 2022년 1월 개봉"},
					{"블루버스데이 - 추천 2 2022년 1월 19일 개봉"},
						{"킹메이커 - 추천 2 2022년 1월 26일 개봉"},
				{"해적: 도깨비 깃발 - 추천 3 2022년 1월 26일 개봉"},
				{"뜨거운 피 - 추천 3 2022년 3월 23일 개봉"},
			{"야차 - 추천 3 2022년 3월 8일 개봉"},
			{"범죄도시 2 - 추천 5 2022년 5월 11일 개봉"},
			{"딥워터 - 추천 3 2022년 1월 14일 개봉"},
			{"모비우스 - 추천 2 2022년 1월 28일 개봉"},
			{"언챠티드 - 추천 4 2022년 2월 18일 개봉"},
			{"앰블런스 - 추천 3 2022년 2월 18일 개봉"},
			{"더 배트맨 - 추천 2 2022년 3월 4일 개봉"},
			{"닥터 스트레인지 인더 멀티버스 오브 매드니스 - 추천 5 2022년 3월 25일 개봉"}
		};
		this.ea=this.movie.length;
	}
}
