import java.util.ArrayList;

public class asd {

	public static void main(String[] args) {
		String data[]= {"hong45","lee90","kang100","park70","kim72"};
		try {
			total(data);
		}catch(Exception z) {
			System.out.println(z);
		}finally {
			ArrayList<String> rdata = new ArrayList<>();
			int j=0;
			String modify;
			while(j<data.length) {
				modify = data[j].replaceAll("[a-zA-Z]","");
				rdata.add(modify);
				j++;
			}
			String cdata[]=new String[rdata.size()];
					int q=0;
					while(q<rdata.size()) {
						cdata[q]=rdata.get(q);
						q++;
					}
					try {
						total(cdata);
					}catch(Exception h) {
						System.out.println(h.getMessage());
					}
		}
		
	}
	static public void total(String da[])throws Exception{
		int w=0;
		int aa= da.length;
		int values;
		int num=0;
		while(w<aa) {
			values = Integer.valueOf(da[w]);
			num += values;
			w++;
		}
		System.out.println(num);
		Exception e = new Exception();
		throw e;
	}
}