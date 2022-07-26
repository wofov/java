package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/index4")
public class index4 extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
    
    public index4() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		//System.out.println(request.getMethod());
		//html에서 post, get, put인지 확인기 가능함
		
		String m = request.getParameter("userid").intern();
		//System.out.println(m);
		pr =response.getWriter();
		if(m=="") {
			//this.pr.print : ajax post,get 으로 넘어올때 응답만 받아야 할 경우 
			pr.print("error");
		}
		else if(m=="hong") {//아이디가 중복 되었을때 ajax return
			pr.print("no");
		}
		else  { //아이디가 중복 되지 않았을 때 ajax return
			pr.print("ok");
		}
		
		
		
		
		
		//doGet(request, response);
	}

}
