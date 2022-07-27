package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index7 extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
   
    public index7() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		String u1 = request.getParameter("u1").intern();
		String u2 = request.getParameter("u2").intern();
		pr = response.getWriter();
		System.out.println(u1);
		System.out.println(u2);
		
		String msg = "<script>"
				+ "alert('te')"
						+ "</script>";
				
		
		if(u1!="kim") {
			pr.print("<script>alert('아이디를 확인해주세요'); history.go(-1)</script>");
		}
		else {
			if(u1=="kim" && u2=="a123456") {
				//pr.print("<script>alert('정답'); history.go(-1)</script>");
				//do 관련 페이지로 돌아가지 않고 index7.HTML로 돌아간다.
				pr.print("<script>alert('정답'); location.href='./index5.html'</script>");
			}
			else if(u1=="kim" && u2!="a123456") {
				pr.print("<script>alert('회원정보를 확인해주세요'); history.go(-1)</script>");
			}
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
