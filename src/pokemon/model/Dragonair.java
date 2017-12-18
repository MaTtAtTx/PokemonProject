package pokemon.model;

public class Dragonair extends Pokemon implements Dragon
{
	public Dragonair(String name, int number)
	{
		super(name, number);
	}
	
	public void roar()
	{
		System.out.print("Roar");
	}
	
	public double breathFire(double heat)
	{
		double temperature = 0.0;
		
		return temperature;
	}
	
	public void fly()
	{
		System.out.print("Fly");
	}
}
