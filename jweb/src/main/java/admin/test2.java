package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;


public class test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
  
    public test2() {
     
    }


	public void init(ServletConfig config) throws ServletException {
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
		//response.setContentType("application/x-json; charset=utf-8");
		
		request.setCharacterEncoding("UTF-8");
		//response.setContentType("text/html; charset=utf-8");
		PrintWriter pr = response.getWriter();
		
		String user = request.getParameter("sdate").intern();
		
		
		if(user=="홍길동") {
			List<String> list = new ArrayList<String>();
			list.add("hong");
			list.add("hong@nate.com");
			JSONObject jdata = new JSONObject();
			//실제 배열형태의 구조로 {} 를 생성하기 위해서
			//자바에서는 [] 밖에 없음.
			jdata.put("list", list);
			//기존 값에서 추가로 사용할 때 
			
			response.setContentType("application/x-json; charset=utf-8");
			//배열로 값을 전달할 때
			response.getWriter().print(jdata);
			//call로 보낼 경우 무조건 한번만 사용 
		}
		else {	
			pr.print("error");
		}
		
	
	}

}
