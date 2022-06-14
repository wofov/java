package Ab2;

public interface home {

	int dk=80;//80이상되면 고장으로 처리 
	public void poweron();//가동
	public void poweroff();//꺼짐
	public void broken(int n);//고장
	
}
