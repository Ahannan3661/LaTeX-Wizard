import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Document 
{
	public static Document document = new Document();
	Title title = null;
	ArrayList<Element> allItems = new ArrayList<Element>();
	FileWriter fw;
	
	private Document()
	{
	}
	
	public void addAll(ArrayList<Element> array)
	{
		allItems.addAll(array);
	}
	
	public void setTitle(Title title)
	{
		this.title = title;
	}
	
	public Title getTitle()
	{
		return this.title;
	}
	
	public boolean titleIsNull()
	{
		return this.title == null;
	}
	
	public void empty()
	{
		allItems.clear();
	}
	
	public void addItem(Element item)
	{
		allItems.add(item);
	}
	
	public void writeCode() throws IOException
	{
		//create or open LatexCode.tex file (this file contains the code that can be used 
		//to create a PDF
		this.fw = new FileWriter("LatexCode.tex",false);
		
		//writing the imports
        fw.write("\\documentclass[a4paper]{article}\n" +
        "\n" +
        "\\usepackage[english]{babel}\n" +
        "\\usepackage[utf8]{inputenc}\n" +
        "\\usepackage{amsmath}\n" +
        "\\usepackage{graphicx}\n" +
        "\\usepackage[colorinlistoftodos]{todonotes}\n" +
        "\\usepackage[obeyspaces]{url}\n" +
        "\\usepackage{hyperref}\n" +
        "\n" +
        "\\usepackage{setspace}\n" +
        "\\usepackage{listings}\n" +
        "\\usepackage{xcolor}\n" +
        "\n" +
        "\\definecolor{codegreen}{rgb}{0,0.6,0}\n" +
        "\\definecolor{codeblue}{rgb}{0,0,0.6}\n" +
        "\\definecolor{codegray}{rgb}{0.5,0.5,0.5}\n" +
        "\\definecolor{codepurple}{rgb}{0.58,0,0.82}\n" +
        "\\definecolor{backcolour}{rgb}{0.95,0.95,0.92}\n" +
        "\n" +
        "\\lstset{language=Java,\n" +
        "	backgroundcolor=\\color{backcolour},\n" +
        "	backgroundcolor=\\color{backcolour},   \n" +
        "	commentstyle=\\color{codegreen},\n" +
        "	keywordstyle=\\color{magenta},\n" +
        "	numberstyle=\\tiny\\color{codegray},\n" +
        "	stringstyle=\\color{codepurple},\n" +
        "	basicstyle=\\ttfamily\\footnotesize,\n" +
        "	breakatwhitespace=false,         \n" +
        "	breaklines=true,                 \n" +
        "	captionpos=b,                    \n" +
        "	keepspaces=true,                 \n" +
        "	numbers=left,                    \n" +
        "	numbersep=5pt,                  \n" +
        "	showspaces=false,                \n" +
        "	showstringspaces=false,\n" +
        "	showtabs=false,                  \n" +
        "	tabsize=2\n" +
        "}\n" + 
        "\n");
        
        //writing the title code
        fw.write(title.convertToCode());
        
        //document start
        fw.write(	"\n\\begin{document}\n"
        			+ "\\maketitle\n\n");
        
        //loop to write the code of every "Element" in "allItems" list
        for(int i=0 ; i<allItems.size(); i++)
        {
        	fw.write(allItems.get(i).convertToCode());
        }
        
        //document end
        fw.write("\n\\end{document}");
        
        //file writer close
        fw.close();
	}

	public static Document getInstance() {
		
		return document;
	}

}
