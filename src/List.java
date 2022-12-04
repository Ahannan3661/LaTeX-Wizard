import java.util.ArrayList;

public class List implements Element{
	ArrayList<ListItem> itemList = new ArrayList<ListItem>();

	@Override
	public String convertToCode() 
	{
		String res = "\\begin{enumerate}\n";
		for(int i=0 ; i<itemList.size() ; i++)
		{
			res += itemList.get(i).convertToCode();
		}
		res += "\\end{enumerate}\n";
		return res;
	}
	
	public void addItem(ListItem item)
	{
		itemList.add(item);
	}

	public boolean isEmpty() {
		
		return itemList.isEmpty();
	}

}
