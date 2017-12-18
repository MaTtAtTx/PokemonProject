package pokemon.model;

public class Dragonite extends Dragonair implements Flying
{
	public Dragonite(String name, int number)
	{
		super(name, number);
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
