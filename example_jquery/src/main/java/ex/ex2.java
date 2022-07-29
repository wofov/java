package ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex2.do")
//이 놈 사용할 때는 web.xml 사용 안함.
public class ex2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ex2() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pr = response.getWriter();
		String mid = request.getParameter("mid");
		String mpass = request.getParameter("mpass");
		String msex = request.getParameter("msex");
		String sms = request.getParameter("sms");
		//intern 은 null 값을 받지 못함. 
		//애초에 null은 equals 사용 못함.
			if(sms==null) {
				sms="N";
			}
		
		pr.print(mid+"<br>");
		pr.print(mpass+"<br>");
		pr.print(msex+"<br>");
		pr.print(sms+"<br>");
		

	}

}
