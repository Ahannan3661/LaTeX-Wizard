public class ListItem implements Element
{
	String content;
	Element element = null;
	
	public ListItem(String content)
	{
		this.content = content;
	}
	
	public void addElement(Element element)
	{
		this.element = element;
	}

	@Override
	public String convertToCode() 
	{
		if(element == null)
		return "\t\\item "+content+"\n";
		return "\t\\item "+content+"\n"+element.convertToCode();
	}
	
	

}
