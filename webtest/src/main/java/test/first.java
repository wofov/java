package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


//@WebServlet("/first")
public class first extends HttpServlet {
	PrintWriter pr = null;//javascript 사용할 수 있음. 
	private static final long serialVersionUID = 1L;
 
    public first() {
      
       
    }

	public void init(ServletConfig config) throws ServletException {
		
	}

	//doGet : front 에서 GET으로 전송, 또는 ajax에서 get으로 전송
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request : get,post 전송된 정보 데이터를 말한다.
		//response : 결과값을 출력하는 형태 
		request.setCharacterEncoding("utf-8"); //ajax 또는 form에서 넘어온 문자를 인코딩 
		response.setContentType("text/html;charset=utf-8");
		String mid = request.getParameter("mid").intern();
		System.out.println(mid);
		
//		jsons js = new jsons();
//		js.main(null);
		JSONParser jp = new JSONParser();
		try {
//			FileInputStream fi = new FileInputStream("C:\\web\\webtest\\src\\main\\webapp\\index3.json");
//			InputStreamReader is = new InputStreamReader(fi,"UTF8");
//			//JSONParser jp = new JSONParser();
//			JSONObject jo = (JSONObject)jp.parse(is);
//			System.out.println(jo);
//			is.close();
//			fi.close();
			
			
			URL url = new URL("http://wofov.cafe24.com/webtest/index3.json");
			InputStream in = url.openStream();//openStream : URL 전용
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in,Charset.forName("utf-8")));
			pr = response.getWriter();
			//InputStream is InputStreamReader(in,"utf-8"); //이런식으로도 가능
			int a;
			//String(문자열) : 변경 불가능한 문자열 또는 생성
			//StringBuilder(문자열) : 문자만 생성
			StringBuilder sb = new StringBuilder();
				while((a=br.read())!=-1) {
					sb.append((char)a);
				}
			
				String data = sb.toString();
				/*
				 JSON,XML 파일은 숫자, 문자가 무조건 혼합되어있음.
				 JSONObject : json parse를 사용할 때 적용됩니다.
				 JSONArray : 배열에 대표 키가 있을 경우 			 
				 */
				JSONObject js = (JSONObject)jp.parse(data);
				JSONArray ba = (JSONArray)js.get("members"); //"members 대표키  .get(키 이름)
				System.out.println(ba.size());
				int w = 0 ;
				while(w<ba.size()) {
					JSONObject d=(JSONObject)ba.get(w); //각각의 키가 존재 하므로 
					//System.out.println(d.get("area").toString());
					String mid2 = d.get("id").toString().intern();
					//System.out.println(d.get("name").toString());
					//System.out.println(d.get("phone").toString());
					if(mid2==mid) {
						pr.print("<script>alert('해당 아이디 확인'); history.go(-1)</script>");
						pr.close();
					}
					
					w++;
				}
				in.close();
				br.close();
//			byte[] b = new byte[1024*20];
//			while(true) {
//				int a = in.read(b);
//				if(a==-1) {
//					break;
//				}
//				else {
//					String data = new String(b,0,a,"UTF8");
//					System.out.println(data);
//				}
//				
//			}
				
		}catch(Exception e) {
			
		}

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	//doPost : front에서 POST로 전송, 또는 ajax에서 post 전송 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//doGet(request, response);
	}

	
}
