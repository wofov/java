package ex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ex6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int number=0;
    public ex6() {
      
    }

	/*
	 * 초등학교 1학년 1년 앞당겨진다.
	 * 한국 우주 탐사선 '다누리'내달 5일...
	 * 우영우 '열풍' 세계로 번졌다...
	 * 열대야, 폭염계속 제5호 태풍 송다 발달
	 * */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("초등학교 1학년 1년 앞당겨진다.");
		list.add("한국 우주 탐사선 '다누리'내달 5일...");
		list.add("우영우 '열풍' 세계로 번졌다...");
		list.add("열대야, 폭염계속 제5호 태풍 송다 발달");
		int a = list.size();
		//System.out.println(a);
		if(this.number>a-1) {
			this.number=0;
		}
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String n = request.getParameter("num");
		int n1 = Integer.parseInt(n);
		
		//response.getWriter().print(list.get(n1));
		
		response.getWriter().print(list.get(number));
		this.number ++;
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
