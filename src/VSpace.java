public class VSpace implements Element
{
	//in millimeters
	int space;
	
	public VSpace(int space)
	{
		this.space = space;
	}

	@Override
	public String convertToCode() {
		
		return "\\vspace{"+space+"mm}\\\\\n";
	}
}
