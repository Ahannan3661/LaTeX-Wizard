public class Path implements Element
{
	String path;
	
	public Path(String path)
	{
		this.path = path;
	}
	
	@Override
	public String convertToCode() {
		// TODO Auto-generated method stub
		return "\\path{"+path+"}\n";
	}

}
