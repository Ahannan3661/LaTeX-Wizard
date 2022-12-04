public class Section implements Element
{
	String sectionName;
	String content;
	boolean sub;
	public Section(String sectionName, String content, boolean sub)
	{
		this.sectionName = sectionName;
		this.content = content;
		this.sub = sub;
	}

	@Override
	public String convertToCode() {
		if(sub)
			return "\\subsection{"+sectionName+"}\n"+content+"\n";
		
		return "\\section{"+sectionName+"}\n"+content+"\n";
	}

}
