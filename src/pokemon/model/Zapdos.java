package pokemon.model;

public class Zapdos extends Pokemon implements Electric,Flying
{
	public Zapdos(String name, int number)
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
	
	public void soar()
	{
		System.out.print("Soar");
	}
	
	public double hurricane(double wind)
	{
		double windSpeed = 0.0;
				
		return windSpeed;
	}
	
	public void twister()
	{
		System.out.print("Twister");
	}
}
