package rs.ac.ni.pmf.oop2;

public class ParserMain
{
	public static void main(String[] args)
	{
		TextParser textParser = new TextParser();
		textParser.setEncoder(new UpperCaseEncoder());
		textParser.setStorage(new StoreInFile());
		textParser.parse("i love mixa");
		TextParser textParser1 = new TextParser();
		textParser1.setEncoder(new LowerCaseEncoder());
		textParser1.setStorage(new StoreOnNetwork());
		textParser1.parse("I HATE NIGGERS");
	}
}
