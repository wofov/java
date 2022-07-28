package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class test5 extends HttpServlet {
	PrintWriter pr = null;
	String key= null;
	private static final long serialVersionUID = 1L;
       
    
    public test5() {
    	String key= null;
    }

	//url에 직접적으로 접속하였을 경우 doget 무조건 발생
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		pr=response.getWriter();
		//String key = request.getParameter("").intern();
		
		if(this.key=="" || this.key==null) {
			//해당 키값은 기본으로 null 처리함
			pr.print("<script>"
					+ "alert('올바른 접근방식 아님');"
					+ "history.go(-1);"
					+ "</script>");
		}

	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		pr=response.getWriter();
		String key = request.getParameter("key").intern();
		if(key=="" || key==null) {
			pr.print("<script>"
					+ "alert('올바른 접근방식 아님);"
					+ "history.go(-1);"
					+ "</script>");
		}
		else if(key=="loginpost") {
			//키 값이 맞을 경우 
			String mid = request.getParameter("mid");
			String mpass = request.getParameter("mpass");
			//System.out.println(mid+" "+mpass);
			//Database 연결
		}
		
	}

}
