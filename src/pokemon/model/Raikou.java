package pokemon.model;

public class Raikou extends Pokemon implements Electric
{
	public Raikou(String name, int number)
	{
		super(name, number);
	}
	
	public void electrocute()
	{
		System.out.print("Electrocute");
	}
	
	public void thunder()
	{
		System.out.print("Thunder");
	}
	
	public void flash()
	{
		System.out.print("Flash");
	}
}
