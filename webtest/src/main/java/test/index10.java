package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index10 extends HttpServlet {
	//PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
 
    public index10() {
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pr = response.getWriter();
		
		String addr1 = request.getParameter("addr");
		String addr2 = request.getParameter("addr2");
		String addr3 = request.getParameter("addr3");
		pr.print(addr1 + " " +addr2+ " " +addr3);
		//System.out.println(addr1 + " " +addr2+ " " +addr3);
	}

}
