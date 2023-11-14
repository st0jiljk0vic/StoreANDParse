package rs.ac.ni.pmf.oop2;

public class TextParser
{
	Encoder encoder;
	Storage storage;


	public void setEncoder(Encoder encoder)
	{
		this.encoder = encoder;
	}

	public void setStorage(Storage storage)
	{
		this.storage = storage;
	}

	public void parse(String text)
	{
		String trimmed = text.trim();
		String encoded = encoder.encode(trimmed);
		storage.store(encoded);
	}

}
