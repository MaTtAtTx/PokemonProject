package pokemon.model;

public class Raikou extends Pokemon implements Electric
{
	public Raikou(String name, int number)
	{
		super(name, number);
	}
	
	public double electrocute(double voltage)
	{
		double volts = 0.0;
		
		return volts;
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
