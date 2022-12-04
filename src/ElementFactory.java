import java.time.LocalDate;

public class ElementFactory 
{
	public static Element createList()
	{
		return new List();
	}
	public static Element createVSpace(int size)
	{
		return new VSpace(size);
	}
	public static Element createJavaCode(String caption, String code)
	{
		return new JavaCode( caption, code);
	}
	public static Element createText(String text)
	{
		return new Text(text);
	}
	public static Element createListItem(String content)
	{
		return new ListItem(content);
	}
	public static Element createSection(String sectionName, String content, boolean sub)
	{
		return new Section(sectionName, content, sub);
	}
	public static Element createHyperText(String text, String link, String description)
	{
		return new HyperText( text, link, description);
	}
	public static Element createPath(String path)
	{
		return new Path(path);
	}
	public static Element createTitle(String title, String subTitle, String author, LocalDate  date)
	{
		return new Title(title, subTitle, author, date);
	}
}
