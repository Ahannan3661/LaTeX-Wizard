import java.time.LocalDate;

public class Title implements Element
{
	//Tag large = new Tag();
	String title;
	String subTitle;
	LocalDate  date;
	String author;
	
	
	public Title(String title, String subTitle, String author, LocalDate  date)
	{
		this.title = title ;
		this.subTitle = subTitle;
		this.date = date;
		this.author = author;
	}
	@Override
	public String convertToCode() {
			return "\\title{"+title+"\\\\ \\vspace{5mm}\n\t\\large "+subTitle+"}\n"+
					"\n\\author{"+author+"}\n\\date{Dated: "+date+"}\n";
	}
	
	public String getTitle()
	{
		return title;
	}
	public String getSubTitle()
	{
		return subTitle;
	}
	public LocalDate  getdate()
	{
		return date;
	}
	public String getAuthor()
	{
		return author;
	}
	

}
