public class JavaCode implements Element
{
	String caption;
	String code;
	
	public JavaCode(String caption, String code)
	{
		this.caption = caption;
		this.code = code;
	}
	
	@Override
	public String convertToCode()
	{ return "\\begin{lstlisting}[language=Java]%, caption="+caption+"]\n\n"+
				code+ "\n"+"\\end{lstlisting}\n";
	}
	
	public String getCaption()
	{
		return caption;
	}
	public String getCode()
	{
		return code;
	}
	
}
