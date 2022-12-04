public class HyperText implements Element
{
	String text;
	String link;
	String description;
	
	public HyperText(String text, String link, String description)
	{
		this.text = text;
		this.link = link;
		this.description = description;
	}

	@Override
	public String convertToCode() 
	{
		return text+" \\href{"+link+"}{"+description+"}\n";
	}
	
	

}
