package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsons {

	public static void main(String[] args){
		
		try {
			//JSONParser jp = new JSONParser();
			//FileReader rd = new FileReader("index3.json");
			FileInputStream fi = new FileInputStream("C:\\web\\webtest\\src\\main\\webapp\\index3.json");
			InputStreamReader is = new InputStreamReader(fi,"UTF8");
			//Object ob = (JSONObject)jp.parse(is);
			//JSONObject ob2 = ; 
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject)jp.parse(is);
			System.out.println(jo);
			is.close();
			fi.close();
		}catch(Exception e) {
			
		}

	}

}
