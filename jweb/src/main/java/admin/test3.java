package admin;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class test3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public test3() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		ArrayList<String> ck = new ArrayList<String>();
		 //name 값이 모두 다를때
		
//		int w=1;   
//		while(w<=5) {
//			
//			ck.add(request.getParameter("like"+w));
//			w++;
//		}
//		System.out.println(ck);
		
		//name명이 모두 같을 때
		//getParameterValues : name값이 같은 경우이며, 값이 다른 상황이며, 해당
		//값만 추출하여 배열로 생성함. 
		String like[] = request.getParameterValues("like");
		//System.out.println(like.length);
		System.out.println(Arrays.toString(like));
//		int w = 0;
//		while(w<like.length) {
//			System.out.println(like[w]);
//			w++;
//		}
		
		
	}

}
