package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      static String mm;
 
    public index11() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		String mid = request.getParameter("mid");
		String key = request.getParameter("key").intern();
		if(key!="123456") {
			this.mm= null;
			pr.print("error" + this.mm);
			
		}
		else {
			this.mm=mid;
			pr.print(mid);
			System.out.println(mid);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
