package ex;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex4.do")
public class ex4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ex4() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String tel = request.getParameter("usertel");
		System.out.println(tel);
		response.setContentType("text/html; charset=utf-8");
		if(tel=="" || tel==null) {
			response.getWriter().print("error");
		}
		else {	
			Random r = new Random();
			String num;
			String total="";
			int w =1;
			while(w<6) {
				num = Integer.toString(r.nextInt(9));
				total += num;
				w++;
				//바로 가능 함 toString 안해도 된다. 
			}
			response.getWriter().print(total);
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	
	}

}
