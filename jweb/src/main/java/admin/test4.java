package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class test4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public test4() {
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String c = request.getParameter("r1").intern();
		System.out.println(c);
		PrintWriter pr = response.getWriter();
		if(c=="도서상품권") {
			pr.print("<script>alert('해당 결제사항은 시스템 점검에 있습니다.'); history.go(-1)</script>");
		}
	
		int a = 2;
		switch(a) {//나중에는 이런식으로 해야함. 
			case 0://도서상품권
				pr.print("<script>"
						+ "alert('에라이');"
						+ "</script>");
			
				break;
			case 1:
				break;
			case 2:
				response.sendRedirect("http://www.naver.com");
				//response.sendRedirect : 강제 페이지 이동 
				break;
			
		
		}
	}

}
