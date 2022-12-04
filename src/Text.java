
public class Text implements Element {

	String text;
	
	public Text(String text)
	{
		this.text = text;
	}
	@Override
	public String convertToCode() {
		// TODO Auto-generated method stub
		return text+"\n";
	}

}
