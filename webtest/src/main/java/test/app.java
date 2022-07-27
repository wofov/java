package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class app extends HttpServlet {
	static String m1;
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
 
    public app() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		pr = response.getWriter();
		String mm = request.getParameter("mid");
		
		System.out.println(mm);
		
		Random r = new Random();
		int a = r.nextInt(9)+1;
		int m1 = Integer.parseInt(mm);
		
		if(a==m1) {
			pr.print("정답");
			
		}
		else {
			pr.print("틀림");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
